/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.codefellaz.services;
import java.util.List;
import tn.esprit.codefellaz.entities.CategorieService;

/**
 *
 * @author user
 */
public interface InterfaceCategorieService {
    
    public void ajouterCategorieService(CategorieService cs) ; 
    public void modifierNomCategorieService(int idCategorieService, String nomCategorieService);
    public void supprimerCategorieService (int idOffreService) ;
    public  List<CategorieService> afficherCategorieService() ;
    
    
    
}
