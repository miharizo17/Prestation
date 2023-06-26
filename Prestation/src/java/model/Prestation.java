/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.DBTable;
import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Kanto
 */
public class Prestation extends DBTable {

    int id, idtypeprestation, idemploye, etat;
    String nomprestation;
    Date datespectacle;
    String heurespectacle;

    public Date getDatespectacle() {
        return datespectacle;
    }

    public void setDatespectacle(Date datespectacle) {
        this.datespectacle = datespectacle;
    }

    public String getHeurespectacle() {
        return heurespectacle;
    }

    public void setHeurespectacle(String heurespectacle) {
        this.heurespectacle = heurespectacle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdtypeprestation() {
        return idtypeprestation;
    }

    public void setIdtypeprestation(int idtypeprestation) {
        this.idtypeprestation = idtypeprestation;
    }

    public int getIdemploye() {
        return idemploye;
    }

    public void setIdemploye(int idemploye) {
        this.idemploye = idemploye;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public String getNomprestation() {
        return nomprestation;
    }

    public void setNomprestation(String nomprestation) {
        this.nomprestation = nomprestation;
    }

    public void insertPrestation(Base b, Prestation p) throws Exception {
        b.insert(p);
    }
}
