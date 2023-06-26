/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.itextpdf.io.image.ImageData;
import dao.DBTable;

/**
 *
 * @author Kanto
 */
public class Image1 extends DBTable{

    int id;
    String sary;

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSary() {
        return sary;
    }

    public void setSary(String sary) {
        this.sary = sary;
    }
    
    public void insertImage(Base b,Image1 i) throws Exception{
        b.insert(i);
    }

}
