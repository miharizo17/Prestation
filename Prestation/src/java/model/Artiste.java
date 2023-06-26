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
public class Artiste extends DBTable {

    int id, idunite, etat;
    String nom, sary;
    double tarif, duree;

    public String getSary() {
        return sary;
    }

    public void setSary(String sary) {
        this.sary = sary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDuree() {
        return duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public void insertArtiste(Base b, Artiste a) throws Exception {
        b.insert(a);
    }
}
