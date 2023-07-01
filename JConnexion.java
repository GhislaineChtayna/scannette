/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package scanette;

import javax.swing.JOptionPane;
import scanette.classesMetier.Client;
import scanette.classesMetier.Magasin;
import scanette.classesMetier.Scannette;

/**
 *
 * @author Moi
 */
public class JConnexion extends javax.swing.JFrame {

    /**
     * Creates new form JConnexion
     */
    public JConnexion() {
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

        jLbConnexion = new javax.swing.JLabel();
        jLbNom = new javax.swing.JLabel();
        jLbPrenom = new javax.swing.JLabel();
        jTfNom = new javax.swing.JTextField();
        jPfPassword = new javax.swing.JPasswordField();
        jLFond = new javax.swing.JLabel();
        jBtQuitter = new javax.swing.JButton();
        jBtValider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nouvelle connexion");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbConnexion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLbConnexion.setForeground(new java.awt.Color(0, 0, 0));
        jLbConnexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scanette/img/ecran.png"))); // NOI18N
        jLbConnexion.setText("Connexion");
        getContentPane().add(jLbConnexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLbNom.setForeground(new java.awt.Color(0, 0, 0));
        jLbNom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scanette/img/utilisateur.png"))); // NOI18N
        jLbNom.setText("Nom :");
        getContentPane().add(jLbNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLbPrenom.setForeground(new java.awt.Color(0, 0, 0));
        jLbPrenom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scanette/img/key.png"))); // NOI18N
        jLbPrenom.setText("Mot de passe  : ");
        getContentPane().add(jLbPrenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));
        getContentPane().add(jTfNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 160, -1));
        getContentPane().add(jPfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 160, -1));

        jLFond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scanette/img/fondClair.png"))); // NOI18N
        jLFond.setText("jLabel1");
        jLFond.setToolTipText("");
        getContentPane().add(jLFond, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 23, 411, 188));

        jBtQuitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scanette/img/quitter.png"))); // NOI18N
        jBtQuitter.setText("Quitter");
        jBtQuitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtQuitterMouseClicked(evt);
            }
        });
        getContentPane().add(jBtQuitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        jBtValider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scanette/img/valider.png"))); // NOI18N
        jBtValider.setText("Valider");
        jBtValider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtValiderMouseClicked(evt);
            }
        });
        getContentPane().add(jBtValider, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        setBounds(0, 0, 479, 305);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtValiderMouseClicked
        // TODO add your handling code here:
        String login = jTfNom.getText();
        String password = String.valueOf(jPfPassword.getPassword());
        
        if (login.equals("Dupont") && password.equals("Azerty"))
        {
            Scannette scannette = new Scannette ();
            scannette.setLeClient(new Client("Dupont" , "T", "Azerty"));
            
            Magasin magasin = new Magasin("MarketPlus");
            
            JFScannette formScannette = new JFScannette(magasin, scannette);
            formScannette.setVisible(true);
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Login ou mot de passe incorrecte");
        }
            
    }//GEN-LAST:event_jBtValiderMouseClicked

    private void jBtQuitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtQuitterMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jBtQuitterMouseClicked

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
            java.util.logging.Logger.getLogger(JConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JConnexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtQuitter;
    private javax.swing.JButton jBtValider;
    private javax.swing.JLabel jLFond;
    private javax.swing.JLabel jLbConnexion;
    private javax.swing.JLabel jLbNom;
    private javax.swing.JLabel jLbPrenom;
    private javax.swing.JPasswordField jPfPassword;
    private javax.swing.JTextField jTfNom;
    // End of variables declaration//GEN-END:variables
}