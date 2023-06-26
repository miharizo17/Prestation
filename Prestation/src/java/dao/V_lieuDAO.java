/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.V_lieu;

/**
 *
 * @author Kanto
 */
public class V_lieuDAO {
    V_lieu v_lieu = new V_lieu();
    
    public ArrayList<V_lieu> listV_lieu(int limit,int offset) throws Exception{
        String condition = " where etat=0 limit "+limit+" offset "+offset;
        ArrayList<V_lieu> list = new ArrayList<>();
        ArrayList listU = v_lieu.findPagination("select id,idville,idtypelieu,nom,etat,type,ville,nbrpersonnes,sary from v_lieu",condition, null);
        for(int i=0;i<listU.size();i++){
            list.add((V_lieu) listU.get(i));
        }
        return list;
    }
    
      public ArrayList<V_lieu> getAll() throws Exception{
        String condition = " where etat=0  ";
        ArrayList<V_lieu> list = new ArrayList<>();
        ArrayList listU = v_lieu.findPagination("select id,idville,idtypelieu,nom,etat,type,ville,nbrpersonnes from v_lieu",condition, null);
        for(int i=0;i<listU.size();i++){
            list.add((V_lieu) listU.get(i));
        }
        return list;
    }
}
