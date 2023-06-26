/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Lieuphoto;

/**
 *
 * @author Kanto
 */
public class LieuphotoDAO {
    Lieuphoto lieuphoto = new Lieuphoto();
    
    public ArrayList<Lieuphoto> listLieuphoto(int idlieu) throws Exception {
        String condition = " where idlieu="+ idlieu;
        ArrayList<Lieuphoto> list = new ArrayList<>();
        ArrayList listA = lieuphoto.findPagination("select id,idlieu,sary from lieuphoto", condition, null);
        for (int i = 0; i < listA.size(); i++) {
            list.add((Lieuphoto) listA.get(i));
        }
        return list;
    }
}
