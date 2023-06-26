/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Typesonorisation;

/**
 *
 * @author Kanto
 */
public class TypesonorisationDAO {
    Typesonorisation typesonorisation = new Typesonorisation();
    
     public ArrayList<Typesonorisation> listTypesonorisation () throws Exception{
        ArrayList<Typesonorisation> list = new ArrayList<>();
        ArrayList listU = typesonorisation.find("select id,type from typesonorisation", null);
        for(int i=0;i<listU.size();i++){
            list.add((Typesonorisation) listU.get(i));
        }
        return list;
    }
}
