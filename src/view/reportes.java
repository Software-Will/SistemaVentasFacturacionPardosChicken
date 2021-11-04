package view;

import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import utils.cnn;

public class reportes extends javax.swing.JFrame {

    //Constructor
    public reportes() {
        initComponents();
        this.setTitle("Reportes - Pardos Chicken"); //Nombre de ventana
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
        btnReportesVentas = new javax.swing.JButton();
        btnReportesCarta = new javax.swing.JButton();
        btnReportesAdmin = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconReportes.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 140, 150));

        btnReportesVentas.setBackground(new java.awt.Color(51, 51, 51));
        btnReportesVentas.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btnReportesVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnReportesVentas.setText("Reporte de Ventas");
        btnReportesVentas.setBorder(null);
        btnReportesVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnReportesVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 340, 60));

        btnReportesCarta.setBackground(new java.awt.Color(51, 51, 51));
        btnReportesCarta.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btnReportesCarta.setForeground(new java.awt.Color(255, 255, 255));
        btnReportesCarta.setText("Reporte de Carta | Precios");
        btnReportesCarta.setBorder(null);
        btnReportesCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesCartaActionPerformed(evt);
            }
        });
        getContentPane().add(btnReportesCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 340, 60));

        btnReportesAdmin.setBackground(new java.awt.Color(51, 51, 51));
        btnReportesAdmin.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btnReportesAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnReportesAdmin.setText("Reporte de Administradores");
        btnReportesAdmin.setBorder(null);
        btnReportesAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnReportesAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 340, 60));

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
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 340, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReportesVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesVentasActionPerformed
        try {
            reportesVentas();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
//        JOptionPane.showMessageDialog(null, "REPORTE GENERADO EN LA CARPETA C:\\REPORTES\\VENTAS");
    }//GEN-LAST:event_btnReportesVentasActionPerformed

    private void btnReportesCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesCartaActionPerformed
        try {
            reportesCarta();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
//        JOptionPane.showMessageDialog(null, "REPORTE GENERADO EN LA CARPETA C:\\REPORTES\\CARTAPRECIO");
    }//GEN-LAST:event_btnReportesCartaActionPerformed

    private void btnReportesAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesAdminActionPerformed
        try {
            reportesAdmin();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
//        JOptionPane.showMessageDialog(null, "REPORTE GENERADO EN LA CARPETA C:\\REPORTES\\ADMINISTRADORES");
    }//GEN-LAST:event_btnReportesAdminActionPerformed

    //Boton Salir
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
        menuPrincipal objMP = new menuPrincipal();
        objMP.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    //Reportes admin
    public void reportesAdmin() throws SQLException {
        try {
            cnn con = new cnn();
            Connection conn = con.getConnection();
            JasperReport reporte = null;
            String path = "src\\reportes\\administradores.jasper"; //Ruta del jasper
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(path, null, conn);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }

    }

    //Reportes ventas
    public void reportesVentas() throws SQLException {
        try {
            cnn con = new cnn();
            Connection conn = con.getConnection();
            JasperReport reporte = null;
            String path = "src\\reportes\\ventas.jasper"; //Ruta del jasper
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(path, null, conn);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }

    }

    public void reportesCarta() throws SQLException {
        try {
            cnn con = new cnn();
            Connection conn = con.getConnection();
            JasperReport reporte = null;
            String path = "src\\reportes\\carta.jasper"; //Ruta del jasper
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(path, null, conn);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    //Main
    public static void main(String args[]) {
        reportes objReportes = new reportes();
        objReportes.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReportesAdmin;
    private javax.swing.JButton btnReportesCarta;
    private javax.swing.JButton btnReportesVentas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
