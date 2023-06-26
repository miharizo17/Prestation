/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Unite;

/**
 *
 * @author Kanto
 */
public class UniteDAO {
    Unite unite = new Unite();
    
    DBTable base = new DBTable();
    
    public ArrayList<Unite> listUnite () throws Exception{
        ArrayList<Unite> list = new ArrayList<>();
        ArrayList listU = unite.find("select id,unite from unite", null);
        for(int i=0;i<listU.size();i++){
            list.add((Unite) listU.get(i));
        }
        return list;
    }
}
