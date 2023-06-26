/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.V_sono;

/**
 *
 * @author Kanto
 */
public class V_sonoDAO {

    V_sono v_sono = new V_sono();

    public ArrayList<V_sono> listV_sono(int limit,int offset) throws Exception {
        String condition = " where etat=0 limit "+ limit +" offset "+offset;
        ArrayList<V_sono> list = new ArrayList<>();
        ArrayList listU = v_sono.findPagination("select id,idtypesono,tarif,duree,idunite,etat,type,unite from v_sono ",condition, null);
        for (int i = 0; i < listU.size(); i++) {
            list.add((V_sono) listU.get(i));
        }
        return list;
    }
    
     public ArrayList<V_sono> getAllVSono() throws Exception {
          String condition = " where etat=0 ";
        ArrayList<V_sono> list = new ArrayList<>();
        ArrayList listU = v_sono.findPagination("select id,idtypesono,tarif,duree,idunite,etat,type,unite from v_sono ", condition,null);
        for (int i = 0; i < listU.size(); i++) {
            list.add((V_sono) listU.get(i));
        }
        return list;
    }
}
