package view;

import dao.impl.daoFacturaTempImpl;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import dao.daoFacturaTemp;

public class menuPrincipal extends javax.swing.JFrame {

    //Constructor
    public menuPrincipal() {
        initComponents();
        this.setTitle("Menu Principal - Pardos Chicken"); //Nombre de ventana
        setIconImage(new ImageIcon(getClass().getResource("/img/iconPardos.png")).getImage()); //cambiar el icono de la ventana
        setLocationRelativeTo(null); //centro de la pantalla
        this.getContentPane().setBackground(Color.white); //color ventana
        setResizable(false); //No redimenzionable
        setDefaultCloseOperation(0); //Deshabilitar la funcion de close (X)
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LogoPardos = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        btnRegistrarAdmin = new javax.swing.JButton();
        btnCambiarCuenta = new javax.swing.JButton();
        btnCalculadora = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCarta = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnMantenimiento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoPardos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoLoginRed.png"))); // NOI18N
        jPanel1.add(LogoPardos, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 20, -1, -1));

        lblUserName.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        lblUserName.setText("@PardosChicken");
        jPanel1.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        btnRegistrarAdmin.setBackground(new java.awt.Color(0, 153, 204));
        btnRegistrarAdmin.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btnRegistrarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAdmin.setText("Registrar Administrador");
        btnRegistrarAdmin.setBorder(null);
        btnRegistrarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 261, 60));

        btnCambiarCuenta.setBackground(new java.awt.Color(102, 102, 102));
        btnCambiarCuenta.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btnCambiarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarCuenta.setText("Cambiar de Cuenta");
        btnCambiarCuenta.setBorder(null);
        btnCambiarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarCuentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCambiarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 261, 60));

        btnCalculadora.setBackground(new java.awt.Color(51, 51, 51));
        btnCalculadora.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btnCalculadora.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculadora.setText("Calculadora");
        btnCalculadora.setBorder(null);
        btnCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculadoraActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 261, 60));

        btnSalir.setBackground(new java.awt.Color(204, 0, 51));
        btnSalir.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir del Sistema");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 261, 60));

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel3.setText("Reportes");

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel5.setText("Mantenimiento");

        jLabel6.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel6.setText("Carta");

        jLabel7.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel7.setText("Facturas");

        btnCarta.setBackground(new java.awt.Color(255, 255, 255));
        btnCarta.setForeground(new java.awt.Color(255, 255, 255));
        btnCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCarta .png"))); // NOI18N
        btnCarta.setBorder(null);
        btnCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaActionPerformed(evt);
            }
        });

        btnFactura.setBackground(new java.awt.Color(255, 255, 255));
        btnFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconFacturas.png"))); // NOI18N
        btnFactura.setBorder(null);
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });

        btnReportes.setBackground(new java.awt.Color(255, 255, 255));
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconReportes.png"))); // NOI18N
        btnReportes.setBorder(null);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        btnMantenimiento.setBackground(new java.awt.Color(255, 255, 255));
        btnMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        btnMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconMantenimiento.png"))); // NOI18N
        btnMantenimiento.setBorder(null);
        btnMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReportes)
                                    .addComponent(btnCarta))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(46, 46, 46))
                            .addComponent(btnFactura, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMantenimiento, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(79, 79, 79))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCarta)
                    .addComponent(btnFactura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReportes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMantenimiento, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton calculadora
    private void btnCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculadoraActionPerformed
        try {
            Process p = new ProcessBuilder("CALC").start(); //Ejecutamos la calculadora
        } catch (IOException ex) {
            Logger.getLogger(menuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCalculadoraActionPerformed

    //Boton Salir
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    //Boton Cambiar cuenta
    private void btnCambiarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarCuentaActionPerformed
        login objLogin = new login();
        objLogin.setVisible(true); //Activamos el login
        dispose(); //Cerramos la ventana
    }//GEN-LAST:event_btnCambiarCuentaActionPerformed

    private void btnRegistrarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAdminActionPerformed
        registrarAdmin objRA = new registrarAdmin();
        objRA.setVisible(true); //Activamos la nueva ventana
        dispose(); //Cerramos la ventana
    }//GEN-LAST:event_btnRegistrarAdminActionPerformed

    //Botones de los cambos Carta Facturas Reportes y Mantenimiento
    private void btnCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaActionPerformed
        pedidoTempTRUNCATE();
        carta objCarta = new carta();
        objCarta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCartaActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        buscarFactura objFac = new buscarFactura();
        objFac.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        reportes objRepor = new reportes();
        objRepor.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientoActionPerformed
        mantenimiento objMan = new mantenimiento();
        objMan.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMantenimientoActionPerformed

    //Metodo para limpiar tabla pedidoTemp
    public void pedidoTempTRUNCATE() {
        daoFacturaTemp dPT = new daoFacturaTempImpl();
        try {
            dPT.truncateTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    //Main
    public static void main(String args[]) {
        //Objeto para activar manualmente la ventana
        menuPrincipal objmenuPrincipal = new menuPrincipal(); //Si ejecuto directamente
        objmenuPrincipal.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoPardos;
    private javax.swing.JButton btnCalculadora;
    private javax.swing.JButton btnCambiarCuenta;
    private javax.swing.JButton btnCarta;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnMantenimiento;
    private javax.swing.JButton btnRegistrarAdmin;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUserName;
    // End of variables declaration//GEN-END:variables
}
