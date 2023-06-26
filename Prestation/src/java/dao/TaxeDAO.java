/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Taxe;

/**
 *
 * @author Kanto
 */
public class TaxeDAO {
    Taxe taxe = new Taxe();
    Connexion conn = new Connexion();
    
    public ArrayList<Taxe> listTaxe () throws Exception{
        ArrayList<Taxe> list = new ArrayList<>();
        ArrayList listU = taxe.find("select id,taxe from taxe", null);
        for(int i=0;i<listU.size();i++){
            list.add((Taxe) listU.get(i));
        }
        return list;
    }
    
    public int getTaxe() throws SQLException, Exception {
        Connection connex = null;
        Statement stmt = null;
        ResultSet req = null;
        int nombre = 0;
        try {
            connex = conn.getConnexion();
            stmt = connex.createStatement();
            String sql = "select taxe from taxe ";
            req = stmt.executeQuery(sql);
            while (req.next()) {
                nombre = stmt.getResultSet().getInt(1);
                System.out.println("taxe "+taxe);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            stmt.close();
            connex.close();
        }
        return nombre;
    }
    
    public void modifArtiste(Taxe a) throws Exception {
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "update taxe set taxe=? where id=? ";
        System.out.println(sql);
        try {
            con = conn.getConnexion();
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, a.getTaxe());
            stmt.setInt(2, a.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {

            stmt.close();
            con.close();
        }
    }
}
