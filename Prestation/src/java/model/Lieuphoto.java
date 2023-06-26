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
public class Lieuphoto extends DBTable {

    int id, idlieu;
    String sary;

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

    public String getSary() {
        return sary;
    }

    public void setSary(String sary) {
        this.sary = sary;
    }
    
    public void insertLieuphoto(Base b,Lieuphoto l) throws Exception{
        b.insert(l);
    }

}
