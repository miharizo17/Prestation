/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Typeprestation;

/**
 *
 * @author Kanto
 */
public class TypeprestationDAO {
    Typeprestation typeprestation = new Typeprestation();
    
     public ArrayList<Typeprestation> listTypeprestation () throws Exception{
        ArrayList<Typeprestation> list = new ArrayList<>();
        ArrayList listU = typeprestation.find("select id,type from typeprestation", null);
        for(int i=0;i<listU.size();i++){
            list.add((Typeprestation) listU.get(i));
        }
        return list;
    }
}
