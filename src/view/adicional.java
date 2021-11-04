package view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class adicional extends javax.swing.JFrame {

    //Constructor
    public adicional() {
        initComponents();
        this.setTitle("Registrar Venta | Adicional - Pardos Chicken"); //Nombre de ventana
        setIconImage(new ImageIcon(getClass().getResource("/img/iconPardos.png")).getImage()); //cambiar el icono de la ventana
        setLocationRelativeTo(null); //centro de la pantalla
        this.getContentPane().setBackground(Color.white); //color ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//al cerrar la ventana, se dejara de ejecutar en 2do plano
        setResizable(false); //No redimenzionable
        setDefaultCloseOperation(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegistraVenta = new javax.swing.JButton();
        btnAdicional = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        jLabel1.setText("Registrar pedido");

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        jLabel2.setText("Adicional");

        btnRegistraVenta.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistraVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistraVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrarVenta.png"))); // NOI18N
        btnRegistraVenta.setBorder(null);
        btnRegistraVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraVentaActionPerformed(evt);
            }
        });

        btnAdicional.setBackground(new java.awt.Color(255, 255, 255));
        btnAdicional.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicional.png"))); // NOI18N
        btnAdicional.setBorder(null);
        btnAdicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnRegistraVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(btnAdicional)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistraVenta)
                    .addComponent(btnAdicional))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(92, 92, 92))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistraVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraVentaActionPerformed
        generarFac objGenFac = new generarFac();
        objGenFac.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistraVentaActionPerformed

    private void btnAdicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionalActionPerformed
        carta objCarta = new carta();
        objCarta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdicionalActionPerformed

    //Main
    public static void main(String args[]) {
        adicional objAdicional = new adicional();
        objAdicional.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicional;
    private javax.swing.JButton btnRegistraVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
