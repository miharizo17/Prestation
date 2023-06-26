/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Categorieplace;

/**
 *
 * @author Kanto
 */
public class CategorieplaceDAO {
    Categorieplace categorieplace = new Categorieplace();
    
    public ArrayList<Categorieplace> listCategorieplace () throws Exception{
        ArrayList<Categorieplace> list = new ArrayList<>();
        ArrayList listU = categorieplace.find("select id,categorie from categorieplace", null);
        for(int i=0;i<listU.size();i++){
            list.add((Categorieplace) listU.get(i));
        }
        return list;
    }
}
