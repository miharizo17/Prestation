/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ArtisteDAO;
import dao.DepenseDAO;
import dao.EmployeDAO;
import dao.TaxeDAO;
import dao.TypelogistiqueDAO;
import dao.TypesonorisationDAO;
import dao.V_lieuDAO;
import dao.V_logistiqueDAO;
import dao.V_prestationdevisDAO;
import dao.V_sonoDAO;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import model.Artiste;
import model.Depense;
import model.Employe;
import model.Lieuphoto;
import model.Taxe;
import model.Typelogistique;
import model.Typesonorisation;
import model.V_lieu;
import model.V_logistique;
import model.V_prestationdevis;
import model.V_sono;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Kanto
 */
@Controller
public class AdminListetController {

    ArtisteDAO artisteDAO = new ArtisteDAO();

    V_sonoDAO v_sonoDAO = new V_sonoDAO();

    V_logistiqueDAO v_logistiqueDAO = new V_logistiqueDAO();

    TypesonorisationDAO typesonorisationDAO = new TypesonorisationDAO();

    TypelogistiqueDAO typelogistiqueDAO = new TypelogistiqueDAO();
    
    DepenseDAO depenseDAO = new DepenseDAO();
    
    V_lieuDAO v_lieuDAO = new V_lieuDAO();
    
    EmployeDAO employeDAO = new EmployeDAO();

    @RequestMapping(value = "/listeArtiste")
    public ModelAndView listeArtiste(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        int limit = 2;
        int offset = 0;
        if (req.getParameter("limit") != null && req.getParameter("offset") != null) {
            limit = Integer.parseInt(req.getParameter("limit"));
            offset = Integer.parseInt(req.getParameter("offset"));
        }
        ArrayList<Artiste> listeArtiste = artisteDAO.listArtiste(limit, offset);
        mv.addObject("listeArtiste", listeArtiste);
        mv.addObject("limit", limit);
        mv.addObject("offset", offset);
        mv.setViewName("listeArtiste");
        return mv;
    }

    @RequestMapping(value = "/listeSono")
    public ModelAndView listeSono(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        int limit = 2;
        int offset = 0;
        if (req.getParameter("limit") != null && req.getParameter("offset") != null) {
            limit = Integer.parseInt(req.getParameter("limit"));
            offset = Integer.parseInt(req.getParameter("offset"));
        }
        ArrayList<V_sono> listeSono = v_sonoDAO.listV_sono(limit, offset);
        ArrayList<Typesonorisation> listType = typesonorisationDAO.listTypesonorisation();
        mv.addObject("listType", listType);
        mv.addObject("listeSono", listeSono);
        mv.addObject("limit", limit);
        mv.addObject("offset", offset);
        mv.setViewName("listeSono");
        return mv;
    }

    @RequestMapping(value = "/listeLogistique")
    public ModelAndView listeLogistique(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        int limit = 2;
        int offset = 0;
        if (req.getParameter("limit") != null && req.getParameter("offset") != null) {
            limit = Integer.parseInt(req.getParameter("limit"));
            offset = Integer.parseInt(req.getParameter("offset"));
        }
        ArrayList<Typelogistique> listType = typelogistiqueDAO.listTypelogistique();
        ArrayList<V_logistique> listLogistique = v_logistiqueDAO.listV_logistique(limit, offset);
        mv.addObject("listType", listType);
        mv.addObject("listLogistique", listLogistique);
        mv.addObject("limit", limit);
        mv.addObject("offset", offset);
        mv.setViewName("listeLogistique");
        return mv;
    }

    @RequestMapping(value = "/listeDepense")
    public ModelAndView listeDepense(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        int limit = 2;
        int offset = 0;
        if (req.getParameter("limit") != null && req.getParameter("offset") != null) {
            limit = Integer.parseInt(req.getParameter("limit"));
            offset = Integer.parseInt(req.getParameter("offset"));
        }
        ArrayList<Depense> listDepense = depenseDAO.listDepense(limit, offset);
        mv.addObject("limit", limit);
        mv.addObject("offset", offset);
        mv.addObject("listDepense", listDepense);
        mv.setViewName("listeDepense");
        return mv;
    }
    
     @RequestMapping(value = "/listeLieu")
    public ModelAndView listeLieu(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        int limit = 2;
        int offset = 0;
        if (req.getParameter("limit") != null && req.getParameter("offset") != null) {
            limit = Integer.parseInt(req.getParameter("limit"));
            offset = Integer.parseInt(req.getParameter("offset"));
        }
       ArrayList<V_lieu> listLieu = v_lieuDAO.listV_lieu(limit, offset);
     
        mv.addObject("limit", limit);
        mv.addObject("offset", offset);
        mv.addObject("listLieu", listLieu);
        mv.setViewName("listeLieu");
        return mv;
    }
    
    @RequestMapping(value = "/listeEmploye")
    public ModelAndView listeEmploye(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        int limit = 2;
        int offset = 0;
        if (req.getParameter("limit") != null && req.getParameter("offset") != null) {
            limit = Integer.parseInt(req.getParameter("limit"));
            offset = Integer.parseInt(req.getParameter("offset"));
        }
       ArrayList<Employe> listEmploye = employeDAO.listEmploye(limit, offset);
       mv.addObject("listEmploye", listEmploye);
        mv.addObject("limit", limit);
        mv.addObject("offset", offset);
        mv.setViewName("listeEmploye");
        return mv;
    }
    
     @RequestMapping(value = "/listePrestationDevis")
    public ModelAndView listePrestationDevis(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        V_prestationdevisDAO v_prestationdevisDAO = new V_prestationdevisDAO();
        int limit = 2;
        int offset = 0;
        if (req.getParameter("limit") != null && req.getParameter("offset") != null) {
            limit = Integer.parseInt(req.getParameter("limit"));
            offset = Integer.parseInt(req.getParameter("offset"));
        }
        ArrayList<V_prestationdevis> listPrestation = v_prestationdevisDAO.listV_prestationdevis(limit, offset);
        mv.addObject("listPrestation", listPrestation);
        mv.addObject("limit", limit);
        mv.addObject("offset", offset);
        mv.setViewName("listePrestationDevis");
        return mv;
    }
    
    @RequestMapping(value = "/listeTaxe")
    public ModelAndView listeTaxe(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        int limit = 2;
        int offset = 0;
        if (req.getParameter("limit") != null && req.getParameter("offset") != null) {
            limit = Integer.parseInt(req.getParameter("limit"));
            offset = Integer.parseInt(req.getParameter("offset"));
        }
        TaxeDAO taxeDAO = new TaxeDAO();
       ArrayList<Taxe> listtaxe = taxeDAO.listTaxe();
       mv.addObject("listtaxe", listtaxe);
        mv.addObject("limit", limit);
        mv.addObject("offset", offset);
        mv.setViewName("listeTaxe");
        return mv;
    }

}
