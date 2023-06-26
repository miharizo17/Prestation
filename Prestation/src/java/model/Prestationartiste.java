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
public class Prestationartiste extends DBTable {

    int id, idprestation, idartiste, etat;
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
    
    public int getIdartiste() {
        return idartiste;
    }
    
    public void setIdartiste(int idartiste) {
        this.idartiste = idartiste;
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
    
    public void insertPrestationartiste(Base b, Prestationartiste p) throws Exception {
        b.insert(p);
    }
}
