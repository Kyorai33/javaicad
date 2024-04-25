/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionIcad.dao;

import gestionIcad.model.Utilisateur;
import gestionIcad.vue.MainFrame;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Kyorai
 */
public class UtilisateurDao {

    public static List getUtilisateurs() throws SQLException {
        List utilisateurs = new ArrayList<Utilisateur>();

        try {
            Connection connection = MySQLConnector.getConnexion();
            PreparedStatement statement = connection.prepareStatement("SELECT IDUTILISATEUR, NOMUSER, PRENOMUSER, MOTDEPASSEUSER, EMAILUSER, FONCTIONUSER, ADRESSEUSER, VILLEUSER, CODEPOSTALUSER, TELEPHONEUSER FROM `utilisateur`");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                utilisateurs.add(new Utilisateur(
                        resultSet.getInt("IDUTILISATEUR"),
                        resultSet.getString("NOMUSER"),
                        resultSet.getString("PRENOMUSER"),
                        resultSet.getString("MOTDEPASSEUSER"),
                        resultSet.getString("EMAILUSER"),
                        resultSet.getString("FONCTIONUSER"),
                        resultSet.getString("ADRESSEUSER"),
                        resultSet.getString("VILLEUSER"),
                        resultSet.getString("CODEPOSTALUSER"),
                        resultSet.getString("TELEPHONEUSER")));
            }
        } catch (SQLException ex) {
            System.out.println("getUtilisateurs Erreur :  +  \n" + ex.getMessage());
        }
        return utilisateurs;
    }

    public static void ajouterUtilisateur(Utilisateur utilisateur) throws SQLException {
        String sql = "INSERT INTO utilisateur (NOMUSER, PRENOMUSER, MOTDEPASSEUSER, EMAILUSER, FONCTIONUSER, ADRESSEUSER, VILLEUSER, CODEPOSTALUSER, TELEPHONEUSER) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = MySQLConnector.getConnexion().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        statement.setString(1, utilisateur.getNomUser());
        statement.setString(2, utilisateur.getPrenomUser());
        statement.setString(3, utilisateur.getMotDePasseUser());
        statement.setString(4, utilisateur.getEmailUser());
        statement.setString(5, utilisateur.getFonctionUser());
        statement.setString(6, utilisateur.getAdresseUser());
        statement.setString(7, utilisateur.getVilleUser());
        statement.setString(8, utilisateur.getCodePostalUser());
        statement.setString(9, utilisateur.getTelephoneUser());
        statement.executeUpdate();
        ResultSet generatedKeys = statement.getGeneratedKeys();

        if (generatedKeys.next()) {
            utilisateur.setIdUtilisateur(generatedKeys.getInt(1));
        } else {
            throw new SQLException("Échec de la récupération de l'ID");
        }

        MainFrame.utilisateurs.add(utilisateur);    // Ajout de l'utilisateur à la liste utilisateurs (Pour pouvoir le supprimer ou le modifier par la suite)
        MainFrame.utilisateurTableModel.addRow(new Object[]{
            utilisateur.getIdUtilisateur(),
            utilisateur.getNomUser(),
            utilisateur.getPrenomUser(),
            utilisateur.getEmailUser(),
            utilisateur.getFonctionUser(),
            utilisateur.getAdresseUser(),
            utilisateur.getVilleUser(),
            utilisateur.getCodePostalUser(),
            utilisateur.getTelephoneUser()
        });

        MainFrame.utilisateurTableModel.fireTableDataChanged();    // Pour s'assurer de la mise à jour de la table en temps réel

    }

    public static void supprimerUtilisateur(int idUtilisateur) throws SQLException {
        String sql = "DELETE FROM utilisateur WHERE IDUTILISATEUR = ?";
        PreparedStatement statement = MySQLConnector.getConnexion().prepareStatement(sql);
        statement.setInt(1, idUtilisateur);   // Insère idUtilisateur au premier argument de la requête

        int rowsAffected = statement.executeUpdate();   // Si rowsAffected retourne 1, la suppression à réussie.

        if (rowsAffected == 1) {
            System.out.println("Utilisateur supprimé avec succès.");
        } else {
            System.out.println("Aucun utilisateur n'a été supprimé (ID introuvable).");
        }
    }
    

    public static void modifierUtilisateur(Utilisateur utilisateur) throws SQLException {
        String sql = "UPDATE utilisateur SET NOMUSER = ?, PRENOMUSER = ?, MOTDEPASSEUSER = ?, EMAILUSER = ?, FONCTIONUSER = ?, ADRESSEUSER = ?, VILLEUSER = ?, CODEPOSTALUSER = ?, TELEPHONEUSER = ? WHERE IDUTILISATEUR = ?";
        PreparedStatement statement = MySQLConnector.getConnexion().prepareStatement(sql);
        
        statement.setString(1, utilisateur.getNomUser());
        statement.setString(2, utilisateur.getPrenomUser());
        statement.setString(3, utilisateur.getMotDePasseUser());
        statement.setString(4, utilisateur.getEmailUser());
        statement.setString(5, utilisateur.getFonctionUser());
        statement.setString(6, utilisateur.getAdresseUser());
        statement.setString(7, utilisateur.getVilleUser());
        statement.setString(8, utilisateur.getCodePostalUser());
        statement.setString(9, utilisateur.getTelephoneUser());
        statement.setInt(10, utilisateur.getIdUtilisateur());
        statement.executeUpdate();
        
        // Mise à jour de l'utilisateur dans la liste (optionnel)
        for (int i = 0; i < MainFrame.utilisateurs.size(); i++) {
            if (MainFrame.utilisateurs.get(i).getIdUtilisateur() == utilisateur.getIdUtilisateur()) {
                MainFrame.utilisateurs.set(i, utilisateur);
                break;
            }
        }
        int indexUtilisateur = MainFrame.utilisateurs.indexOf(utilisateur);
        // Mise à jour du modèle de la table (optionnel)
        MainFrame.utilisateurTableModel.setValueAt(utilisateur.getNomUser(), indexUtilisateur, 1);
        MainFrame.utilisateurTableModel.setValueAt(utilisateur.getPrenomUser(), indexUtilisateur, 2);
        MainFrame.utilisateurTableModel.setValueAt(utilisateur.getEmailUser(), indexUtilisateur, 3);
        MainFrame.utilisateurTableModel.setValueAt(utilisateur.getFonctionUser(), indexUtilisateur, 4);
        MainFrame.utilisateurTableModel.setValueAt(utilisateur.getAdresseUser(), indexUtilisateur, 5);
        MainFrame.utilisateurTableModel.setValueAt(utilisateur.getVilleUser(), indexUtilisateur, 6);
        MainFrame.utilisateurTableModel.setValueAt(utilisateur.getCodePostalUser(), indexUtilisateur, 7);
        MainFrame.utilisateurTableModel.setValueAt(utilisateur.getTelephoneUser(), indexUtilisateur, 8);
        MainFrame.utilisateurTableModel.fireTableDataChanged();    // Pour s'assurer de la mise à jour de la table en temps réel

    }
}

