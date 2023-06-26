/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.DBTable;

/**
 *
 * @author Kanto
 */
public class Prestationlieucategorieplace extends DBTable {

    int id,idprestation, idlieucategorieplace, etat,idlieu;
    double tarif,totalcategorieplace;

    public double getTotalcategorieplace() {
        return totalcategorieplace;
    }

    public void setTotalcategorieplace(double totalcategorieplace) {
        this.totalcategorieplace = totalcategorieplace;
    }

    public int getIdlieu() {
        return idlieu;
    }

    public void setIdlieu(int idlieu) {
        this.idlieu = idlieu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdprestation() {
        return idprestation;
    }

    public void setIdprestation(int idprestation) {
        this.idprestation = idprestation;
    }

    public int getIdlieucategorieplace() {
        return idlieucategorieplace;
    }

    public void setIdlieucategorieplace(int idlieucategorieplace) {
        this.idlieucategorieplace = idlieucategorieplace;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public void insertPrestationlieucategorieplace(Base b,Prestationlieucategorieplace p) throws Exception{
        b.insert(p);
    }
}
