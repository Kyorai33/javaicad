/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionIcad.dao;

import gestionIcad.model.Utilisateur;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
                        resultSet.getString("TELEPHONEUSER")
                ));
            }
            System.out.println("getUtilisateur pendant " + (MySQLConnector.getConnexion().isClosed() ? "est ferme" : "est ouvert"));
        } catch (SQLException ex) {
            System.out.println("getUtilisateurs Erreur :  +  \n" + ex.getMessage());
        }

        return utilisateurs;

    }

    public static void ajouterUtilisateur(Utilisateur utilisateur) throws SQLException {
        String sql = "INSERT INTO utilisateur (NOMUSER, PRENOMUSER, MOTDEPASSEUSER, EMAILUSER, FONCTIONUSER, ADRESSEUSER, VILLEUSER, CODEPOSTALUSER, TELEPHONEUSER) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

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

        statement.executeUpdate();
    }
}
