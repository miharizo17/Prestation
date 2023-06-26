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
public class Prestationdevis extends DBTable {

    int id, idprestation, etat;
    double montanttotal, recette, depense, benefice, beneficeavectaxe;
    
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
    
    public int getEtat() {
        return etat;
    }
    
    public void setEtat(int etat) {
        this.etat = etat;
    }
    
    public double getMontanttotal() {
        return montanttotal;
    }
    
    public void setMontanttotal(double montanttotal) {
        this.montanttotal = montanttotal;
    }
    
    public double getRecette() {
        return recette;
    }
    
    public void setRecette(double recette) {
        this.recette = recette;
    }
    
    public double getDepense() {
        return depense;
    }
    
    public void setDepense(double depense) {
        this.depense = depense;
    }
    
    public double getBenefice() {
        return benefice;
    }
    
    public void setBenefice(double benefice) {
        this.benefice = benefice;
    }

    public double getBeneficeavectaxe() {
        return beneficeavectaxe;
    }

    public void setBeneficeavectaxe(double beneficeavectaxe) {
        this.beneficeavectaxe = beneficeavectaxe;
    }
    
 
    
    public void insertPrestationdevis(Base b, Prestationdevis p) throws Exception {
        b.insert(p);
    }
}
