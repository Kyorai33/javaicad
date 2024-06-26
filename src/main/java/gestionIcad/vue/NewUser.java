/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestionIcad.vue;

import gestionIcad.controller.UserController;
/**
 *
 * @author Kyorai
 */
public class NewUser extends javax.swing.JFrame {

    UserController userController;

    public NewUser(UserController newUserController) {
        this.userController = newUserController;
        initComponents();
        UserController.addDocumentFilter(fieldNumeroTelephone, 10);
        UserController.addDocumentFilter(fieldNom, 32);
        UserController.addDocumentFilter(fieldPrenom,32);
        UserController.addDocumentFilter(fieldMotDePasse,30);
        UserController.addDocumentFilter(fieldEmail,50);
        UserController.addDocumentFilter(fieldAdresse,50);
        UserController.addDocumentFilter(fieldVille,40);
        UserController.addDocumentFilter(fieldCodePostal,10);
    }

    public NewUser() {
        initComponents();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fieldPrenom = new javax.swing.JTextField();
        fieldNom = new javax.swing.JTextField();
        fieldNumeroTelephone = new javax.swing.JTextField();
        fieldEmail = new javax.swing.JTextField();
        fieldAdresse = new javax.swing.JTextField();
        fieldVille = new javax.swing.JTextField();
        fieldCodePostal = new javax.swing.JTextField();
        btnValider = new javax.swing.JButton();
        ComboBoxFonction = new javax.swing.JComboBox<>();
        fieldMotDePasse = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        ICAD = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajout d'un utilisateur");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1250, 711));
        setResizable(false);

        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Lexend", 0, 14)); // NOI18N
        jLabel1.setText("Nom");

        jLabel2.setFont(new java.awt.Font("Lexend", 0, 14)); // NOI18N
        jLabel2.setText("Prenom");

        jLabel3.setFont(new java.awt.Font("Lexend", 0, 14)); // NOI18N
        jLabel3.setText("Adresse Email");

        jLabel4.setFont(new java.awt.Font("Lexend", 0, 14)); // NOI18N
        jLabel4.setText("Mot de passe");

        jLabel5.setFont(new java.awt.Font("Lexend", 0, 14)); // NOI18N
        jLabel5.setText("Numéro de téléphone");

        jLabel6.setFont(new java.awt.Font("Lexend", 0, 14)); // NOI18N
        jLabel6.setText("Adresse");

        jLabel7.setFont(new java.awt.Font("Lexend", 0, 14)); // NOI18N
        jLabel7.setText("Ville");

        jLabel8.setFont(new java.awt.Font("Lexend", 0, 14)); // NOI18N
        jLabel8.setText("Code Postal");

        jLabel9.setFont(new java.awt.Font("Lexend", 0, 14)); // NOI18N
        jLabel9.setText("Fonction");

        fieldPrenom.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        fieldPrenom.setMinimumSize(new java.awt.Dimension(168, 34));
        fieldPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPrenomActionPerformed(evt);
            }
        });

        fieldNom.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        fieldNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNomActionPerformed(evt);
            }
        });

        fieldNumeroTelephone.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        fieldNumeroTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNumeroTelephoneActionPerformed(evt);
            }
        });

        fieldEmail.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        fieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEmailActionPerformed(evt);
            }
        });

        fieldAdresse.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        fieldAdresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAdresseActionPerformed(evt);
            }
        });

        fieldVille.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        fieldVille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldVilleActionPerformed(evt);
            }
        });

        fieldCodePostal.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        fieldCodePostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCodePostalActionPerformed(evt);
            }
        });

        btnValider.setBackground(new java.awt.Color(204, 204, 204));
        btnValider.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        btnValider.setForeground(new java.awt.Color(0, 0, 0));
        btnValider.setText("Valider");
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderActionPerformed(evt);
            }
        });

        ComboBoxFonction.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        ComboBoxFonction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Véterinaire", "Policier", "Eleveur" }));
        ComboBoxFonction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxFonctionActionPerformed(evt);
            }
        });

        fieldMotDePasse.setFont(new java.awt.Font("Lexend", 0, 12)); // NOI18N
        fieldMotDePasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMotDePasseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnValider, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNumeroTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldVille, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxFonction, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNom, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fieldNumeroTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fieldAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fieldVille, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxFonction, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addComponent(btnValider, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setMaximumSize(new java.awt.Dimension(1000, 800));
        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 800));

        ICAD.setAlignment(java.awt.Label.CENTER);
        ICAD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ICAD.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        ICAD.setForeground(new java.awt.Color(255, 255, 255));
        ICAD.setMaximumSize(new java.awt.Dimension(1000, 800));
        ICAD.setMinimumSize(new java.awt.Dimension(1000, 800));
        ICAD.setName(""); // NOI18N
        ICAD.setText("ICAD - Nouvel utilisateur");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(ICAD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ICAD, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(356, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(357, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldMotDePasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMotDePasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldMotDePasseActionPerformed

    private void ComboBoxFonctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxFonctionActionPerformed

    }//GEN-LAST:event_ComboBoxFonctionActionPerformed

    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
        // Récupération des données rentrées par l'utilisateur
        String nomSaisi = fieldNom.getText();
        String prenomSaisi = fieldPrenom.getText();
        String numeroTelephoneSaisi = fieldNumeroTelephone.getText();
        String motDePasseSaisi = fieldMotDePasse.getText();
        String emailSaisi = fieldEmail.getText();
        String adresseSaisi = fieldAdresse.getText();
        String villeSaisi = fieldVille.getText();
        String codePostalSaisi = fieldCodePostal.getText();
        String fonctionSaisi = (String) ComboBoxFonction.getSelectedItem();
        if (fonctionSaisi == "Véterinaire") {
            fonctionSaisi = "Veterinaire";
        }
        this.userController.AjoutUtilisateur(fieldNom, fieldPrenom, fieldNumeroTelephone, fieldMotDePasse, fieldEmail, fieldAdresse, fieldVille, fieldCodePostal, ComboBoxFonction,
            nomSaisi, prenomSaisi, numeroTelephoneSaisi, motDePasseSaisi, emailSaisi, adresseSaisi, villeSaisi, codePostalSaisi, fonctionSaisi);

    }//GEN-LAST:event_btnValiderActionPerformed

    private void fieldCodePostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCodePostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCodePostalActionPerformed

    private void fieldVilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldVilleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldVilleActionPerformed

    private void fieldAdresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAdresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAdresseActionPerformed

    private void fieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEmailActionPerformed

    private void fieldNumeroTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNumeroTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNumeroTelephoneActionPerformed

    private void fieldNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNomActionPerformed

    private void fieldPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPrenomActionPerformed

    


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxFonction;
    private java.awt.Label ICAD;
    private javax.swing.JButton btnValider;
    private javax.swing.JTextField fieldAdresse;
    private javax.swing.JTextField fieldCodePostal;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JPasswordField fieldMotDePasse;
    private javax.swing.JTextField fieldNom;
    private javax.swing.JTextField fieldNumeroTelephone;
    private javax.swing.JTextField fieldPrenom;
    private javax.swing.JTextField fieldVille;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
