/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.V_logistique;

/**
 *
 * @author Kanto
 */
public class V_logistiqueDAO {

    V_logistique v_logistique = new V_logistique();

    public ArrayList<V_logistique> listV_logistique(int limit, int offset) throws Exception {
        String condition = " where etat=0 limit " + limit + " offset " + offset;
        ArrayList<V_logistique> list = new ArrayList<>();
        ArrayList listU = v_logistique.findPagination("select id,idtypelogistique,tarif,duree,idunite,etat,type,unite from v_logistique ", condition, null);
        for (int i = 0; i < listU.size(); i++) {
            list.add((V_logistique) listU.get(i));
        }
        return list;
    }
    
     public ArrayList<V_logistique> getAllVLogistique() throws Exception {
         String condition = " where etat=0  " ;
        ArrayList<V_logistique> list = new ArrayList<>();
        ArrayList listU = v_logistique.findPagination("select id,idtypelogistique,tarif,duree,idunite,etat,type,unite from v_logistique ",condition, null);
        for (int i = 0; i < listU.size(); i++) {
            list.add((V_logistique) listU.get(i));
        }
        return list;
    }
}
