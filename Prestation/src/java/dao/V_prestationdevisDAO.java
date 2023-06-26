/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.V_prestationdevis;

/**
 *
 * @author Kanto
 */
public class V_prestationdevisDAO {

    V_prestationdevis v_prestationdevis = new V_prestationdevis();

    public ArrayList<V_prestationdevis> listV_prestationdevis(int limit, int offset) throws Exception {
        String condition = " where etat=0 limit " + limit + " offset " + offset;
        ArrayList<V_prestationdevis> list = new ArrayList<>();
        ArrayList listU = v_prestationdevis.findPagination("select id,idprestation,montanttotal ,recette ,depense ,benefice ,beneficeavectaxe,etat,nomprestation,datespectacle,heurespectacle from v_prestationdevis", condition, null);
        for (int i = 0; i < listU.size(); i++) {
            list.add((V_prestationdevis) listU.get(i));
        }
        return list;
    }
}
