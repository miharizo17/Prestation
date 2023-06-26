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
public class Prestationdepense extends DBTable{
    int id ,idprestation,iddepense,etat;
    double tarif;

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

    public int getIddepense() {
        return iddepense;
    }

    public void setIddepense(int iddepense) {
        this.iddepense = iddepense;
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
    
    public void insertPrestationdepense(Base b,Prestationdepense p) throws Exception{
        b.insert(p);
    }
}
