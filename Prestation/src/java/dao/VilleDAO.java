/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Ville;

/**
 *
 * @author Kanto
 */
public class VilleDAO {

    Ville ville = new Ville();

    public ArrayList<Ville> listVille() throws Exception {
        ArrayList<Ville> list = new ArrayList<>();
        ArrayList listU = ville.find("select id,ville from ville", null);
        for (int i = 0; i < listU.size(); i++) {
            list.add((Ville) listU.get(i));
        }
        return list;
    }
}
