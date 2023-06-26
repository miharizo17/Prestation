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
public class V_lieucategorieplace extends DBTable {

    int id, idlieu, idcategorieplace, capacite, nbrpersonnes;
    String nom, type, ville, categorie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdlieu() {
        return idlieu;
    }

    public void setIdlieu(int idlieu) {
        this.idlieu = idlieu;
    }

    public int getIdcategorieplace() {
        return idcategorieplace;
    }

    public void setIdcategorieplace(int idcategorieplace) {
        this.idcategorieplace = idcategorieplace;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public int getNbrpersonnes() {
        return nbrpersonnes;
    }

    public void setNbrpersonnes(int nbrpersonnes) {
        this.nbrpersonnes = nbrpersonnes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

}
