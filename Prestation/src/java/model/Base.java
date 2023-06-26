/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.Connexion;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kanto
 */
public class Base {
    Connexion conn = new Connexion();
    int isa = 0;

    public boolean isNumber(String valeur) {
        boolean isANumber = true;
        try {
            Integer.parseInt(valeur);
        } catch (NumberFormatException nfe) {
            isANumber = false;
        } finally {
            return isANumber;
        }
    }

    public boolean isDouble(String valeur) {
        boolean isADouble = true;
        try {
            Double.valueOf(valeur);
        } catch (NumberFormatException nfe) {
            isADouble = false;
        } finally {
            return isADouble;
        }
    }

    public boolean isDate(String valeur) {
        boolean isADate = true;
        try {
            Date.valueOf(valeur);
        } catch (java.lang.IllegalArgumentException en) {
            isADate = false;
        } finally {
            return isADate;
        }
    }

    public String verifieType(String valeur) {
        String verification = null;
        boolean number = this.isNumber(valeur);
        boolean daty = this.isDate(valeur);
        boolean doublee = this.isDouble(valeur);
        if (number == true) {
            verification = "int";
        } else if (daty == true) {
            verification = "date";
        } else if (doublee == true) {
            verification = "double";
        } else {
            verification = "string";
        }
        return verification;
    }

    public void insert(Object objet) throws SQLException, Exception {
        Class classe = objet.getClass();
        String nomC = classe.getSimpleName();
        System.out.println("nom classe " + nomC);
//
        Method[] fonction = classe.getDeclaredMethods();
        String sql = "insert into " + nomC + "(";
        Field[] attribut = classe.getDeclaredFields();
        Field[] attributC = classe.getDeclaredFields();
        System.out.println(attribut.length);
        for (int i = 0; i < attribut.length; i++) {
            System.out.println(fonction[i].getName());
            if (attribut[i].getName().equals("id")) {
                System.out.println("aataattttrrrrr" + attribut[i].getType().getName());
                System.out.println("tsy alainy io");
            } else {
                sql = sql + attribut[i].getName() + ",";
            }
        }
        sql = sql.substring(0, sql.length() - 1) + ") values (";
        for (int i = 0; i < attribut.length - 1; i++) {
            sql = sql + "?,";
        }
        sql = sql.substring(0, sql.length() - 1) + ");";
        System.out.println(sql);
        Connection c = null;
        PreparedStatement stmt = null;
        try {
            c = conn.getConnexion();
            stmt = c.prepareStatement(sql);
            Method fonctionGet = null;
            Object obj = null;
            String objt = null;
            String verification = null;
            int y = 0;
            for (int u = 0; u < attribut.length; u++) {
                fonctionGet = classe.getMethod("get" + attribut[u].getName().substring(0, 1).toUpperCase() + attribut[u].getName().substring(1).toLowerCase());
                if (fonctionGet.getName().equals("getId")) {
                    System.out.println("aza alaina");
                } else {
                    obj = fonctionGet.invoke(objet, null);
                    // System.out.println("objet"+obj);
                    objt = String.valueOf(obj);
                    verification = this.verifieType(objt);
                    // System.out.println("fonctionGet"+fonctionGet.getName());
                    // System.out.println("verification"+verification);
                    if (verification.equals("int")) {
                        System.out.println("ettttttt" + objt);
                        stmt.setInt(y + 1, Integer.parseInt(objt));
                    } else if (verification.equals("double")) {
                        stmt.setDouble(y + 1, Double.parseDouble(objt));
                        System.out.println("ettttttt" + objt);
                    } else if (verification.equals("date")) {
                        System.out.println("ettttttt" + objt);
                        stmt.setDate(y + 1, Date.valueOf(objt));
                    } else {
                        System.out.println((y + 1) + "ettttttt" + objt);
                        stmt.setString(y + 1, objt);
                    }
                    y++;
                }
            }
            stmt.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            stmt.close();
            c.close();
        }
    }
    
    
}
