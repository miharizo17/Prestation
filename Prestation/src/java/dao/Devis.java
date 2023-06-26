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
public class Devis {

    PrestationlieuDAO prestationlieuDAO = new PrestationlieuDAO();

    PrestationartisteDAO prestationartisteDAO = new PrestationartisteDAO();

    PrestationsonoDAO prestationsonoDAO = new PrestationsonoDAO();

    PrestationlogistiqueDAO prestationlogistiqueDAO = new PrestationlogistiqueDAO();

    PrestationdepenseDAO prestationdepenseDAO = new PrestationdepenseDAO();

    public double devisPrestation(int dernierPrestation) throws Exception {
        double sommeLieu = prestationlieuDAO.sumTarifLieuByIdPrestation(dernierPrestation);
        double sommeArtiste = prestationartisteDAO.sumTarifArtisteByIdPrestation(dernierPrestation);
        double sommeSono = prestationsonoDAO.sumTarifSonoByIdPrestation(dernierPrestation);
        double sommeLogistique = prestationlogistiqueDAO.sumTarifLogistiqueByIdPrestation(dernierPrestation);
        double sommeDepense = prestationdepenseDAO.sumTarifDepenseByIdPrestation(dernierPrestation);
        double somme = sommeLieu + sommeArtiste + sommeSono + sommeLogistique + sommeDepense;
        return somme;
    }
}
