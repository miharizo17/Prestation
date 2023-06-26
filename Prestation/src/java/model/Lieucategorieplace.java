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
public class Lieucategorieplace extends DBTable {

    int id, idlieu, idcategorieplace, capacite;
    
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
    
    public void insertLieucategorieplace(Base b, Lieucategorieplace l) throws Exception {
        b.insert(l);
    }
}
