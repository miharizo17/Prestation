/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import dao.Connexion;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;

/**
 *
 * @author Kanto
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

//        Document document = new Document();
//        int a = 17;
//        String nomPdf= "zo";
//        try {
//            PdfWriter.getInstance(document, new FileOutputStream("D://S6//evaluation//pdf//" + nomPdf + ".pdf"));
//        } catch (FileNotFoundException ex) {
//
//        }
//        document.open();
//        Image image = new Image(ImageDataFactory.create("D://S6//evaluation//pdf//Capture1.png"));
//            image.setWidth(200); // Définir la largeur de l'image
//            image.setHeight(300); // Définir la hauteur de l'image
//            image.setHorizontalAlignment(HorizontalAlignment.CENTER); // Définir l'alignement horizontal de l'image
//
//            document.add(image);
//        document.add(new Paragraph("                                                                    PLANIFICATION"));
//
//        document.add(new Paragraph("Jour \n"));
//
//        document.close();

            Connexion conn = new Connexion();
            Connection c = conn.getConnexion();
            Test t = new Test();
//            t.setAge(19);
//            t.setNom("Nanto");
//            t.setPrenom("zo");
            t.suppression("test", 0);

    }

}
