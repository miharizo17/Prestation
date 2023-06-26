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
public class V_lieu extends DBTable {

    int id, idville, idtypelieu, etat, nbrpersonnes;

    String nom, ville, type,sary;

    public String getSary() {
        return sary;
    }

    public void setSary(String sary) {
        this.sary = sary;
    }

    public int getNbrpersonnes() {
        return nbrpersonnes;
    }

    public void setNbrpersonnes(int nbrpersonnes) {
        this.nbrpersonnes = nbrpersonnes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdville() {
        return idville;
    }

    public void setIdville(int idville) {
        this.idville = idville;
    }

    public int getIdtypelieu() {
        return idtypelieu;
    }

    public void setIdtypelieu(int idtypelieu) {
        this.idtypelieu = idtypelieu;
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

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
