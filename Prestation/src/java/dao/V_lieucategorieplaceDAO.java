/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.V_lieucategorieplace;

/**
 *
 * @author Kanto
 */
public class V_lieucategorieplaceDAO {
    V_lieucategorieplace v_lieucategorieplace = new V_lieucategorieplace();
    
    public ArrayList<V_lieucategorieplace> listV_lieucategorieplaceByIdLieu (int idLieu) throws Exception{
        String condition = " where idlieu="+idLieu;
        ArrayList<V_lieucategorieplace> list = new ArrayList<>();
        ArrayList listU = v_lieucategorieplace.findPagination("select id, idlieu, idcategorieplace, capacite, nbrpersonnes,nom, type, ville, categorie from v_lieucategorieplace",condition, null);
        for(int i=0;i<listU.size();i++){
            list.add((V_lieucategorieplace) listU.get(i));
        }
        return list;
    }
}
