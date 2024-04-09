/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionIcad.model;

/**
 *
 * @author Kyorai
 */
public class Utilisateur {

    private int idUtilisateur;
    private String nomUser;
    private String prenomUser;
    private String motDePasseUser;
    private String emailUser;
    private String fonctionUser;
    private String adresseUser;
    private String villeUser;
    private String codePostalUser;
    private String telephoneUser;

    public Utilisateur(int idUtilisateur, String nomUser, String prenomUser, String motDePasseUser, String emailUser, String fonctionUser, String adresseUser, String villeUser, String codePostalUser, String telephoneUser) {
        this.idUtilisateur = idUtilisateur;
        this.nomUser = nomUser;
        this.prenomUser = prenomUser;
        this.motDePasseUser = motDePasseUser;
        this.emailUser = emailUser;
        this.fonctionUser = fonctionUser;
        this.adresseUser = adresseUser;
        this.villeUser = villeUser;
        this.codePostalUser = codePostalUser;
        this.telephoneUser = telephoneUser;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getPrenomUser() {
        return prenomUser;
    }

    public void setPrenomUser(String prenomUser) {
        this.prenomUser = prenomUser;
    }

    public String getMotDePasseUser() {
        return motDePasseUser;
    }

    public void setMotDePasseUser(String motDePasseUser) {
        this.motDePasseUser = motDePasseUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getFonctionUser() {
        return fonctionUser;
    }

    public void setFonctionUser(String fonctionUser) {
        this.fonctionUser = fonctionUser;
    }

    public String getAdresseUser() {
        return adresseUser;
    }

    public void setAdresseUser(String adresseUser) {
        this.adresseUser = adresseUser;
    }

    public String getVilleUser() {
        return villeUser;
    }

    public void setVilleUser(String villeUser) {
        this.villeUser = villeUser;
    }

    public String getCodePostalUser() {
        return codePostalUser;
    }

    public void setCodePostalUser(String codePostalUser) {
        this.codePostalUser = codePostalUser;
    }

    public String getTelephoneUser() {
        return telephoneUser;
    }

    public void setTelephoneUser(String telephoneUser) {
        this.telephoneUser = telephoneUser;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "idUtilisateur=" + idUtilisateur + ", nomUser=" + nomUser + ", prenomUser=" + prenomUser + ", motDePasseUser=" + motDePasseUser + ", emailUser=" + emailUser + ", fonctionUser=" + fonctionUser + ", adresseUser=" + adresseUser + ", villeUser=" + villeUser + ", codePostalUser=" + codePostalUser + ", telephoneUser=" + telephoneUser + '}';
    }
    

}
