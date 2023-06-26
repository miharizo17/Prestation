/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Sonorisation;

/**
 *
 * @author Kanto
 */
public class SonorisationDAO {
    Sonorisation sonorisation = new Sonorisation();
    
    public ArrayList<Sonorisation> getAllSonorisation() throws Exception{
      
        ArrayList<Sonorisation> list = new ArrayList<>();
         ArrayList listA = sonorisation.find("select id,nom,tarif,duree,etat,idunite from artiste",null);
        for(int i=0;i<listA.size();i++){
            list.add((Sonorisation) listA.get(i));
        }
        return list;
    }
}
