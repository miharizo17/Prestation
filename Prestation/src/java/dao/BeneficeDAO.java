/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Kanto
 */
public class BeneficeDAO {

    PrestationlieucategorieplaceDAO prestationlieucategorieplaceDAO = new PrestationlieucategorieplaceDAO();
    PrestationlieuDAO prestationlieuDAO = new PrestationlieuDAO();

    TaxeDAO taxeDAO = new TaxeDAO();
    
    public double beneficeLieu(int idPrestation,int idlieu) throws Exception {
        double sumTarifLieu = prestationlieuDAO.sumTarifLieuByIdPrestation(idPrestation);
        double sumTarifCategoriePlace = prestationlieucategorieplaceDAO.sumTarifCategorieByIdPrestation(idPrestation,idlieu);
        double ben = sumTarifCategoriePlace - sumTarifLieu;
        return ben;
    }
    
     public double beneficeLieuAvecTaxe(int idPrestation,int idlieu) throws Exception {
       double ben=this.beneficeLieu(idPrestation, idlieu)-((this.beneficeLieu(idPrestation, idlieu)*taxeDAO.getTaxe())/100);
         System.out.println("ben "+ben);
        return ben;
    }
    
}
