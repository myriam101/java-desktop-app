/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.codefellaz.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import tn.esprit.codefellaz.entities.Produit;
import tn.esprit.codefellaz.entities.User;
import tn.esprit.codefellaz.services.UserService;
import tn.esprit.codefellaz.controllers.AchatProduitsController;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class HomePageClientController implements Initializable {

    @FXML
    private Button services;
    @FXML
    private Button boutique;
    @FXML
    private Button panier;
    @FXML
    private Button reclamations;
    @FXML
    private AnchorPane root;
    
    private Parent fxml ; 
    @FXML
    private ImageView profileImage;
    @FXML
    public Label usernameLabel;
    @FXML
    private ImageView image_front;
    @FXML
    private Button profil;
    @FXML
    private Label usernameLabel11;
    @FXML
    private Label usernameLabel1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        usernameLabel.setText("a");
        
        boutique.setOnAction(retour -> {
                    try {
                       
                      fxml =  FXMLLoader.load(getClass().getResource("/tn/esprit/codefellaz/views/AchatProduits.fxml"));
                       root.getChildren().removeAll() ;
                       root.getChildren().setAll(fxml) ;

                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }

                });
        
        
        profil.setOnAction(RETOUR -> {
             try {
                       
                      fxml =  FXMLLoader.load(getClass().getResource("/tn/esprit/codefellaz/views/Profil.fxml"));
                       root.getChildren().removeAll() ;
                       root.getChildren().setAll(fxml) ;

                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }

        });
        
        
        
          panier.setOnAction(retour -> {
                    try {
                       
                      fxml =  FXMLLoader.load(getClass().getResource("/tn/esprit/codefellaz/views/monpanier.fxml"));
                       root.getChildren().removeAll() ;
                       root.getChildren().setAll(fxml) ;
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }

                });
          
          reclamations.setOnAction(retour -> {
                    try {
                       
                      fxml =  FXMLLoader.load(getClass().getResource("/tn/esprit/codefellaz/views/AjoutReclamation.fxml"));
                       root.getChildren().removeAll() ;
                       root.getChildren().setAll(fxml) ;
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }

                });
          
          services.setOnAction(retour -> {
                    try {
                       
                      fxml =  FXMLLoader.load(getClass().getResource("/tn/esprit/codefellaz/views/HomeView.fxml"));
                       root.getChildren().removeAll() ;
                       root.getChildren().setAll(fxml) ;
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }

                });
          
          
          
          
        
       
    }    
    
}
