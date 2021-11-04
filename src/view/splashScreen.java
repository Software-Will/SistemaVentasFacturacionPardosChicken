package view;

import javax.swing.*;

public class splashScreen extends javax.swing.JFrame {

//Constructor
    public splashScreen() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img/iconPardos.png")).getImage()); //cambiar el icono de la ventana;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblMensajesCargas = new javax.swing.JLabel();
        lblPorcentajeCarga = new javax.swing.JLabel();
        lblWallpaper = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMensajesCargas.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        lblMensajesCargas.setForeground(java.awt.Color.white);
        lblMensajesCargas.setText("Cargando...");
        jPanel2.add(lblMensajesCargas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        lblPorcentajeCarga.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        lblPorcentajeCarga.setForeground(java.awt.Color.black);
        lblPorcentajeCarga.setText("0%");
        jPanel2.add(lblPorcentajeCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 400, -1, -1));

        lblWallpaper.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        lblWallpaper.setForeground(new java.awt.Color(255, 255, 255));
        lblWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/splashScreen.png"))); // NOI18N
        jPanel2.add(lblWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel2.add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 1140, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Main -> Trabajamos sobre el main pq tendremos accion total del frame
    public static void main(String args[]) {
        //crear objetos del frame
        splashScreen objSC = new splashScreen();
        login objLogin = new login();
        objSC.setVisible(true); //visualizacion del jframe - al final debemos cerrarlo

        //Trycatch
        try { //for para la carga del progressbar
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(100); //Tiempo de carga
                objSC.lblPorcentajeCarga.setText(i + "%");
                objSC.progressBar.setValue(i);//valores para la barra de progreso
                if (i == 15) {//Todos estos if cambiaran el mensaje del label
                    objSC.lblMensajesCargas.setText("Validando clases...");
                }
                if (i == 30) {
                    objSC.lblMensajesCargas.setText("Cargando modulos...");
                }
                if (i == 50) {
                    objSC.lblMensajesCargas.setText("Validando servidores ...");
                }
                if (i == 70) {
                    objSC.lblMensajesCargas.setText("Conectando a la base de datos...");
                }
                if (i == 90) {
                    objSC.lblMensajesCargas.setText("Ejecutando el software...");
                }
                if (i == 100) {//Abre el login y cierra el splashScreen
                    objLogin.setVisible(true);
                    objSC.setVisible(false);
                }
            }
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, e);//Mensaje de alerta
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMensajesCargas;
    private javax.swing.JLabel lblPorcentajeCarga;
    private javax.swing.JLabel lblWallpaper;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
