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
import model.Artiste;

/**
 *
 * @author Kanto
 */
public class ArtisteDAO {

    Artiste artiste = new Artiste();

    Connexion conn = new Connexion();

    public ArrayList<Artiste> listArtiste(int limit, int offset) throws Exception {
        String condition = " where etat=0 limit " + limit + " offset " + offset;
        ArrayList<Artiste> list = new ArrayList<>();
        ArrayList listA = artiste.findPagination("select id,nom,tarif,duree,etat,idunite,sary from artiste", condition, null);
        for (int i = 0; i < listA.size(); i++) {
            list.add((Artiste) listA.get(i));
        }
        return list;
    }

    public ArrayList<Artiste> getAllArtiste() throws Exception {

        ArrayList<Artiste> list = new ArrayList<>();
        ArrayList listA = artiste.find("select id,nom,tarif,duree,etat,idunite,sary from artiste", null);
        for (int i = 0; i < listA.size(); i++) {
            list.add((Artiste) listA.get(i));
        }
        return list;
    }

//     public void deleteArtiste(int id) throws Exception {
//        Connection con = null;
//        Statement stmt = null;
//        String sql = "delete from artiste where id=" + id;
//        try {
//            con = conn.getConnexion();
//            stmt = con.createStatement();
//            //stmt.setInt(1, id);
//            stmt.executeUpdate(sql);
//            //System.out.println(stmt);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw e;
//        } finally {
//
//            stmt.close();
//            con.close();
//        }
//    }
    public ArrayList<Artiste> listArtisteModif(int id) throws Exception {
        String condition = " where id= " + id;
        ArrayList<Artiste> list = new ArrayList<>();
        ArrayList listA = artiste.findPagination("select id,nom,tarif,duree,etat,idunite from artiste", condition, null);
        for (int i = 0; i < listA.size(); i++) {
            list.add((Artiste) listA.get(i));
        }
        return list;
    }

    public void deleteArtiste(Artiste a) throws Exception {
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "update artiste set etat=1 where id=? ";
        try {
            con = conn.getConnexion();
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, a.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {

            stmt.close();
            con.close();
        }
    }

    public void modifArtiste(Artiste a) throws Exception {
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "update artiste set nom=?, tarif=?, idunite=?, duree=? where id=? ";
        System.out.println(sql);
        try {
            con = conn.getConnexion();
            stmt = con.prepareStatement(sql);
            stmt.setString(1, a.getNom());
            stmt.setDouble(2, a.getTarif());
            stmt.setInt(3, a.getIdunite());
            stmt.setDouble(4, a.getDuree());
            stmt.setInt(5, a.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {

            stmt.close();
            con.close();
        }
    }

   
}
