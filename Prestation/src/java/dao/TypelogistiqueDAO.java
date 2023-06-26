/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Typelogistique;

/**
 *
 * @author Kanto
 */
public class TypelogistiqueDAO {
    Typelogistique typelogistique = new Typelogistique();
    
    public ArrayList<Typelogistique> listTypelogistique() throws Exception{
        String condition = " where 1=1 ";
        ArrayList<Typelogistique> list = new ArrayList<>();
         ArrayList listA = typelogistique.findPagination("select id,type from typelogistique",condition,null);
        for(int i=0;i<listA.size();i++){
            list.add((Typelogistique) listA.get(i));
        }
        return list;
    }
}
