/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Typelieu;

/**
 *
 * @author Kanto
 */
public class TypelieuDAO {
    Typelieu typelieu = new Typelieu();
    
    public ArrayList<Typelieu> listTypelieu () throws Exception{
        ArrayList<Typelieu> list = new ArrayList<>();
        ArrayList listU = typelieu.find("select id,type from typelieu", null);
        for(int i=0;i<listU.size();i++){
            list.add((Typelieu) listU.get(i));
        }
        return list;
    }
}
