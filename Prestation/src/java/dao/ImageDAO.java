/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Image1;

/**
 *
 * @author Kanto
 */
public class ImageDAO {
    Image1 im = new Image1();
    public ArrayList<Image1> listImage () throws Exception{
        ArrayList<Image1> list = new ArrayList<>();
        ArrayList listU = im.find("select id,sary from image", null);
        for(int i=0;i<listU.size();i++){
            list.add((Image1) listU.get(i));
        }
        return list;
    }
}
