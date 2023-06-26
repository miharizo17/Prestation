/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Employe;

/**
 *
 * @author Kanto
 */
public class EmployeDAO {
    Employe employe = new Employe();
    
    public ArrayList<Employe> listEmploye (int limit, int offset) throws Exception{
        String condition =" where etat=0 limit "+limit+" offset "+offset;
        ArrayList<Employe> list = new ArrayList<>();
        ArrayList listU = employe.findPagination("select id,nom,prenom,etat,adresse,sexe,contact from employe",condition, null);
        for(int i=0;i<listU.size();i++){
            list.add((Employe) listU.get(i));
        }
        return list;
    }
}
