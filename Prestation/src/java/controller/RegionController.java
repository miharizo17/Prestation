 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.HibernateDao;
import dao.ImageDAO;
import dao.Test;
import java.io.File;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.Base;
import model.Image1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Fanjava
 */
@Controller
public class RegionController {
    @Autowired
    HibernateDao dao;
  
    @RequestMapping(value="/")
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
    
    @RequestMapping(value = "/test")
    public ModelAndView test(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        int nombreTable = Integer.parseInt(req.getParameter("nombreTable"));
        int nombreTable1 =Integer.parseInt(req.getParameter("nombreTable1"));
        
       
//        String [] laptop = new String[nombreTable];
//        String [] sonso = new String[nombreTable1];
        System.out.println("premier "+nombreTable);
        System.out.println("second "+nombreTable1);
//        for(int i=1;i<=nombreTable;i++ ){
//            laptop[i-1] = req.getParameter("laptop"+i);
//            System.out.println("Laptop "+laptop[i-1]);
//        }
//        for(int j=1;j<=nombreTable1;j++){
//            sonso[j-1] = req.getParameter("sonso"+j);
//            System.out.println("Sonso "+sonso[j-1]);
//        }
//        mv.setViewName("insertPointVente");
        return mv;
    }
    
  @RequestMapping(value ="/sary",method = RequestMethod.POST)
    public ModelAndView insertContenu( HttpServletRequest request , @RequestParam MultipartFile file, HttpSession session) throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        String path = request.getServletContext().getRealPath("/ressources/assets/");
         Test t = new Test();
         Image1 i = new Image1();
         Base b = new Base();
        String fileName = t.uploadPhoto(path, file);
       i.setSary(fileName);
       i.insertImage(b, i);
        modelAndView.setViewName("index");
        return modelAndView;
    }
    
     @RequestMapping(value="/listesary")
    public ModelAndView listesary() throws Exception{
        ModelAndView mv=new ModelAndView();
        ImageDAO imDAO = new ImageDAO();
        ArrayList<Image1> list = imDAO.listImage();
        mv.addObject("list", list);
        mv.setViewName("afficheImage");
        return mv;
    }
   
}
