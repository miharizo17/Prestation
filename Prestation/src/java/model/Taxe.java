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
public class Taxe extends DBTable{
    int id;
    int taxe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTaxe() {
        return taxe;
    }

    public void setTaxe(int taxe) {
        this.taxe = taxe;
    }
    
    public void insertTaxe(Base b,Taxe t) throws Exception{
        b.insert(t);
    }
}
