/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Kanto
 */
public class DBTable {

    public String toUpper(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    public void create(Connection con) throws Exception {
        boolean fermeo = false;
        if (con == null) {
            con = Connexion.getConnexion();
            fermeo = true;
        }
        PreparedStatement stmt = null;
        try {
            String nomTable = getClass().getSimpleName();
            String[] lesAttributs = new String[getClass().getDeclaredFields().length];
            String tousLesAtr = new String();
            String allValues = new String();

            for (int i = 0; i < lesAttributs.length; i++) {
                lesAttributs[i] = getClass().getDeclaredFields()[i].getName();
                lesAttributs[i] = toUpper(lesAttributs[i]);
                Object attributValue = getClass().getMethod("get" + lesAttributs[i]).invoke(this);
                tousLesAtr += lesAttributs[i];

                if ((attributValue == null && i == 0) || (attributValue instanceof Integer && (int) attributValue == 0) && i == 0) {
//                    allValues += "concat('" + seqName + "',nextval('s_" + nomTable + "'))";
                } else if (attributValue != null) {
                    allValues += "'" + attributValue.toString() + "'";
                } else if (attributValue == null && i != 0) {
                    allValues += "null";
                }

                if (i < lesAttributs.length - 1) {
                    tousLesAtr += ",";
                    allValues += ",";
                }
            }
            String requete = "insert into " + nomTable + " (" + tousLesAtr + ") values (" + allValues + ")";
            // System.out.println(requete);
            stmt = con.prepareStatement(requete);
            stmt.executeUpdate();
        } catch (Exception e) {
            throw e;

        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (fermeo) {
                con.close();
            }
        }
    }

    public void delete(Connection con) throws Exception {
        String req = "delete from " + getClass().getSimpleName() + " where ";
        String[] lesAttributs = new String[getClass().getDeclaredFields().length];

        for (int i = 0; i < lesAttributs.length; i++) {
            lesAttributs[i] = getClass().getDeclaredFields()[i].getName();
            lesAttributs[i] = toUpper(lesAttributs[i]);
            Object attributValue = getClass().getMethod("get" + lesAttributs[i]).invoke(this);

            if (attributValue != null) {
                req += lesAttributs[i] + "=";
                req += "'" + attributValue.toString() + "'";
            } else {
                req += lesAttributs[i];
                req += " is null";
            }
            if (i < lesAttributs.length - 1) {
                req += " and ";
            }
        }
        System.out.println("requete "+req);
        PreparedStatement stmt = con.prepareStatement(req);
        stmt.executeUpdate();
    }

    public void update(Connection con) throws Exception {
        String req = "update " + getClass().getSimpleName() + " set ";
        String[] attributsName = new String[getClass().getDeclaredFields().length];
        int count = 0;
        if (con == null) {
            con = Connexion.getConnexion();
        }
        for (int i = 0; i < attributsName.length; i++) {
            attributsName[i] = getClass().getDeclaredFields()[i].getName();
            attributsName[i] = toUpper(attributsName[i]);
            Object attributsValues = getClass().getMethod("get" + attributsName[i]).invoke(this);

            if ((attributsValues instanceof String && attributsValues != null) || (attributsValues instanceof Integer && (int) attributsValues != 0)) {
                if (count == 0) {
                    req += attributsName[i] + "=" + "'" + attributsValues.toString() + "'";
                }
                if (count > 0) {
                    req += "," + attributsName[i] + "=" + "'" + attributsValues.toString() + "'";
                }
                count++;
            }
        }

        req += " where ";
        for (int i = 0; i < attributsName.length; i++) {
            attributsName[i] = getClass().getDeclaredFields()[i].getName();
            attributsName[i] = toUpper(attributsName[i]);
            Object attributValue = getClass().getMethod("get" + attributsName[i]).invoke(this);

            if (attributsName[i].equalsIgnoreCase("Id")) {
                req += attributsName[i] + "=";
                req += "'" + attributValue.toString() + "'";
            }
        }
        System.out.println(req);
        PreparedStatement stmt = con.prepareStatement(req);
        stmt.executeUpdate();
        if (con != null || stmt != null) {
            con.close();
            stmt.close();
        }
    }

    public DBTable getDbObject(ResultSet r) throws Exception {
        Object DBTable = getClass().newInstance();

        Field[] attrObj = getClass().getDeclaredFields();
        String[] nomAttr = new String[getClass().getDeclaredFields().length];

        for (int i = 0; i < attrObj.length; i++) {
            nomAttr[i] = attrObj[i].getName();
            Class classType = attrObj[i].getType();
            String allType = classType.getSimpleName();
            Object resultDb = new Object();

            try {
                resultDb = r.getString(nomAttr[i]);
                if (resultDb != null) {
                    if (allType.equalsIgnoreCase("int")) {
                        resultDb = Integer.parseInt((String) resultDb);
                    } else if (allType.equalsIgnoreCase("double")) {
                        resultDb = Double.parseDouble((String) resultDb);
                    } else if (allType.equalsIgnoreCase("Boolean")) {
                        resultDb = r.getBoolean(nomAttr[i]);
//                        resultDb  = Boolean.parseBoolean((String)resultDb);
//                        System.out.println("IzYYYYYYYYYYYYYYYYYYYy "+resultDb);
                    } else if (allType.equalsIgnoreCase("Date")) {
                        resultDb = Date.valueOf((String) resultDb);
//                        System.out.println("IzYYYYYYYYYYYYYYYYYYYy "+resultDb);
                    } else {
                        resultDb = (String) resultDb;
                    }
                    DBTable.getClass().getMethod("set" + toUpper(nomAttr[i]), classType).invoke(DBTable, resultDb);
                }
            } catch (java.sql.SQLException ee) {
            }

        }
        return (DBTable) DBTable;
    }

    public ArrayList find(String requete, Connection con) throws Exception {
        boolean fermeo = false;
        if (con == null) {
            con = Connexion.getConnexion();
            fermeo = true;
        }
        java.sql.Statement stmt = null;
        ResultSet res = null;
        ArrayList DBTable = new ArrayList();
        try {
            stmt = con.createStatement();
            res = stmt.executeQuery(requete);
            System.out.println("requete " + requete);
            while (res.next()) {
                DBTable.add(getDbObject(res));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (res != null) {
                res.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (fermeo) {
                con.close();
            }
        }
//        DBTable[] allDb = new DBTable[DBTable.size()];
//        for (int i = 0; i < allDb.length; i++) {
//            allDb[i] = ((DBTable) DBTable.elementAt(i));
//        }
        return DBTable;
    }

    public DBTable() {

    }

    public String[] getData(String requete, String[] attributs, Connection con) throws Exception {
        ArrayList db = this.find(requete, con);
        String[] str = new String[db.size()];
        Class c = this.getClass();
        for (int i = 0; i < db.size(); i++) {
            String s = new String();
            for (int j = 0; j < attributs.length; j++) {
                Method m = c.getMethod("get" + attributs[j]);
                String v = String.valueOf(m.invoke(db.get(i)));
                if (j != attributs.length - 1) {
                    s = s + v + "-";
                } else {
                    s = s + v;
                }
            }
            str[i] = s;
        }
        return str;
    }

    public ArrayList findPagination(String requete, String condition, Connection con) throws Exception {
        boolean fermeo = false;
        if (con == null) {
            con = Connexion.getConnexion();
            fermeo = true;
        }
        java.sql.Statement stmt = null;
        ResultSet res = null;
        ArrayList DBTable = new ArrayList();
        try {
            stmt = con.createStatement();
            System.out.println("SQL " + requete + condition);
            res = stmt.executeQuery(requete + condition);

            while (res.next()) {
                DBTable.add(getDbObject(res));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (res != null) {
                res.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (fermeo) {
                con.close();
            }
        }
//        DBTable[] allDb = new DBTable[DBTable.size()];
//        for (int i = 0; i < allDb.length; i++) {
//            allDb[i] = ((DBTable) DBTable.elementAt(i));
//        }
        return DBTable;
    }

    public String[] getDataPag(String requete, String condition, String[] attributs, Connection con) throws Exception {
        ArrayList db = this.findPagination(requete, condition, con);
        String[] str = new String[db.size()];
        Class c = this.getClass();
        for (int i = 0; i < db.size(); i++) {
            String s = new String();
            for (int j = 0; j < attributs.length; j++) {
                Method m = c.getMethod("get" + attributs[j]);
                String v = String.valueOf(m.invoke(db.get(i)));
                if (j != attributs.length - 1) {
                    s = s + v + "-";
                } else {
                    s = s + v;
                }
            }
            str[i] = s;
        }
        return str;
    }
    
     public void suppression(String nomtable,int id) throws Exception {
         Connexion conn = new Connexion();
        Connection con = null;
        Statement stmt = null;
        String sql = "delete from "+nomtable+" where id=" + id;
        try {
            con = conn.getConnexion();
            stmt = con.createStatement();
            //stmt.setInt(1, id);
            stmt.executeUpdate(sql);
            //System.out.println(stmt);
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {

            stmt.close();
            con.close();
        }
    }
}
