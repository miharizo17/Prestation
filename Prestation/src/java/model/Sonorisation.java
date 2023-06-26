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
public class Sonorisation extends DBTable {

    int id, idtypesono, idunite, etat;
    double tarif, duree;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdtypesono() {
        return idtypesono;
    }

    public void setIdtypesono(int idtypesono) {
        this.idtypesono = idtypesono;
    }

    public int getIdunite() {
        return idunite;
    }

    public void setIdunite(int idunite) {
        this.idunite = idunite;
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

    public double getDuree() {
        return duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

    public void insertSono(Base b,Sonorisation s) throws Exception{
        b.insert(s);
    }
}
