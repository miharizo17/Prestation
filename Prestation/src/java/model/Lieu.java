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
public class Lieu extends DBTable {

    int id, idville, idtypelieu, etat,nbrpersonnes;

    public int getNbrpersonnes() {
        return nbrpersonnes;
    }

    public void setNbrpersonnes(int nbrpersonnes) {
        this.nbrpersonnes = nbrpersonnes;
    }
    String nom;

    public void setId(int id) {
        this.id = id;
    }

    public void setIdville(int idville) {
        this.idville = idville;
    }

    public void setIdtypelieu(int idtypelieu) {
        this.idtypelieu = idtypelieu;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public int getIdville() {
        return idville;
    }

    public int getIdtypelieu() {
        return idtypelieu;
    }

    public int getEtat() {
        return etat;
    }

    public String getNom() {
        return nom;
    }

    public void insertLieu(Base b, Lieu l) throws Exception {
        b.insert(l);
    }
}
