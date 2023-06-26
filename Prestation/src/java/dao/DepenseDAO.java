/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Depense;

/**
 *
 * @author Kanto
 */
public class DepenseDAO {
    Depense depense = new Depense();
    
    public ArrayList<Depense> listDepense (int limit,int offset) throws Exception{
        String condition = " where etat=0 limit "+limit+" offset "+offset;
        ArrayList<Depense> list = new ArrayList<>();
        ArrayList listU = depense.findPagination("select id,type,etat from depense",condition, null);
        for(int i=0;i<listU.size();i++){
            list.add((Depense) listU.get(i));
        }
        return list;
    }
    
     public ArrayList<Depense> getAllDepense () throws Exception{
        String condition = " where etat=0 ";
        ArrayList<Depense> list = new ArrayList<>();
        ArrayList listU = depense.findPagination("select id,type,etat from depense",condition, null);
        for(int i=0;i<listU.size();i++){
            list.add((Depense) listU.get(i));
        }
        return list;
    }
}
