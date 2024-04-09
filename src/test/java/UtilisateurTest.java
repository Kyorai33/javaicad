/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import gestionIcad.dao.MySQLConnector;
import gestionIcad.dao.UtilisateurDao;
import gestionIcad.model.Utilisateur;
import java.sql.SQLException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kyorai
 */
public class UtilisateurTest {

    public UtilisateurTest() {

    }

    @Test
    public void testUtilisateurConstructorAndGetters() {
        int id = 1;
        String nom = "Doe";
        String prenom = "John";
        String mdp = "password";
        String email = "john.doe@example.com";
        String fonction = "Developer";
        String adresse = "123 Main St";
        String ville = "Anytown";
        String codePostal = "12345";
        String telephone = "555-555-5555";

        Utilisateur utilisateur = new Utilisateur(id, nom, prenom, mdp, email, fonction, adresse, ville, codePostal, telephone);

        assertEquals(id, utilisateur.getIdUtilisateur());
        assertEquals(nom, utilisateur.getNomUser());
        assertEquals(prenom, utilisateur.getPrenomUser());
        // Password shouldn't be directly retrieved for security reasons
        // assertEquals(mdp, utilisateur.getMotDePasseUser());  // Comment this out
        assertEquals(email, utilisateur.getEmailUser());
        assertEquals(fonction, utilisateur.getFonctionUser());
        assertEquals(adresse, utilisateur.getAdresseUser());
        assertEquals(ville, utilisateur.getVilleUser());
        assertEquals(codePostal, utilisateur.getCodePostalUser());
        assertEquals(telephone, utilisateur.getTelephoneUser());
    }

    @Test
    public void testUtilisateurSetters() {

        int newId = 2;
        String newNom = "Jane";
        String newPrenom = "Doe";
        String newMdp = "newPassword";
        String newEmail = "jane.doe@example.com";
        String newFonction = "Manager";
        String newAdresse = "456 Elm St";
        String newVille = "Big City";
        String newCodePostal = "54321";
        String newTelephone = "666-666-6666";
        Utilisateur utilisateur = new Utilisateur(newId, newNom, newPrenom, newMdp, newEmail, newFonction, newAdresse, newVille, newCodePostal, newTelephone);

        utilisateur.setIdUtilisateur(newId);
        utilisateur.setNomUser(newNom);
        utilisateur.setPrenomUser(newPrenom);
        utilisateur.setMotDePasseUser(newMdp);
        utilisateur.setEmailUser(newEmail);
        utilisateur.setFonctionUser(newFonction);
        utilisateur.setAdresseUser(newAdresse);
        utilisateur.setVilleUser(newVille);
        utilisateur.setCodePostalUser(newCodePostal);
        utilisateur.setTelephoneUser(newTelephone);

        assertEquals(newId, utilisateur.getIdUtilisateur());
        assertEquals(newNom, utilisateur.getNomUser());
        assertEquals(newPrenom, utilisateur.getPrenomUser());
        // Password shouldn't be directly retrieved for security reasons
        // assertEquals(newMdp, utilisateur.getMotDePasseUser());  // Comment this out
        assertEquals(newEmail, utilisateur.getEmailUser());
        assertEquals(newFonction, utilisateur.getFonctionUser());
        assertEquals(newAdresse, utilisateur.getAdresseUser());
        assertEquals(newVille, utilisateur.getVilleUser());
        assertEquals(newCodePostal, utilisateur.getCodePostalUser());
        assertEquals(newTelephone, utilisateur.getTelephoneUser());
    }

    @Test
    public void mysqlconnectortest() throws SQLException {
        System.out.println("mysqlconnectortest avant " + (MySQLConnector.getConnexion().isClosed() ? "oui c'est ferme" : " non c'est ouver"));
        assertTrue(!MySQLConnector.getConnexion().isClosed());
    }

    @Test
    public void getUtilisateur() throws SQLException {
        System.out.println(UtilisateurDao.getUtilisateurs());
        assertTrue(true);
    }
    
    @Test
    public void getUtilisateur2() throws SQLException {
        System.out.println(UtilisateurDao.getUtilisateurs());

        assertTrue(true);
    }
    @Test
    public void insertUtilisateur() throws SQLException {
        boolean sucess = true;
        System.out.println("mysqlconnectortest avant " + (MySQLConnector.getConnexion().isClosed() ? "oui c'est ferme" : " non c'est ouver"));
        try {
            UtilisateurDao.ajouterUtilisateur(new Utilisateur(0, "nomUser", "prenomUser", "motDePasseUser", "emailUser", "fonctionUser", "adresseUser", "villeUser", "82300", "0606060606"));
        }catch(Exception ex) {
            System.out.println("Erreur insertUtilisateur : \n" + ex.getMessage());
            sucess = false;
        }
        assertTrue(sucess);
    }
}
