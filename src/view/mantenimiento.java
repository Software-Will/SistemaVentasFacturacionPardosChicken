package view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import view.Mantenimiento.manAdmin;
import view.Mantenimiento.manCartaPrecios;
import view.Mantenimiento.manFactura;

public class mantenimiento extends javax.swing.JFrame {

    //Constructor
    public mantenimiento() {
        initComponents();
        this.setTitle("Mantenimiento - Pardos Chicken"); //Nombre de ventana
        setIconImage(new ImageIcon(getClass().getResource("/img/iconPardos.png")).getImage()); //cambiar el icono de la ventana
        setLocationRelativeTo(null); //centro de la pantalla
        this.getContentPane().setBackground(Color.white); //color ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//al cerrar la ventana, se dejara de ejecutar en 2do plano
        setResizable(false); //No redimenzionable
        setDefaultCloseOperation(0); //Deshabilitar la funcion de close (X)
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JButton();
        btnFacturas = new javax.swing.JButton();
        btnCartaPrecios = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconMantenimiento.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        btnAdmin.setBackground(new java.awt.Color(51, 51, 51));
        btnAdmin.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmin.setText("Administradores");
        btnAdmin.setBorder(null);
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 340, 60));

        btnFacturas.setBackground(new java.awt.Color(51, 51, 51));
        btnFacturas.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btnFacturas.setForeground(new java.awt.Color(255, 255, 255));
        btnFacturas.setText("Facturas");
        btnFacturas.setBorder(null);
        btnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturasActionPerformed(evt);
            }
        });
        getContentPane().add(btnFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 340, 60));

        btnCartaPrecios.setBackground(new java.awt.Color(51, 51, 51));
        btnCartaPrecios.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btnCartaPrecios.setForeground(new java.awt.Color(255, 255, 255));
        btnCartaPrecios.setText("Carta - Precios");
        btnCartaPrecios.setBorder(null);
        btnCartaPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaPreciosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCartaPrecios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 340, 60));

        btnSalir.setBackground(new java.awt.Color(204, 0, 51));
        btnSalir.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 340, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        dispose();
        manAdmin objAdmin = new manAdmin();
        objAdmin.setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturasActionPerformed
        dispose();
        manFactura objMFac = new manFactura();
        objMFac.setVisible(true);
    }//GEN-LAST:event_btnFacturasActionPerformed

    private void btnCartaPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaPreciosActionPerformed
        dispose();
        manCartaPrecios objCarteP = new manCartaPrecios();
        objCarteP.setVisible(true);
    }//GEN-LAST:event_btnCartaPreciosActionPerformed

    //Boton Salir
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
        menuPrincipal objMP = new menuPrincipal();
        objMP.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    //Main
    public static void main(String args[]) {
        mantenimiento objReportes = new mantenimiento();
        objReportes.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCartaPrecios;
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
