/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;

import javax.swing.JPanel;

/**
 *
 * @author Daniel Henao
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        background = new javax.swing.JPanel();
        botonUs = new javax.swing.JButton();
        botonLogin = new javax.swing.JButton();
        botonRegistrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(924, 544));
        setResizable(false);

        background.setBackground(new java.awt.Color(204, 204, 204));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonUs.setBackground(new java.awt.Color(204, 204, 204));
        botonUs.setForeground(new java.awt.Color(0, 0, 0));
        botonUs.setText("Sobre nosostros");
        botonUs.setToolTipText("");
        botonUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUsActionPerformed(evt);
            }
        });
        background.add(botonUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 125, 40));

        botonLogin.setBackground(new java.awt.Color(204, 204, 204));
        botonLogin.setForeground(new java.awt.Color(0, 0, 0));
        botonLogin.setText("Iniciar Sesion");
        botonLogin.setToolTipText("");
        botonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginActionPerformed(evt);
            }
        });
        background.add(botonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 125, 40));

        botonRegistrarse.setBackground(new java.awt.Color(204, 204, 204));
        botonRegistrarse.setForeground(new java.awt.Color(0, 0, 0));
        botonRegistrarse.setText("Registrarse");
        botonRegistrarse.setToolTipText("");
        botonRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });
        background.add(botonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 125, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonUsActionPerformed

    private void botonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Login inicio = new Login();
        inicio.setVisible(true);
        JPanel panel = new JPanel();
        panel.add(botonLogin);
        add(panel);
    }//GEN-LAST:event_botonLoginActionPerformed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        RegistroDocente docente = new RegistroDocente();
        docente.setVisible(true);
        JPanel pane = new JPanel();
        pane.add(botonRegistrarse);
        add(pane);
        
    }//GEN-LAST:event_botonRegistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton botonLogin;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JButton botonUs;
    // End of variables declaration//GEN-END:variables
}
