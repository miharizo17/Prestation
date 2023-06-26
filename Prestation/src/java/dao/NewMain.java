/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.File;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Kanto
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String url = "http://example.com/upload"; // Remplacez par l'URL de l'API d'upload

        // Chemin vers le fichier image
        String imagePath = "/path/to/image.jpg"; // Remplacez par le chemin de votre image

        File imageFile = new File(imagePath);
        if (!imageFile.exists()) {
            System.out.println("Le fichier image n'existe pas.");
            return;
        }

        // Création de la requête
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);

        MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
        body.add("file", imageFile);

        HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);

        // Envoi de la requête
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.postForEntity(url, requestEntity, String.class);

        // Traitement de la réponse
//        if (response.getStatusCode().is2xxSuccessful()) {
//            System.out.println("L'image a été uploadée avec succès.");
//            System.out.println("Réponse du serveur : " + response.getBody());
//        } else {
//            System.out.println("Une erreur s'est produite lors de l'upload de l'image.");
//            System.out.println("Code d'erreur : " + response.getStatusCode());
//            System.out.println("Message d'erreur : " + response.getBody());
//        }
    }
    
}
