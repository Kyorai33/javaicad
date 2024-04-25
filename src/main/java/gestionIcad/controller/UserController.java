/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionIcad.controller;

import gestionIcad.dao.UtilisateurDao;
import gestionIcad.model.Utilisateur;
import gestionIcad.vue.EditUser;
import gestionIcad.vue.MainFrame;
import static gestionIcad.vue.MainFrame.utilisateurTableModel;
import static gestionIcad.vue.MainFrame.utilisateurs;
import gestionIcad.vue.NewUser;
import static java.awt.Frame.ICONIFIED;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Kyorai
 */
public class UserController {

    private int idUtilisateur;
    private String ancienMotDePasse;

    public void AjoutUtilisateur(JTextField fieldNom, JTextField fieldPrenom, JTextField fieldNumeroTelephone,
            JPasswordField fieldMotDePasse, JTextField fieldEmail,
            JTextField fieldAdresse, JTextField fieldVille, JTextField fieldCodePostal,
            JComboBox ComboBoxFonction, String nomSaisi, String prenomSaisi,
            String numeroTelephoneSaisi, String motDePasseSaisi, String emailSaisi,
            String adresseSaisi, String villeSaisi, String codePostalSaisi, String fonctionSaisi) {

        // Validation des données
        if (!validerDonnees(nomSaisi, prenomSaisi, motDePasseSaisi, emailSaisi, fonctionSaisi, adresseSaisi, villeSaisi, codePostalSaisi, numeroTelephoneSaisi, false, 0)) {
            return; // On quitte la méthode si la validation échoue
        }
        try {
            motDePasseSaisi = hashPassword(motDePasseSaisi);
            Utilisateur utilisateur = new Utilisateur(ICONIFIED, nomSaisi, prenomSaisi, motDePasseSaisi, emailSaisi, fonctionSaisi, adresseSaisi, villeSaisi, codePostalSaisi, numeroTelephoneSaisi);
            UtilisateurDao.ajouterUtilisateur(utilisateur);
            JOptionPane.showMessageDialog(null, "Utilisateur ajouté avec succès!", "Succès", JOptionPane.INFORMATION_MESSAGE);
            fieldNom.setText("");
            fieldPrenom.setText("");
            fieldNumeroTelephone.setText("");
            fieldMotDePasse.setText("");
            fieldEmail.setText("");
            fieldAdresse.setText("");
            fieldVille.setText("");
            fieldCodePostal.setText("");
            ComboBoxFonction.setSelectedItem("Véterinaire"); // Réinitialiser la liste déroulante à vétérinaire

        } catch (SQLException ex) {
            Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "L'ajout de l'utilisateur a échoué. Erreur : " + ex.getErrorCode(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ModifierUtilisateur(int idUtilisateur, String ancienMotDePasse, String nomSaisi, String prenomSaisi, String numeroTelephoneSaisi, String motDePasseSaisi, String emailSaisi, String adresseSaisi, String villeSaisi, String codePostalSaisi, String fonctionSaisi) {
        this.idUtilisateur = idUtilisateur;
        this.ancienMotDePasse = ancienMotDePasse;
        // Validation des données
        if (!validerDonnees(nomSaisi, prenomSaisi, motDePasseSaisi, emailSaisi, fonctionSaisi, adresseSaisi, villeSaisi, codePostalSaisi, numeroTelephoneSaisi, true, idUtilisateur)) {
            return; // On quitte la méthode si la validation échoue
        }
        if (!motDePasseSaisi.isEmpty()) {
            motDePasseSaisi = hashPassword(motDePasseSaisi);
        } else {
            motDePasseSaisi = this.ancienMotDePasse;
        }
        try {
            Utilisateur utilisateur = new Utilisateur(this.idUtilisateur, nomSaisi, prenomSaisi, motDePasseSaisi, emailSaisi, fonctionSaisi, adresseSaisi, villeSaisi, codePostalSaisi, numeroTelephoneSaisi);
            UtilisateurDao.modifierUtilisateur(utilisateur);
            JOptionPane.showMessageDialog(null, "Utilisateur modifié avec succès !", "Succès", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(EditUser.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "L'ajout de l'utilisateur a échoué. Erreur : " + ex.getErrorCode(), "Erreur", JOptionPane.ERROR_MESSAGE);

        }
    }
    public void SupprimerUtilisateur(int idUtilisateur, int selectedRow) {
        try {
                UtilisateurDao.supprimerUtilisateur(idUtilisateur);
            } catch (SQLException ex) {
                if (ex.getErrorCode() == 1451) {     // Vérifie si l'erreur est une violation de contrainte de clé étrangère
                    JOptionPane.showMessageDialog(null,"L'utilisateur ne peut pas être supprimé car il est lié à d'autres données dans le système. Erreur : " + ex.getErrorCode(), "Erreur", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,"La suppression de l'utilisateur a échoué. Erreur :" + ex.getErrorCode(), "Erreur", JOptionPane.INFORMATION_MESSAGE);
                }
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                return;
            }
            MainFrame.utilisateurTableModel.removeRow(selectedRow);
            MainFrame.utilisateurs.remove(selectedRow);  // Supprimer l'utilisateur de la liste
            JOptionPane.showMessageDialog(null,"L'utilisateur a été supprimé avec succès.", "Suppression réussie", JOptionPane.INFORMATION_MESSAGE);  // Afficher un message de succès

        }
    

    private static boolean validerDonnees(String nom, String prenom, String motDePasse, String email, String fonction, String adresse, String ville, String codePostal, String numeroTelephone, boolean modification, int idUtilisateur) {
        String messageErreur = "";
        // Validation du nom
        if (nom.isEmpty()) {
            messageErreur += "Le nom est obligatoire.\n";
        }

        // Validation du prénom
        if (prenom.isEmpty()) {
            messageErreur += "Le prénom est obligatoire.\n";
        }

        // Validation du mot de passe
        if (modification == true) {
            if (!motDePasseIsEmpty(motDePasse)) {
                if (!motDePasse.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!_.,:;?/]).{8,30}$")) {
                    messageErreur += "Le mot de passe doit contenir 8 à 30 caractères, dont une minuscule, une majuscule, un chiffre et un caractère spécial.\n";
                }
            }
        }

        if (modification == false) {
            if (!motDePasse.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!_.,:;?/]).{8,30}$")) {
                messageErreur += "Le mot de passe doit contenir 8 à 30 caractères, dont une minuscule, une majuscule, un chiffre et un caractère spécial.\n";
            }

        }

        // Validation de l'email
        if (!email.matches("[\\w-\\.]+@([\\w-]+\\.)+[\\w-]+")) {
            messageErreur += "L'adresse email n'est pas valide.\n";
        }

        // Validation de la fonction
        if (fonction.isEmpty()) {
            messageErreur += "La fonction est obligatoire.\n";
        }

        // Validation de l'adresse
        if (adresse.isEmpty()) {
            messageErreur += "L'adresse est obligatoire.\n";
        }

        // Validation du code postal
        if (codePostal.isEmpty()) {
            messageErreur += "Le code postal n'est pas valide.\n";
        }

        // Validation de la ville
        if (ville.isEmpty()) {
            messageErreur += "La ville est obligatoire.\n";
        }

        // Validation du numéro de téléphone
        if (!numeroTelephone.matches("^\\+?[0-9]{1,3}( )?[- .]?(\\(\\d{3}\\))?([0-9]{3}[ ]?){2}\\d{3}$")) {
            messageErreur += "Le numéro de téléphone n'est pas valide.\n";
        }

        //Verification que l'adresse email ne soit pas déjà utilisée
        for (Utilisateur u : MainFrame.utilisateurs) {    // Vérifie que l'email n'est pas déjà utilisée
            if (u.getIdUtilisateur() == idUtilisateur) {
            } else if (u.getEmailUser().equals(email)) {
                messageErreur += "L'adresse Email est déjà utilisée.\n";
                ;
            }
        }

        // Affichage du message d'erreur et retour
        if (!messageErreur.isEmpty()) {
            JOptionPane.showMessageDialog(null, messageErreur, "Erreur", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private static boolean motDePasseIsEmpty(String motDePasse) {
        if (motDePasse.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public static String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
    
    public static void addDocumentFilter(JTextField textField, int maxLength) {
        ((AbstractDocument) textField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Vérifie si le nombre total de caractères après remplacement ne dépasse pas maxLength
                if ((fb.getDocument().getLength() + text.length() - length) <= maxLength) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
    }

}
