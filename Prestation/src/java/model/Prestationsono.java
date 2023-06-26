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
public class Prestationsono extends DBTable {

    int id, idprestation, idsono, etat;
    double duree, montanttotal;
    
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
    
    public int getIdsono() {
        return idsono;
    }
    
    public void setIdsono(int idsono) {
        this.idsono = idsono;
    }
    
    public int getEtat() {
        return etat;
    }
    
    public void setEtat(int etat) {
        this.etat = etat;
    }
    
    public double getDuree() {
        return duree;
    }
    
    public void setDuree(double duree) {
        this.duree = duree;
    }
    
    public double getMontanttotal() {
        return montanttotal;
    }
    
    public void setMontanttotal(double montanttotal) {
        this.montanttotal = montanttotal;
    }
    
    public void insertPrestationsono(Base b, Prestationsono p) throws Exception {
        b.insert(p);
    }
}
