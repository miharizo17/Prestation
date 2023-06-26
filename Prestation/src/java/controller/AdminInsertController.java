/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AdminDAO;
import dao.ArtisteDAO;
import dao.BeneficeDAO;
import dao.CategorieplaceDAO;
import dao.DepenseDAO;
import dao.Devis;
import dao.LieuDAO;
import dao.PrestationDAO;
import dao.PrestationartisteDAO;
import dao.PrestationdepenseDAO;
import dao.PrestationlieuDAO;
import dao.PrestationlieucategorieplaceDAO;
import dao.PrestationlogistiqueDAO;
import dao.PrestationsonoDAO;
import dao.TaxeDAO;
import dao.Test;
import dao.TypelieuDAO;
import dao.TypelogistiqueDAO;
import dao.TypeprestationDAO;
import dao.TypesonorisationDAO;
import dao.UniteDAO;
import dao.V_lieuDAO;
import dao.V_lieucategorieplaceDAO;
import dao.V_logistiqueDAO;
import dao.V_sonoDAO;
import dao.VilleDAO;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import model.Artiste;
import model.Base;
import model.Categorieplace;
import model.Depense;
import model.Employe;
import model.Lieu;
import model.Lieucategorieplace;
import model.Lieuphoto;
import model.Logistique;
import model.Prestation;
import model.Prestationartiste;
import model.Prestationdepense;
import model.Prestationdevis;
import model.Prestationlieu;
import model.Prestationlieucategorieplace;
import model.Prestationlogistique;
import model.Prestationsono;
import model.Sonorisation;
import model.Taxe;
import model.Typelieu;
import model.Typelogistique;
import model.Typeprestation;
import model.Typesonorisation;
import model.Unite;
import model.V_lieu;
import model.V_lieucategorieplace;
import model.V_logistique;
import model.V_sono;
import model.Ville;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Kanto
 */
@Controller
public class AdminInsertController {

    AdminDAO adminDAO = new AdminDAO();

    UniteDAO uniteDAO = new UniteDAO();

    Artiste artiste = new Artiste();

    ArtisteDAO artisteDAO = new ArtisteDAO();

    TypesonorisationDAO typesonorisationDAO = new TypesonorisationDAO();

    TypelogistiqueDAO typelogistiqueDAO = new TypelogistiqueDAO();

    Sonorisation sonorisation = new Sonorisation();

    Logistique logistique = new Logistique();

    Depense depense = new Depense();

    TypelieuDAO typelieuDAO = new TypelieuDAO();

    VilleDAO villeDAO = new VilleDAO();

    Lieu lieu = new Lieu();

    Base b = new Base();

    Employe employe = new Employe();

    V_logistiqueDAO v_logistiqueDAO = new V_logistiqueDAO();

    V_sonoDAO v_sonoDAO = new V_sonoDAO();

    DepenseDAO depenseDAO = new DepenseDAO();

    TypeprestationDAO typeprestationDAO = new TypeprestationDAO();

    Prestation prestation = new Prestation();

    PrestationDAO prestationDAO = new PrestationDAO();

    CategorieplaceDAO categorieplaceDAO = new CategorieplaceDAO();

    @RequestMapping(value = "/formLoginAdmin")
    public ModelAndView formLoginAdmin() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("loginAdmin");
        return mv;
    }

    @RequestMapping(value = "/loginAdmin")
    public ModelAndView loginAdmin(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        String nom = req.getParameter("nom");
        String mdp = req.getParameter("mdp");
        int verif = adminDAO.loginAdmin(nom, mdp);
        if (verif == 1) {
            mv.setViewName("index");
        } else {
            mv.setViewName("loginAdmin");
        }
        return mv;
    }

    @RequestMapping(value = "/formAjoutArtiste")
    public ModelAndView formAjoutArtiste() throws Exception {
        ModelAndView mv = new ModelAndView();
        ArrayList<Unite> listUnite = uniteDAO.listUnite();
        mv.addObject("listUnite", listUnite);
        mv.setViewName("ajoutArtiste");
        return mv;
    }

    @RequestMapping(value = "/ajoutArtiste")
    public ModelAndView ajoutArtiste(HttpServletRequest req, @RequestParam MultipartFile file) throws Exception {
        ModelAndView mv = new ModelAndView();
        String path = req.getServletContext().getRealPath("/ressources/assets/");
        Test t = new Test();
        String fileName = t.uploadPhoto(path, file);
        String nom = req.getParameter("nom");
        double tarif = Double.parseDouble(req.getParameter("tarif"));
        double duree = Double.parseDouble(req.getParameter("duree"));
        int unite = Integer.parseInt(req.getParameter("unite"));
        artiste.setDuree(duree);
        artiste.setIdunite(unite);
        artiste.setEtat(0);
        artiste.setNom(nom);
        artiste.setTarif(tarif);
        artiste.setSary(fileName);
        artiste.insertArtiste(b, artiste);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "/deleteArtiste")
    public String deleteArtiste(HttpServletRequest req) throws Exception {
        int id = Integer.parseInt(req.getParameter("id"));
        artiste.setId(id);
        artisteDAO.deleteArtiste(artiste);
        return "redirect:listeArtiste";
    }

    @RequestMapping(value = "/formModifArtiste")
    public ModelAndView formModifArtiste(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        int id = Integer.parseInt(req.getParameter("idModif"));
        ArrayList<Unite> listUnite = uniteDAO.listUnite();
        ArrayList<Artiste> listArtiste = artisteDAO.listArtisteModif(id);
        mv.addObject("listArtiste", listArtiste);
        mv.addObject("listUnite", listUnite);
        mv.addObject("id", id);
        mv.setViewName("modifArtiste");
        return mv;
    }

    @RequestMapping(value = "/modifArtiste")
    public ModelAndView modifArtiste(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        String nom = req.getParameter("nom");
        double tarif = Double.parseDouble(req.getParameter("tarif"));
        double duree = Double.parseDouble(req.getParameter("duree"));
        int unite = Integer.parseInt(req.getParameter("unite"));
        int id = Integer.parseInt(req.getParameter("id"));
        artiste.setDuree(duree);
        artiste.setIdunite(unite);
        artiste.setId(id);
        artiste.setNom(nom);
        artiste.setTarif(tarif);

        artisteDAO.modifArtiste(artiste);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "/formAjoutSono")
    public ModelAndView formAjoutSono() throws Exception {
        ModelAndView mv = new ModelAndView();
        ArrayList<Unite> listUnite = uniteDAO.listUnite();
        ArrayList<Typesonorisation> listSono = typesonorisationDAO.listTypesonorisation();
        mv.addObject("listSono", listSono);
        mv.addObject("listUnite", listUnite);
        mv.setViewName("ajoutSono");
        return mv;
    }

    @RequestMapping(value = "/ajoutSono")
    public ModelAndView ajoutSono(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        int type = Integer.parseInt(req.getParameter("type"));
        double tarif = Double.parseDouble(req.getParameter("tarif"));
        double duree = Double.parseDouble(req.getParameter("duree"));
        int unite = Integer.parseInt(req.getParameter("unite"));
        sonorisation.setDuree(duree);
        sonorisation.setEtat(0);
        sonorisation.setIdtypesono(type);
        sonorisation.setIdunite(unite);
        sonorisation.setTarif(tarif);
        sonorisation.insertSono(b, sonorisation);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "/formAjoutLogistique")
    public ModelAndView formAjoutLogistique() throws Exception {
        ModelAndView mv = new ModelAndView();
        ArrayList<Typelogistique> listLogistique = typelogistiqueDAO.listTypelogistique();
        ArrayList<Unite> listUnite = uniteDAO.listUnite();
        mv.addObject("listLogistique", listLogistique);
        mv.addObject("listUnite", listUnite);
        mv.setViewName("ajoutLogistique");
        return mv;
    }

    @RequestMapping(value = "/ajoutLogistique")
    public ModelAndView ajoutLogistique(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        int type = Integer.parseInt(req.getParameter("type"));
        double tarif = Double.parseDouble(req.getParameter("tarif"));
        double duree = Double.parseDouble(req.getParameter("duree"));
        int unite = Integer.parseInt(req.getParameter("unite"));
        logistique.setDuree(duree);
        logistique.setEtat(0);
        logistique.setIdtypelogistique(type);
        logistique.setIdunite(unite);
        logistique.setTarif(tarif);
        logistique.insertLogistique(b, logistique);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "/formAjoutDepense")
    public ModelAndView formAjoutDepense() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("ajoutDepense");
        return mv;
    }

    @RequestMapping(value = "/ajoutDepense")
    public ModelAndView ajoutDepense(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        String type = req.getParameter("type");
        depense.setEtat(0);
        depense.setType(type);
        depense.insertDepense(b, depense);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "/formAjoutLieu")
    public ModelAndView formAjoutLieu() throws Exception {
        ModelAndView mv = new ModelAndView();
        ArrayList<Ville> listVille = villeDAO.listVille();
        ArrayList<Typelieu> listeTypeLieu = typelieuDAO.listTypelieu();
        ArrayList<Categorieplace> listCategorie = categorieplaceDAO.listCategorieplace();
        mv.addObject("listVille", listVille);
        mv.addObject("listCategorie", listCategorie);
        mv.addObject("listeTypeLieu", listeTypeLieu);
        mv.setViewName("ajoutLieu");
        return mv;
    }

    @RequestMapping(value = "/ajoutLieu")
    public ModelAndView ajoutLieu(HttpServletRequest req, @RequestParam MultipartFile file) throws Exception {
        ModelAndView mv = new ModelAndView();
        String path = req.getServletContext().getRealPath("/ressources/assets/");
        Test t = new Test();
        String fileName = t.uploadPhoto(path, file);
        Lieuphoto lieuPhoto = new Lieuphoto();
        String nom = req.getParameter("nom");
        int type = Integer.parseInt(req.getParameter("type"));
        int ville = Integer.parseInt(req.getParameter("ville"));
        int nbrPersonne = Integer.parseInt(req.getParameter("nbrpersonne"));
        lieu.setEtat(0);
        lieu.setIdtypelieu(type);
        lieu.setIdville(ville);
        lieu.setNom(nom);
        lieu.setNbrpersonnes(nbrPersonne);
        lieu.insertLieu(b, lieu);
        LieuDAO lieuDAO = new LieuDAO();
        int dernierLieu = lieuDAO.dernierLieu();
        Lieucategorieplace lieucategorieplace = new Lieucategorieplace();
        ArrayList<Categorieplace> listCategorie = categorieplaceDAO.listCategorieplace();
        int[] nbr = new int[listCategorie.size()];
        for (int i = 0; i < listCategorie.size(); i++) {
            nbr[i] = Integer.parseInt(req.getParameter("nbrReserve" + i));
            lieucategorieplace.setCapacite(nbr[i]);
            lieucategorieplace.setIdcategorieplace(listCategorie.get(i).getId());
            lieucategorieplace.setIdlieu(dernierLieu);
            lieucategorieplace.insertLieucategorieplace(b, lieucategorieplace);
        }
        lieuPhoto.setIdlieu(dernierLieu);
        lieuPhoto.setSary(fileName);
        lieuPhoto.insertLieuphoto(b, lieuPhoto);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "/formAjoutEmploye")
    public ModelAndView formAjoutEmploye() throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("ajoutEmploye");
        return mv;
    }

    @RequestMapping(value = "/ajoutEmploye")
    public ModelAndView ajoutEmploye(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        String adresse = req.getParameter("adresse");
        String mdp = req.getParameter("mdp");
        String contact = req.getParameter("contact");
        String sexe = req.getParameter("sexe");
        employe.setAdresse(adresse);
        employe.setContact(contact);
        employe.setEtat(0);
        employe.setMdp(mdp);
        employe.setNom(nom);
        employe.setPrenom(prenom);
        employe.setSexe(sexe);
        employe.insertEmploye(b, employe);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "/formAjoutDevisSpectacle")
    public ModelAndView formAjoutDevisSpectacle() throws Exception {
        ModelAndView mv = new ModelAndView();
        ArrayList<Typeprestation> listTypePrestation = typeprestationDAO.listTypeprestation();
        V_lieuDAO v_lieuDAO = new V_lieuDAO();
        ArrayList<V_lieu> listLieu = v_lieuDAO.getAll();
        mv.addObject("listTypePrestation", listTypePrestation);
        mv.addObject("listLieu", listLieu);
        mv.setViewName("ajoutDevisSpectacle");
        return mv;
    }

    @RequestMapping(value = "/formDevisSpectcleSuivant")
    public ModelAndView formDevisSpectcleSuivant(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        String nom = req.getParameter("nom");
        int type = Integer.parseInt(req.getParameter("type"));
        Date datePrestation = Date.valueOf(req.getParameter("date"));
        System.out.println("time " + req.getParameter("heure"));
        String heurePrestation = req.getParameter("heure");

        prestation.setEtat(0);
        prestation.setIdemploye(1);
        prestation.setIdtypeprestation(type);
        prestation.setNomprestation(nom);
        prestation.setDatespectacle(datePrestation);
        prestation.setHeurespectacle(heurePrestation);
        prestation.insertPrestation(b, prestation);
        int dernierPrestation = prestationDAO.dernierInsererPrestation();

        int lieu = Integer.parseInt(req.getParameter("lieu"));
        System.out.println("lieu " + lieu);
        double tarifLieu = Double.parseDouble(req.getParameter("tarifLieu"));
        Prestationlieu prestationlieu = new Prestationlieu();
        prestationlieu.setEtat(0);
        prestationlieu.setIdlieu(lieu);
        prestationlieu.setIdprestation(dernierPrestation);
        prestationlieu.setTarif(tarifLieu);
        prestationlieu.insertPrestationlieu(b, prestationlieu);
        V_lieucategorieplaceDAO v_lieucategorieplaceDAO = new V_lieucategorieplaceDAO();
        ArrayList<V_lieucategorieplace> listCategoriePlace = v_lieucategorieplaceDAO.listV_lieucategorieplaceByIdLieu(lieu);
        System.out.println("taille " + listCategoriePlace.size());
        ArrayList<Artiste> listArtiste = artisteDAO.getAllArtiste();
        ArrayList<V_sono> listSono = v_sonoDAO.getAllVSono();
        ArrayList<V_logistique> listLogistique = v_logistiqueDAO.getAllVLogistique();
        ArrayList<Depense> listDepense = depenseDAO.getAllDepense();
        mv.addObject("listArtiste", listArtiste);
        mv.addObject("listCategoriePlace", listCategoriePlace);
        mv.addObject("lieu", lieu);
        mv.addObject("dernierPrestation", dernierPrestation);
        mv.addObject("listSono", listSono);
        mv.addObject("listLogistique", listLogistique);
        mv.addObject("listDepense", listDepense);
//        System.out.println("dernier "+dernierPrestation);
        mv.setViewName("ajoutDevisSpectacleSuivant");
        return mv;
    }

    @RequestMapping(value = "/formAjoutTaxe")
    public ModelAndView formAjoutTaxe() throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("ajoutTaxe");
        return mv;
    }

    @RequestMapping(value = "/ajoutTaxe")
    public ModelAndView ajoutTaxe(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        Taxe taxe = new Taxe();
        int nb = Integer.parseInt(req.getParameter("taxe"));
        taxe.setTaxe(nb);
        taxe.insertTaxe(b, taxe);
        mv.setViewName("index");
        return mv;
    }
    
     @RequestMapping(value = "/formModifTaxe")
    public ModelAndView formModifTaxe(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        int id = Integer.parseInt(req.getParameter("idModif"));
        TaxeDAO taxeDAO = new TaxeDAO();
        ArrayList<Taxe> listTaxe = taxeDAO.listTaxe();
        mv.addObject("listTaxe", listTaxe);
        mv.addObject("id", id);
        mv.setViewName("modifTaxe");
        return mv;
    }
    
    @RequestMapping(value = "/modifTaxe")
    public ModelAndView modifTaxe(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        Taxe taxe = new Taxe();
        TaxeDAO taxeDAO = new TaxeDAO();
        int nb = Integer.parseInt(req.getParameter("taxe"));
         int id = Integer.parseInt(req.getParameter("id"));
         taxe.setId(id);
        taxe.setTaxe(nb);
        taxeDAO.modifArtiste(taxe);
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "/ajoutDevisSpectacle")
    public ModelAndView ajoutDevisSpectacle(HttpServletRequest req) throws Exception {
        ModelAndView mv = new ModelAndView();
        int lieu = Integer.parseInt(req.getParameter("lieu"));
        int dernierPrestation = Integer.parseInt(req.getParameter("dernierPrestation"));

        //insert lieu  categorie place 
        Prestationlieucategorieplace prestationlieucategorieplace = new Prestationlieucategorieplace();
        V_lieucategorieplaceDAO v_lieucategorieplaceDAO = new V_lieucategorieplaceDAO();
        ArrayList<V_lieucategorieplace> listLieuCategoriePlace = v_lieucategorieplaceDAO.listV_lieucategorieplaceByIdLieu(lieu);
        int[] nbr = new int[listLieuCategoriePlace.size()];
        double[] montantCategoriePlace = new double[listLieuCategoriePlace.size()];
        for (int i = 0; i < listLieuCategoriePlace.size(); i++) {
            nbr[i] = Integer.parseInt(req.getParameter("nbrReserve" + i));
            montantCategoriePlace[i] = nbr[i] * listLieuCategoriePlace.get(i).getCapacite();
            prestationlieucategorieplace.setEtat(0);
            prestationlieucategorieplace.setIdlieu(lieu);
            prestationlieucategorieplace.setIdlieucategorieplace(listLieuCategoriePlace.get(i).getIdcategorieplace());
            prestationlieucategorieplace.setIdprestation(dernierPrestation);
            prestationlieucategorieplace.setTarif(nbr[i]);
            prestationlieucategorieplace.setTotalcategorieplace(montantCategoriePlace[i]);
            prestationlieucategorieplace.insertPrestationlieucategorieplace(b, prestationlieucategorieplace);
        }

        //insertion artiste
        int nombreArtiste = Integer.parseInt(req.getParameter("nombreArtiste"));
        Prestationartiste prestationartiste = new Prestationartiste();
        if (nombreArtiste == 0) {
            System.out.println("tsy misy artiste");
        } else {
            int[] artiste = new int[nombreArtiste];
            double[] dureeArtiste = new double[nombreArtiste];
            double[] montantTotalArtiste = new double[nombreArtiste];
            for (int i = 1; i <= nombreArtiste; i++) {
                artiste[i - 1] = Integer.parseInt(req.getParameter("artiste" + i));
                dureeArtiste[i - 1] = Double.parseDouble(req.getParameter("dureeArtiste" + i));
                montantTotalArtiste[i - 1] = Double.parseDouble(req.getParameter("montantTotalArtiste" + i));
                prestationartiste.setDuree(dureeArtiste[i - 1]);
                prestationartiste.setEtat(0);
                prestationartiste.setIdartiste(artiste[i - 1]);
                prestationartiste.setIdprestation(dernierPrestation);
                prestationartiste.setMontanttotal(montantTotalArtiste[i - 1]);
                prestationartiste.insertPrestationartiste(b, prestationartiste);
            }
        }

        //insertion sonorisation
        int nombreSono = Integer.parseInt(req.getParameter("nombreSono"));
        Prestationsono prestationsono = new Prestationsono();
        if (nombreSono == 0) {
            System.out.println("tsy misy sono");
        } else {
            int[] sono = new int[nombreSono];
            double[] dureeSono = new double[nombreSono];
            double[] montantTotalSono = new double[nombreSono];
            for (int j = 1; j <= nombreSono; j++) {
                sono[j - 1] = Integer.parseInt(req.getParameter("sono" + j));
                dureeSono[j - 1] = Double.parseDouble(req.getParameter("dureeSono" + j));
                montantTotalSono[j - 1] = Double.parseDouble(req.getParameter("montantTotalSono" + j));
                prestationsono.setDuree(dureeSono[j - 1]);
                prestationsono.setEtat(0);
                prestationsono.setIdprestation(dernierPrestation);
                prestationsono.setIdsono(sono[j - 1]);
                prestationsono.setMontanttotal(montantTotalSono[j - 1]);
                prestationsono.insertPrestationsono(b, prestationsono);
            }
        }

        //insertion logistique
        int nombreLogistique = Integer.parseInt(req.getParameter("nombreLogistique"));
        Prestationlogistique prestationlogistique = new Prestationlogistique();
        if (nombreLogistique == 0) {
            System.out.println("tsy misy logistique");
        } else {
            int[] logistique = new int[nombreLogistique];
            double[] dureeLogistique = new double[nombreLogistique];
            double[] montantTotalLogistique = new double[nombreLogistique];
            for (int h = 1; h <= nombreLogistique; h++) {
                logistique[h - 1] = Integer.parseInt(req.getParameter("logistique" + h));
                dureeLogistique[h - 1] = Double.parseDouble(req.getParameter("dureeLogistique" + h));
                montantTotalLogistique[h - 1] = Double.parseDouble(req.getParameter("montantTotalLogistique" + h));
                prestationlogistique.setDuree(dureeLogistique[h - 1]);
                prestationlogistique.setEtat(0);
                prestationlogistique.setIdlogistique(logistique[h - 1]);
                prestationlogistique.setIdprestation(dernierPrestation);
                prestationlogistique.setMontanttotal(montantTotalLogistique[h - 1]);
                prestationlogistique.insertPrestationlogistique(b, prestationlogistique);
            }
        }

        //insertion depense
        int nombreDepense = Integer.parseInt(req.getParameter("nombreDepense"));
        Prestationdepense prestationdepense = new Prestationdepense();
        if (nombreDepense == 0) {
            System.out.println("tsy misy depense");
        } else {
            int[] depense = new int[nombreDepense];
            double[] tarifDepense = new double[nombreDepense];
            for (int k = 1; k <= nombreDepense; k++) {
                depense[k - 1] = Integer.parseInt(req.getParameter("depense" + k));
                tarifDepense[k - 1] = Double.parseDouble(req.getParameter("tarifDepense" + k));
                prestationdepense.setEtat(0);
                prestationdepense.setIddepense(depense[k - 1]);
                prestationdepense.setIdprestation(dernierPrestation);
                prestationdepense.setTarif(tarifDepense[k - 1]);
                prestationdepense.insertPrestationdepense(b, prestationdepense);
            }
        }

        //devis
        Devis devis = new Devis();
        double sommeDevis = devis.devisPrestation(dernierPrestation);

        //recette 
        PrestationlieucategorieplaceDAO prestationlieucategorieplaceDAO = new PrestationlieucategorieplaceDAO();
        double recette = prestationlieucategorieplaceDAO.sumTarifCategorieByIdPrestation(dernierPrestation, lieu);

        //depense 
        PrestationlieuDAO prestationlieuDAO = new PrestationlieuDAO();
        double depense = prestationlieuDAO.sumTarifLieuByIdPrestation(dernierPrestation);

        //benefice
        BeneficeDAO beneficeDAO = new BeneficeDAO();
        double benefice = beneficeDAO.beneficeLieu(dernierPrestation, lieu);

        // benefice avec taxe
        double beneficeAvecTaxe = beneficeDAO.beneficeLieuAvecTaxe(dernierPrestation, lieu);
        System.out.println("beneficeAvecTaxe "+beneficeAvecTaxe);

        Prestationdevis prestationdevis = new Prestationdevis();
        prestationdevis.setBenefice(benefice);
        prestationdevis.setBeneficeavectaxe(beneficeAvecTaxe);
        prestationdevis.setDepense(depense);
        prestationdevis.setEtat(0);
        prestationdevis.setIdprestation(dernierPrestation);
        prestationdevis.setMontanttotal(sommeDevis);
        prestationdevis.setRecette(recette);
        prestationdevis.insertPrestationdevis(b, prestationdevis);

        System.out.println("devis " + sommeDevis);
        mv.addObject("sommeDevis", sommeDevis);
        mv.addObject("benefice", benefice);
        mv.addObject("recette", recette);
        mv.addObject("depense", depense);
        mv.setViewName("resultat");
        return mv;
    }
}
