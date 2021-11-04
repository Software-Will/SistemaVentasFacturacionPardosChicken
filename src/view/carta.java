package view;

import dao.daoProd_View;
import dao.impl.daoProd_ViewImpl;
import dto.dtoFacturaTemp;
import dto.dtoProd_View;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.WindowConstants;

public class carta extends javax.swing.JFrame {

    static ArrayList<dtoFacturaTemp> pedido = new ArrayList<>();
    int op;
    int cantidad;

    //Constructor
    public carta() {
        initComponents();
        this.setTitle("Carta - Pardos Chicken"); //Nombre de ventana
        setIconImage(new ImageIcon(getClass().getResource("/img/iconPardos.png")).getImage()); //cambiar el icono de la ventana
        setLocationRelativeTo(null); //centro de la pantalla
        this.getContentPane().setBackground(Color.white); //color ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//al cerrar la ventana, se dejara de ejecutar en 2do plano
        setDefaultCloseOperation(0); //Deshabilitar la funcion de close (X)
        setResizable(false); //No redimenzionable
        //La idea es que la carta sea full pantalla
        listadoCarta();
        minMaxSpinners();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnTerminarOrden = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtPP1 = new javax.swing.JLabel();
        txtProm3 = new javax.swing.JLabel();
        txtProm2 = new javax.swing.JLabel();
        txtProm4 = new javax.swing.JLabel();
        txtProm5 = new javax.swing.JLabel();
        txtPM = new javax.swing.JLabel();
        txtProm1 = new javax.swing.JLabel();
        txtPP6 = new javax.swing.JLabel();
        txtPP2 = new javax.swing.JLabel();
        txtPP3 = new javax.swing.JLabel();
        txtPP4 = new javax.swing.JLabel();
        txtPP5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtProm6 = new javax.swing.JLabel();
        txtMenu = new javax.swing.JLabel();
        txtChicha3 = new javax.swing.JLabel();
        txtChicha1 = new javax.swing.JLabel();
        txtChicha2 = new javax.swing.JLabel();
        txtPC1 = new javax.swing.JLabel();
        txtPC2 = new javax.swing.JLabel();
        txtPC3 = new javax.swing.JLabel();
        txtLimonada3 = new javax.swing.JLabel();
        txtLimonada1 = new javax.swing.JLabel();
        txtLimonada2 = new javax.swing.JLabel();
        txtPL1 = new javax.swing.JLabel();
        txtPL2 = new javax.swing.JLabel();
        txtPL3 = new javax.swing.JLabel();
        txtGaseosa3 = new javax.swing.JLabel();
        txtGaseosa1 = new javax.swing.JLabel();
        txtGaseosa2 = new javax.swing.JLabel();
        txtPG1 = new javax.swing.JLabel();
        txtPG2 = new javax.swing.JLabel();
        txtPG3 = new javax.swing.JLabel();
        txtGaseosa4 = new javax.swing.JLabel();
        txtPG4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCerveza1 = new javax.swing.JLabel();
        txtCerveza2 = new javax.swing.JLabel();
        txtPCe1 = new javax.swing.JLabel();
        txtPCe2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtVino = new javax.swing.JLabel();
        txtPV = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPisco1 = new javax.swing.JLabel();
        txtPisco2 = new javax.swing.JLabel();
        txtPPS1 = new javax.swing.JLabel();
        txtPPS2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPE1 = new javax.swing.JLabel();
        txtExtra3 = new javax.swing.JLabel();
        txtExtra2 = new javax.swing.JLabel();
        txtExtra4 = new javax.swing.JLabel();
        txtExtra5 = new javax.swing.JLabel();
        txtExtra1 = new javax.swing.JLabel();
        txtPE6 = new javax.swing.JLabel();
        txtPE2 = new javax.swing.JLabel();
        txtPE3 = new javax.swing.JLabel();
        txtPE4 = new javax.swing.JLabel();
        txtPE5 = new javax.swing.JLabel();
        txtExtra6 = new javax.swing.JLabel();
        txtExtra7 = new javax.swing.JLabel();
        txtPE8 = new javax.swing.JLabel();
        txtPE7 = new javax.swing.JLabel();
        txtExtra8 = new javax.swing.JLabel();
        spnPromo1 = new javax.swing.JSpinner();
        spnPromo2 = new javax.swing.JSpinner();
        spnPromo3 = new javax.swing.JSpinner();
        spnPromo4 = new javax.swing.JSpinner();
        spnPromo5 = new javax.swing.JSpinner();
        spnPromo6 = new javax.swing.JSpinner();
        spnExtra6 = new javax.swing.JSpinner();
        spnExtra5 = new javax.swing.JSpinner();
        spnExtra4 = new javax.swing.JSpinner();
        spnExtra3 = new javax.swing.JSpinner();
        spnExtra2 = new javax.swing.JSpinner();
        spnExtra1 = new javax.swing.JSpinner();
        spnExtra8 = new javax.swing.JSpinner();
        spnExtra7 = new javax.swing.JSpinner();
        spnBebida3 = new javax.swing.JSpinner();
        spnBebida2 = new javax.swing.JSpinner();
        spnBebida1 = new javax.swing.JSpinner();
        spnBebida6 = new javax.swing.JSpinner();
        spnBebida5 = new javax.swing.JSpinner();
        spnBebida4 = new javax.swing.JSpinner();
        spnBebida10 = new javax.swing.JSpinner();
        spnBebida8 = new javax.swing.JSpinner();
        spnBebida7 = new javax.swing.JSpinner();
        spnBebida9 = new javax.swing.JSpinner();
        spnMenu1 = new javax.swing.JSpinner();
        spnTrago1 = new javax.swing.JSpinner();
        spnTrago5 = new javax.swing.JSpinner();
        spnTrago4 = new javax.swing.JSpinner();
        spnTrago2 = new javax.swing.JSpinner();
        spnTrago3 = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        jLabel3.setText("PROMOCIONES");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        jLabel4.setText("BEBIDAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        jLabel5.setText("MENÚ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        jLabel6.setText("TRAGOS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        jLabel7.setText("   ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 760, -1, 20));

        btnTerminarOrden.setBackground(new java.awt.Color(0, 153, 204));
        btnTerminarOrden.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        btnTerminarOrden.setForeground(new java.awt.Color(255, 255, 255));
        btnTerminarOrden.setText("Terminar orden");
        btnTerminarOrden.setBorder(null);
        btnTerminarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(btnTerminarOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 720, 140, 35));

        btnSalir.setBackground(new java.awt.Color(204, 0, 0));
        btnSalir.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 720, 140, 35));

        txtPP1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPP1.setText("PP1");
        getContentPane().add(txtPP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        txtProm3.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtProm3.setText("Promo3");
        getContentPane().add(txtProm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txtProm2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtProm2.setText("Promo2");
        getContentPane().add(txtProm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtProm4.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtProm4.setText("Promo4");
        getContentPane().add(txtProm4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        txtProm5.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtProm5.setText("Promo5");
        getContentPane().add(txtProm5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtPM.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPM.setText("PM");
        getContentPane().add(txtPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        txtProm1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtProm1.setText("Promo1");
        getContentPane().add(txtProm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        txtPP6.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPP6.setText("PP6");
        getContentPane().add(txtPP6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        txtPP2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPP2.setText("PP2");
        getContentPane().add(txtPP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        txtPP3.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPP3.setText("PP3");
        getContentPane().add(txtPP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        txtPP4.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPP4.setText("PP4");
        getContentPane().add(txtPP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        txtPP5.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPP5.setText("PP5");
        getContentPane().add(txtPP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel1.setText("GASEOSAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, -1, -1));

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel2.setText("CHICHA PARDOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel9.setText("LIMONADA PARDOS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        txtProm6.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtProm6.setText("Promo6");
        getContentPane().add(txtProm6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        txtMenu.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtMenu.setText("Menu");
        getContentPane().add(txtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        txtChicha3.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtChicha3.setText("Chi3");
        getContentPane().add(txtChicha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        txtChicha1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtChicha1.setText("Chi1");
        getContentPane().add(txtChicha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        txtChicha2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtChicha2.setText("Chi2");
        getContentPane().add(txtChicha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        txtPC1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPC1.setText("PC1");
        getContentPane().add(txtPC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, -1, -1));

        txtPC2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPC2.setText("PC2");
        getContentPane().add(txtPC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, -1, -1));

        txtPC3.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPC3.setText("PC3");
        getContentPane().add(txtPC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, -1, -1));

        txtLimonada3.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtLimonada3.setText("Lim3");
        getContentPane().add(txtLimonada3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, -1, -1));

        txtLimonada1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtLimonada1.setText("Lim1");
        getContentPane().add(txtLimonada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        txtLimonada2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtLimonada2.setText("Lim2");
        getContentPane().add(txtLimonada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, -1, -1));

        txtPL1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPL1.setText("PL1");
        getContentPane().add(txtPL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, -1, -1));

        txtPL2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPL2.setText("PL2");
        getContentPane().add(txtPL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, -1, -1));

        txtPL3.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPL3.setText("PL3");
        getContentPane().add(txtPL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, -1, -1));

        txtGaseosa3.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtGaseosa3.setText("Gas3");
        getContentPane().add(txtGaseosa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 640, -1, -1));

        txtGaseosa1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtGaseosa1.setText("Gas1");
        getContentPane().add(txtGaseosa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, -1, -1));

        txtGaseosa2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtGaseosa2.setText("Gas2");
        getContentPane().add(txtGaseosa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 610, -1, -1));

        txtPG1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPG1.setText("PG1");
        getContentPane().add(txtPG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 580, -1, -1));

        txtPG2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPG2.setText("PG2");
        getContentPane().add(txtPG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, -1, -1));

        txtPG3.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPG3.setText("PG3");
        getContentPane().add(txtPG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 640, -1, -1));

        txtGaseosa4.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtGaseosa4.setText("Gas4");
        getContentPane().add(txtGaseosa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 670, -1, -1));

        txtPG4.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPG4.setText("PG4");
        getContentPane().add(txtPG4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 670, -1, -1));

        jLabel10.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel10.setText("CERVEZA");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        txtCerveza1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtCerveza1.setText("Cer1");
        getContentPane().add(txtCerveza1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        txtCerveza2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtCerveza2.setText("Cer2");
        getContentPane().add(txtCerveza2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        txtPCe1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPCe1.setText("PCE1");
        getContentPane().add(txtPCe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, -1, -1));

        txtPCe2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPCe2.setText("PCE2");
        getContentPane().add(txtPCe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        jLabel11.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel11.setText("VINOS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        txtVino.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtVino.setText("Vin1");
        getContentPane().add(txtVino, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        txtPV.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPV.setText("PV");
        getContentPane().add(txtPV, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 580, -1, -1));

        jLabel12.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel12.setText("PISCO SOUR");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, -1, -1));

        txtPisco1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPisco1.setText("Pis1");
        getContentPane().add(txtPisco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, -1, -1));

        txtPisco2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPisco2.setText("Pis2");
        getContentPane().add(txtPisco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, -1, -1));

        txtPPS1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPPS1.setText("PPS1");
        getContentPane().add(txtPPS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 660, -1, -1));

        txtPPS2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPPS2.setText("PPS2");
        getContentPane().add(txtPPS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 690, -1, -1));

        jLabel13.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        jLabel13.setText("EXTRAS");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        jLabel14.setText("   ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 200, -1, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCarta .png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        txtPE1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPE1.setText("PE1");
        getContentPane().add(txtPE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 70, -1, -1));

        txtExtra3.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtExtra3.setText("Extra3");
        getContentPane().add(txtExtra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, -1, -1));

        txtExtra2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtExtra2.setText("Extra2");
        getContentPane().add(txtExtra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, -1, -1));

        txtExtra4.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtExtra4.setText("Extra4");
        getContentPane().add(txtExtra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, -1, -1));

        txtExtra5.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtExtra5.setText("Extra5");
        getContentPane().add(txtExtra5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, -1, -1));

        txtExtra1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtExtra1.setText("Extra1");
        getContentPane().add(txtExtra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, -1, -1));

        txtPE6.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPE6.setText("PE6");
        getContentPane().add(txtPE6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 220, -1, -1));

        txtPE2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPE2.setText("PE2");
        getContentPane().add(txtPE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 100, -1, -1));

        txtPE3.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPE3.setText("PE3");
        getContentPane().add(txtPE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 130, -1, -1));

        txtPE4.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPE4.setText("PE4");
        getContentPane().add(txtPE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 160, -1, -1));

        txtPE5.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPE5.setText("PE5");
        getContentPane().add(txtPE5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 190, -1, -1));

        txtExtra6.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtExtra6.setText("Extra6");
        getContentPane().add(txtExtra6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, -1, -1));

        txtExtra7.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtExtra7.setText("Extra7");
        getContentPane().add(txtExtra7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, -1, -1));

        txtPE8.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPE8.setText("PE8");
        getContentPane().add(txtPE8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 280, -1, -1));

        txtPE7.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtPE7.setText("PE7");
        getContentPane().add(txtPE7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 250, -1, -1));

        txtExtra8.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txtExtra8.setText("Extra8");
        getContentPane().add(txtExtra8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, -1, -1));

        spnPromo1.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnPromo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 40, -1));

        spnPromo2.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnPromo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 40, -1));

        spnPromo3.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnPromo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 40, -1));

        spnPromo4.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnPromo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 40, -1));

        spnPromo5.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnPromo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 40, -1));

        spnPromo6.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnPromo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 40, -1));

        spnExtra6.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnExtra6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 220, 40, -1));

        spnExtra5.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnExtra5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 190, 40, -1));

        spnExtra4.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnExtra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 160, 40, -1));

        spnExtra3.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnExtra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 130, 40, -1));

        spnExtra2.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnExtra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 100, 40, -1));

        spnExtra1.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnExtra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 70, 40, -1));

        spnExtra8.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnExtra8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 280, 40, -1));

        spnExtra7.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnExtra7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 250, 40, -1));

        spnBebida3.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnBebida3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 40, -1));

        spnBebida2.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnBebida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 40, -1));

        spnBebida1.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnBebida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 40, -1));

        spnBebida6.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnBebida6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, 40, -1));

        spnBebida5.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnBebida5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 40, -1));

        spnBebida4.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnBebida4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 40, -1));

        spnBebida10.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnBebida10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 670, 40, -1));

        spnBebida8.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnBebida8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 610, 40, -1));

        spnBebida7.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnBebida7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 580, 40, -1));

        spnBebida9.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnBebida9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 640, 40, -1));

        spnMenu1.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 40, -1));

        spnTrago1.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnTrago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 40, -1));

        spnTrago5.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnTrago5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 690, 40, -1));

        spnTrago4.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnTrago4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 660, 40, -1));

        spnTrago2.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnTrago2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 40, -1));

        spnTrago3.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        getContentPane().add(spnTrago3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 40, -1));

        jLabel15.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel15.setText("S/ ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jLabel16.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel16.setText("S/ ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jLabel17.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel17.setText("S/ ");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        jLabel18.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel18.setText("S/ ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel19.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel19.setText("S/ ");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, -1, -1));

        jLabel20.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel20.setText("S/ ");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        jLabel29.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel29.setText("S/ ");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 100, -1, -1));

        jLabel30.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel30.setText("S/ ");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 70, -1, -1));

        jLabel31.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel31.setText("S/ ");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 160, -1, -1));

        jLabel32.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel32.setText("S/ ");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 130, -1, -1));

        jLabel33.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel33.setText("S/ ");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 220, -1, -1));

        jLabel34.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel34.setText("S/ ");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 190, -1, -1));

        jLabel35.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel35.setText("S/ ");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 280, -1, -1));

        jLabel36.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel36.setText("S/ ");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 250, -1, -1));

        jLabel37.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel37.setText("S/ ");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, -1));

        jLabel38.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel38.setText("S/ ");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, -1, -1));

        jLabel39.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel39.setText("S/ ");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, -1, -1));

        jLabel40.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel40.setText("S/ ");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, -1, -1));

        jLabel41.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel41.setText("S/ ");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 610, -1, -1));

        jLabel42.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel42.setText("S/ ");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, -1, -1));

        jLabel43.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel43.setText("S/ ");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 670, -1, -1));

        jLabel44.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel44.setText("S/ ");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 640, -1, -1));

        jLabel45.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel45.setText("S/ ");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 690, -1, -1));

        jLabel46.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel46.setText("S/ ");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 660, -1, -1));

        jLabel47.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel47.setText("S/ ");
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, -1, -1));

        jLabel48.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel48.setText("S/ ");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        jLabel49.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel49.setText("S/ ");
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        jLabel50.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel50.setText("S/ ");
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        jLabel51.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel51.setText("S/ ");
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 580, -1, -1));

        jLabel52.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel52.setText("S/ ");
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        carta.pedido.clear(); //Caso cancele se eliminan los objetos del arrayList
        menuPrincipal objMenP = new menuPrincipal();
        objMenP.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnTerminarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarOrdenActionPerformed
//        JOptionPane.showMessageDialog(null, "PROMOCION 1: " + spnPromo1.getValue());
        comprobarPedido();
    }//GEN-LAST:event_btnTerminarOrdenActionPerformed

    //Listados de categoias en la carta
    public void listadoCarta() {
        promocion();
        menu();
        bebidas();
        tragos();
        extras();
    }

    //METODOS DE ACCESO A LOS DATOS
    public String accesoName(int idProm) {
        daoProd_View dP = new daoProd_ViewImpl();
        dtoProd_View prod = null;
        String nom = "";
        try {
            prod = dP.productoGet(idProm);
            nom = prod.getNomProd();
        } catch (Exception e) {
            dP.getMensaje();
        }
        return nom;
    }

    public String accesoPrecio(int idProm) {
        daoProd_View dP = new daoProd_ViewImpl();
        dtoProd_View prod = null;
        String precio = "";
        try {
            prod = dP.productoGet(idProm);
            precio = String.valueOf(prod.getPrecio());
        } catch (Exception e) {
            dP.getMensaje();
        }
        return precio;
    }

    //Metodos de listado por categoria
    public void promocion() {
        txtProm1.setText(accesoName(1));
        txtPP1.setText(accesoPrecio(1));
        txtProm2.setText(accesoName(2));
        txtPP2.setText(accesoPrecio(2));
        txtProm3.setText(accesoName(3));
        txtPP3.setText(accesoPrecio(3));
        txtProm4.setText(accesoName(4));
        txtPP4.setText(accesoPrecio(4));
        txtProm5.setText(accesoName(5));
        txtPP5.setText(accesoPrecio(5));
        txtProm6.setText(accesoName(6));
        txtPP6.setText(accesoPrecio(6));
    }

    public void menu() {
        txtMenu.setText(accesoName(7));
        txtPM.setText(accesoPrecio(7));
    }

    public void bebidas() {
        txtChicha1.setText(accesoName(8));
        txtPC1.setText(accesoPrecio(8));
        txtChicha2.setText(accesoName(9));
        txtPC2.setText(accesoPrecio(9));
        txtChicha3.setText(accesoName(10));
        txtPC3.setText(accesoPrecio(10));
        txtLimonada1.setText(accesoName(11));
        txtPL1.setText(accesoPrecio(11));
        txtLimonada2.setText(accesoName(12));
        txtPL2.setText(accesoPrecio(12));
        txtLimonada3.setText(accesoName(13));
        txtPL3.setText(accesoPrecio(13));
        txtGaseosa1.setText(accesoName(14));
        txtPG1.setText(accesoPrecio(14));
        txtGaseosa2.setText(accesoName(15));
        txtPG2.setText(accesoPrecio(15));
        txtGaseosa3.setText(accesoName(16));
        txtPG3.setText(accesoPrecio(16));
        txtGaseosa4.setText(accesoName(17));
        txtPG4.setText(accesoPrecio(17));
    }

    public void extras() {
        txtExtra1.setText(accesoName(18));
        txtPE1.setText(accesoPrecio(18));
        txtExtra2.setText(accesoName(19));
        txtPE2.setText(accesoPrecio(19));
        txtExtra3.setText(accesoName(20));
        txtPE3.setText(accesoPrecio(20));
        txtExtra4.setText(accesoName(21));
        txtPE4.setText(accesoPrecio(21));
        txtExtra5.setText(accesoName(22));
        txtPE5.setText(accesoPrecio(22));
        txtExtra6.setText(accesoName(23));
        txtPE6.setText(accesoPrecio(23));
        txtExtra7.setText(accesoName(24));
        txtPE7.setText(accesoPrecio(24));
        txtExtra8.setText(accesoName(25));
        txtPE8.setText(accesoPrecio(25));

    }

    public void tragos() {
        txtCerveza1.setText(accesoName(26));
        txtPCe1.setText(accesoPrecio(26));
        txtCerveza2.setText(accesoName(27));
        txtPCe2.setText(accesoPrecio(27));
        txtVino.setText(accesoName(28));
        txtPV.setText(accesoPrecio(28));
        txtPisco1.setText(accesoName(29));
        txtPPS1.setText(accesoPrecio(29));
        txtPisco2.setText(accesoName(30));
        txtPPS2.setText(accesoPrecio(30));
    }

    //Metodo para limitar Spinners
    public void minMaxSpinners() {
        int min = 0, max = 10;
        SpinnerNumberModel p1 = new SpinnerNumberModel();
        SpinnerNumberModel p2 = new SpinnerNumberModel();
        SpinnerNumberModel p3 = new SpinnerNumberModel();
        SpinnerNumberModel p4 = new SpinnerNumberModel();
        SpinnerNumberModel p5 = new SpinnerNumberModel();
        SpinnerNumberModel p6 = new SpinnerNumberModel();
        p1.setMaximum(max);
        p1.setMinimum(min);
        p2.setMaximum(max);
        p2.setMinimum(min);
        p3.setMaximum(max);
        p3.setMinimum(min);
        p4.setMaximum(max);
        p4.setMinimum(min);
        p5.setMaximum(max);
        p5.setMinimum(min);
        p6.setMaximum(max);
        p6.setMinimum(min);
        spnPromo1.setModel(p1);
        spnPromo2.setModel(p2);
        spnPromo3.setModel(p3);
        spnPromo4.setModel(p4);
        spnPromo5.setModel(p5);
        spnPromo6.setModel(p6);
        SpinnerNumberModel m1 = new SpinnerNumberModel();
        m1.setMaximum(max);
        m1.setMinimum(min);
        spnMenu1.setModel(m1);
        SpinnerNumberModel t1 = new SpinnerNumberModel();
        SpinnerNumberModel t2 = new SpinnerNumberModel();
        SpinnerNumberModel t3 = new SpinnerNumberModel();
        SpinnerNumberModel t4 = new SpinnerNumberModel();
        SpinnerNumberModel t5 = new SpinnerNumberModel();
        t1.setMaximum(max);
        t1.setMinimum(min);
        t2.setMaximum(max);
        t2.setMinimum(min);
        t3.setMaximum(max);
        t3.setMinimum(min);
        t4.setMaximum(max);
        t4.setMinimum(min);
        t5.setMaximum(max);
        t5.setMinimum(min);
        spnTrago1.setModel(t1);
        spnTrago2.setModel(t2);
        spnTrago3.setModel(t3);
        spnTrago4.setModel(t4);
        spnTrago5.setModel(t5);
        SpinnerNumberModel b1 = new SpinnerNumberModel();
        SpinnerNumberModel b2 = new SpinnerNumberModel();
        SpinnerNumberModel b3 = new SpinnerNumberModel();
        SpinnerNumberModel b4 = new SpinnerNumberModel();
        SpinnerNumberModel b5 = new SpinnerNumberModel();
        SpinnerNumberModel b6 = new SpinnerNumberModel();
        SpinnerNumberModel b7 = new SpinnerNumberModel();
        SpinnerNumberModel b8 = new SpinnerNumberModel();
        SpinnerNumberModel b9 = new SpinnerNumberModel();
        SpinnerNumberModel b10 = new SpinnerNumberModel();
        b1.setMaximum(max);
        b1.setMinimum(min);
        b2.setMaximum(max);
        b2.setMinimum(min);
        b3.setMaximum(max);
        b3.setMinimum(min);
        b4.setMaximum(max);
        b4.setMinimum(min);
        b5.setMaximum(max);
        b5.setMinimum(min);
        b6.setMaximum(max);
        b6.setMinimum(min);
        b7.setMaximum(max);
        b7.setMinimum(min);
        b8.setMaximum(max);
        b8.setMinimum(min);
        b9.setMaximum(max);
        b9.setMinimum(min);
        b10.setMaximum(max);
        b10.setMinimum(min);
        spnBebida1.setModel(b1);
        spnBebida2.setModel(b2);
        spnBebida3.setModel(b3);
        spnBebida4.setModel(b4);
        spnBebida5.setModel(b5);
        spnBebida6.setModel(b6);
        spnBebida7.setModel(b7);
        spnBebida8.setModel(b8);
        spnBebida9.setModel(b9);
        spnBebida10.setModel(b10);
        SpinnerNumberModel e1 = new SpinnerNumberModel();
        SpinnerNumberModel e2 = new SpinnerNumberModel();
        SpinnerNumberModel e3 = new SpinnerNumberModel();
        SpinnerNumberModel e4 = new SpinnerNumberModel();
        SpinnerNumberModel e5 = new SpinnerNumberModel();
        SpinnerNumberModel e6 = new SpinnerNumberModel();
        SpinnerNumberModel e7 = new SpinnerNumberModel();
        SpinnerNumberModel e8 = new SpinnerNumberModel();
        e1.setMaximum(max);
        e1.setMinimum(min);
        e2.setMaximum(max);
        e2.setMinimum(min);
        e3.setMaximum(max);
        e3.setMinimum(min);
        e4.setMaximum(max);
        e4.setMinimum(min);
        e5.setMaximum(max);
        e5.setMinimum(min);
        e6.setMaximum(max);
        e6.setMinimum(min);
        e7.setMaximum(max);
        e7.setMinimum(min);
        e8.setMaximum(max);
        e8.setMinimum(min);
        spnExtra1.setModel(e1);
        spnExtra2.setModel(e2);
        spnExtra3.setModel(e3);
        spnExtra4.setModel(e4);
        spnExtra5.setModel(e5);
        spnExtra6.setModel(e6);
        spnExtra7.setModel(e7);
        spnExtra8.setModel(e8);
    }

    //Comprobar pedido -> Este metodo permite la transaccion
    public void comprobarPedido() {
        if ((int) spnPromo1.getValue() == 0 && (int) spnPromo2.getValue() == 0 && (int) spnPromo3.getValue() == 0
                && (int) spnPromo4.getValue() == 0 && (int) spnPromo5.getValue() == 0 && (int) spnPromo6.getValue() == 0
                && (int) spnMenu1.getValue() == 0 && (int) spnTrago1.getValue() == 0 && (int) spnTrago2.getValue() == 0
                && (int) spnTrago3.getValue() == 0 && (int) spnTrago4.getValue() == 0 && (int) spnBebida1.getValue() == 0
                && (int) spnBebida2.getValue() == 0 && (int) spnBebida3.getValue() == 0 && (int) spnBebida4.getValue() == 0
                && (int) spnBebida5.getValue() == 0 && (int) spnBebida6.getValue() == 0 && (int) spnBebida7.getValue() == 0
                && (int) spnBebida8.getValue() == 0 && (int) spnBebida9.getValue() == 0 && (int) spnBebida10.getValue() == 0
                && (int) spnExtra1.getValue() == 0 && (int) spnExtra2.getValue() == 0 && (int) spnExtra3.getValue() == 0
                && (int) spnExtra4.getValue() == 0 && (int) spnExtra5.getValue() == 0 && (int) spnExtra6.getValue() == 0
                && (int) spnExtra7.getValue() == 0 && (int) spnExtra8.getValue() == 0) {
            JOptionPane.showMessageDialog(null, "NO PUEDE TERMINAR UNA ORDEN SI NO REGISTRA ALGUN PRODUCTO");
        } else {
            seteoDatos(); //setea datos en el arraylist
            adicional objAdicional = new adicional();
            objAdicional.setVisible(true);
            dispose();
//            generarFac objGF = new generarFac(); //para hacer pruebas
//            objGF.setVisible(true);
//            cantidadPromocion();
        }
    }

//    public void cantidadPromocion() { //para hacer pruebas
//        if ((int) spnPromo1.getValue() != 0) {
//            String namePlato = txtProm1.getText();
//            double precioPlato = Double.parseDouble(txtPP1.getText());
//            int cantidadPlato = (int) spnPromo1.getValue();
//            double pp = precioPlato * cantidadPlato;
//            double igv = pp * 0.18;
//            double pF = igv + pp;
//            JOptionPane.showMessageDialog(null, "NOMBNRE PLATO: " + namePlato
//                    + "\nPRECIO PLATO: S/" + precioPlato + "\nCANTIDAD PLATO: " + cantidadPlato + "\nPRECIO PARCIAL: S/" + pp + "\nIGV (18%): S/" + String.format("%.2f", igv)
//                    + "\nMONTO TOTAL: S/" + String.format("%.2f", pF));
//        }
//    }
    //Capturar datos 
    public void seteoDatos() {
        //Atributos
        String producto = null;
        int cant = 0;
        double precioP = 0;

        //SETEAN VALORES EN EL ARRAYLIST
        /////////////////////////////////////////////////////////////
        //MOEDULO PROMOCION
        if ((int) spnPromo1.getValue() != 0) {
            dtoFacturaTemp aux1 = new dtoFacturaTemp(); //Objeto dto
            producto = txtProm1.getText(); //capturamos valores
            cant = (int) spnPromo1.getValue();
            precioP = Double.parseDouble(txtPP1.getText());
            aux1.setNombreProducto(producto); //seteamos el dto
            aux1.setCantidad(cant);
            aux1.setPrecioProducto(precioP);
            pedido.add(aux1); //seteamos el dto en el arrayList
        }
        if ((int) spnPromo2.getValue() != 0) {
            dtoFacturaTemp aux2 = new dtoFacturaTemp();
            producto = txtProm2.getText();
            cant = (int) spnPromo2.getValue();
            precioP = Double.parseDouble(txtPP2.getText());
            aux2.setNombreProducto(producto);
            aux2.setCantidad(cant);
            aux2.setPrecioProducto(precioP);
            pedido.add(aux2);
        }
        if ((int) spnPromo3.getValue() != 0) {
            dtoFacturaTemp aux3 = new dtoFacturaTemp();
            producto = txtProm3.getText();
            cant = (int) spnPromo3.getValue();
            precioP = Double.parseDouble(txtPP3.getText());
            aux3.setNombreProducto(producto);
            aux3.setCantidad(cant);
            aux3.setPrecioProducto(precioP);
            pedido.add(aux3);
        }
        if ((int) spnPromo4.getValue() != 0) {
            dtoFacturaTemp aux4 = new dtoFacturaTemp();
            producto = txtProm4.getText();
            cant = (int) spnPromo4.getValue();
            precioP = Double.parseDouble(txtPP4.getText());
            aux4.setNombreProducto(producto);
            aux4.setCantidad(cant);
            aux4.setPrecioProducto(precioP);
            pedido.add(aux4);
        }
        if ((int) spnPromo5.getValue() != 0) {
            dtoFacturaTemp aux5 = new dtoFacturaTemp();
            producto = txtProm5.getText();
            cant = (int) spnPromo5.getValue();
            precioP = Double.parseDouble(txtPP5.getText());
            aux5.setNombreProducto(producto);
            aux5.setCantidad(cant);
            aux5.setPrecioProducto(precioP);
            pedido.add(aux5);
        }
        if ((int) spnPromo6.getValue() != 0) {
            dtoFacturaTemp aux6 = new dtoFacturaTemp();
            producto = txtProm6.getText();
            cant = (int) spnPromo6.getValue();
            precioP = Double.parseDouble(txtPP6.getText());
            aux6.setNombreProducto(producto);
            aux6.setCantidad(cant);
            aux6.setPrecioProducto(precioP);
            pedido.add(aux6);
        }

        /////////////////////////////////////////////////////////////
        //MODULO MENU
        if ((int) spnMenu1.getValue() != 0) {
            dtoFacturaTemp aux7 = new dtoFacturaTemp();
            producto = txtMenu.getText();
            cant = (int) spnMenu1.getValue();
            precioP = Double.parseDouble(txtPM.getText());
            aux7.setNombreProducto(producto);
            aux7.setCantidad(cant);
            aux7.setPrecioProducto(precioP);
            pedido.add(aux7);
        }

        /////////////////////////////////////////////////////////////
        //MODULO TRAGOS
        if ((int) spnTrago1.getValue() != 0) { //CERVEZAS
            dtoFacturaTemp aux8 = new dtoFacturaTemp();
            producto = txtCerveza1.getText();
            cant = (int) spnTrago1.getValue();
            precioP = Double.parseDouble(txtPCe1.getText());
            aux8.setNombreProducto(producto);
            aux8.setCantidad(cant);
            aux8.setPrecioProducto(precioP);
            pedido.add(aux8);
        }
        if ((int) spnTrago2.getValue() != 0) {
            dtoFacturaTemp aux9 = new dtoFacturaTemp();
            producto = txtCerveza2.getText();
            cant = (int) spnTrago2.getValue();
            precioP = Double.parseDouble(txtPCe2.getText());
            aux9.setNombreProducto(producto);
            aux9.setCantidad(cant);
            aux9.setPrecioProducto(precioP);
            pedido.add(aux9);
        }
        if ((int) spnTrago3.getValue() != 0) { //VINO
            dtoFacturaTemp aux10 = new dtoFacturaTemp();
            producto = txtVino.getText();
            cant = (int) spnTrago3.getValue();
            precioP = Double.parseDouble(txtPV.getText());
            aux10.setNombreProducto(producto);
            aux10.setCantidad(cant);
            aux10.setPrecioProducto(precioP);
            pedido.add(aux10);
        }
        if ((int) spnTrago4.getValue() != 0) { //PISCO
            dtoFacturaTemp aux11 = new dtoFacturaTemp();
            producto = txtPisco1.getText();
            cant = (int) spnTrago4.getValue();
            precioP = Double.parseDouble(txtPPS1.getText());
            aux11.setNombreProducto(producto);
            aux11.setCantidad(cant);
            aux11.setPrecioProducto(precioP);
            pedido.add(aux11);
        }
        if ((int) spnTrago5.getValue() != 0) {
            dtoFacturaTemp aux12 = new dtoFacturaTemp();
            producto = txtPisco2.getText();
            cant = (int) spnTrago5.getValue();
            precioP = Double.parseDouble(txtPPS2.getText());
            aux12.setNombreProducto(producto);
            aux12.setCantidad(cant);
            aux12.setPrecioProducto(precioP);
            pedido.add(aux12);
        }

        /////////////////////////////////////////////////////////////
        //MODULO BEBIDAS
        if ((int) spnBebida1.getValue() != 0) { //CHICHA
            dtoFacturaTemp aux13 = new dtoFacturaTemp();
            producto = txtChicha1.getText();
            cant = (int) spnBebida1.getValue();
            precioP = Double.parseDouble(txtPC1.getText());
            aux13.setNombreProducto(producto);
            aux13.setCantidad(cant);
            aux13.setPrecioProducto(precioP);
            pedido.add(aux13);
        }
        if ((int) spnBebida2.getValue() != 0) {
            dtoFacturaTemp aux14 = new dtoFacturaTemp();
            producto = txtChicha2.getText();
            cant = (int) spnBebida2.getValue();
            precioP = Double.parseDouble(txtPC2.getText());
            aux14.setNombreProducto(producto);
            aux14.setCantidad(cant);
            aux14.setPrecioProducto(precioP);
            pedido.add(aux14);
        }
        if ((int) spnBebida3.getValue() != 0) {
            dtoFacturaTemp aux15 = new dtoFacturaTemp();
            producto = txtChicha3.getText();
            cant = (int) spnBebida3.getValue();
            precioP = Double.parseDouble(txtPC3.getText());
            aux15.setNombreProducto(producto);
            aux15.setCantidad(cant);
            aux15.setPrecioProducto(precioP);
            pedido.add(aux15);
        }
        if ((int) spnBebida4.getValue() != 0) { //LIMONADA
            dtoFacturaTemp aux16 = new dtoFacturaTemp();
            producto = txtLimonada1.getText();
            cant = (int) spnBebida4.getValue();
            precioP = Double.parseDouble(txtPL1.getText());
            aux16.setNombreProducto(producto);
            aux16.setCantidad(cant);
            aux16.setPrecioProducto(precioP);
            pedido.add(aux16);
        }
        if ((int) spnBebida5.getValue() != 0) {
            dtoFacturaTemp aux17 = new dtoFacturaTemp();
            producto = txtLimonada2.getText();
            cant = (int) spnBebida5.getValue();
            precioP = Double.parseDouble(txtPL2.getText());
            aux17.setNombreProducto(producto);
            aux17.setCantidad(cant);
            aux17.setPrecioProducto(precioP);
            pedido.add(aux17);
        }
        if ((int) spnBebida6.getValue() != 0) {
            dtoFacturaTemp aux18 = new dtoFacturaTemp();
            producto = txtLimonada3.getText();
            cant = (int) spnBebida6.getValue();
            precioP = Double.parseDouble(txtPL3.getText());
            aux18.setNombreProducto(producto);
            aux18.setCantidad(cant);
            aux18.setPrecioProducto(precioP);
            pedido.add(aux18);
        }
        if ((int) spnBebida7.getValue() != 0) {//GASEOSAS
            dtoFacturaTemp aux19 = new dtoFacturaTemp();
            producto = txtGaseosa1.getText();
            cant = (int) spnBebida7.getValue();
            precioP = Double.parseDouble(txtPG1.getText());
            aux19.setNombreProducto(producto);
            aux19.setCantidad(cant);
            aux19.setPrecioProducto(precioP);
            pedido.add(aux19);
        }
        if ((int) spnBebida8.getValue() != 0) {
            dtoFacturaTemp aux20 = new dtoFacturaTemp();
            producto = txtGaseosa2.getText();
            cant = (int) spnBebida8.getValue();
            precioP = Double.parseDouble(txtPG2.getText());
            aux20.setNombreProducto(producto);
            aux20.setCantidad(cant);
            aux20.setPrecioProducto(precioP);
            pedido.add(aux20);
        }
        if ((int) spnBebida9.getValue() != 0) {
            dtoFacturaTemp aux21 = new dtoFacturaTemp();
            producto = txtGaseosa3.getText();
            cant = (int) spnBebida9.getValue();
            precioP = Double.parseDouble(txtPG3.getText());
            aux21.setNombreProducto(producto);
            aux21.setCantidad(cant);
            aux21.setPrecioProducto(precioP);
            pedido.add(aux21);
        }
        if ((int) spnBebida10.getValue() != 0) {
            dtoFacturaTemp aux22 = new dtoFacturaTemp();
            producto = txtGaseosa4.getText();
            cant = (int) spnBebida10.getValue();
            precioP = Double.parseDouble(txtPG4.getText());
            aux22.setNombreProducto(producto);
            aux22.setCantidad(cant);
            aux22.setPrecioProducto(precioP);
            pedido.add(aux22);
        }

        /////////////////////////////////////////////////////////////
        //MODULO EXTRAS
        if ((int) spnExtra1.getValue() != 0) {
            dtoFacturaTemp aux23 = new dtoFacturaTemp();
            producto = txtExtra1.getText();
            cant = (int) spnExtra1.getValue();
            precioP = Double.parseDouble(txtPE1.getText());
            aux23.setNombreProducto(producto);
            aux23.setCantidad(cant);
            aux23.setPrecioProducto(precioP);
            pedido.add(aux23);
        }
        if ((int) spnExtra2.getValue() != 0) {
            dtoFacturaTemp aux24 = new dtoFacturaTemp();
            producto = txtExtra2.getText();
            cant = (int) spnExtra2.getValue();
            precioP = Double.parseDouble(txtPE2.getText());
            aux24.setNombreProducto(producto);
            aux24.setCantidad(cant);
            aux24.setPrecioProducto(precioP);
            pedido.add(aux24);
        }
        if ((int) spnExtra3.getValue() != 0) {
            dtoFacturaTemp aux25 = new dtoFacturaTemp();
            producto = txtExtra3.getText();
            cant = (int) spnExtra3.getValue();
            precioP = Double.parseDouble(txtPE3.getText());
            aux25.setNombreProducto(producto);
            aux25.setCantidad(cant);
            aux25.setPrecioProducto(precioP);
            pedido.add(aux25);
        }
        if ((int) spnExtra4.getValue() != 0) {
            dtoFacturaTemp aux26 = new dtoFacturaTemp();
            producto = txtExtra4.getText();
            cant = (int) spnExtra4.getValue();
            precioP = Double.parseDouble(txtPE4.getText());
            aux26.setNombreProducto(producto);
            aux26.setCantidad(cant);
            aux26.setPrecioProducto(precioP);
            pedido.add(aux26);
        }
        if ((int) spnExtra5.getValue() != 0) {
            dtoFacturaTemp aux27 = new dtoFacturaTemp();
            producto = txtExtra5.getText();
            cant = (int) spnExtra5.getValue();
            precioP = Double.parseDouble(txtPE5.getText());
            aux27.setNombreProducto(producto);
            aux27.setCantidad(cant);
            aux27.setPrecioProducto(precioP);
            pedido.add(aux27);
        }
        if ((int) spnExtra6.getValue() != 0) {
            dtoFacturaTemp aux28 = new dtoFacturaTemp();
            producto = txtExtra6.getText();
            cant = (int) spnExtra6.getValue();
            precioP = Double.parseDouble(txtPE6.getText());
            aux28.setNombreProducto(producto);
            aux28.setCantidad(cant);
            aux28.setPrecioProducto(precioP);
            pedido.add(aux28);
        }
        if ((int) spnExtra7.getValue() != 0) {
            dtoFacturaTemp aux29 = new dtoFacturaTemp();
            producto = txtExtra7.getText();
            cant = (int) spnExtra7.getValue();
            precioP = Double.parseDouble(txtPE7.getText());
            aux29.setNombreProducto(producto);
            aux29.setCantidad(cant);
            aux29.setPrecioProducto(precioP);
            pedido.add(aux29);
        }
        if ((int) spnExtra8.getValue() != 0) {
            dtoFacturaTemp aux30 = new dtoFacturaTemp();
            producto = txtExtra8.getText();
            cant = (int) spnExtra8.getValue();
            precioP = Double.parseDouble(txtPE8.getText());
            aux30.setNombreProducto(producto);
            aux30.setCantidad(cant);
            aux30.setPrecioProducto(precioP);
            pedido.add(aux30);
        }
    }

    //Main
    public static void main(String args[]) {
        carta objCarta = new carta();
        objCarta.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTerminarOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner spnBebida1;
    private javax.swing.JSpinner spnBebida10;
    private javax.swing.JSpinner spnBebida2;
    private javax.swing.JSpinner spnBebida3;
    private javax.swing.JSpinner spnBebida4;
    private javax.swing.JSpinner spnBebida5;
    private javax.swing.JSpinner spnBebida6;
    private javax.swing.JSpinner spnBebida7;
    private javax.swing.JSpinner spnBebida8;
    private javax.swing.JSpinner spnBebida9;
    private javax.swing.JSpinner spnExtra1;
    private javax.swing.JSpinner spnExtra2;
    private javax.swing.JSpinner spnExtra3;
    private javax.swing.JSpinner spnExtra4;
    private javax.swing.JSpinner spnExtra5;
    private javax.swing.JSpinner spnExtra6;
    private javax.swing.JSpinner spnExtra7;
    private javax.swing.JSpinner spnExtra8;
    private javax.swing.JSpinner spnMenu1;
    private javax.swing.JSpinner spnPromo1;
    private javax.swing.JSpinner spnPromo2;
    private javax.swing.JSpinner spnPromo3;
    private javax.swing.JSpinner spnPromo4;
    private javax.swing.JSpinner spnPromo5;
    private javax.swing.JSpinner spnPromo6;
    private javax.swing.JSpinner spnTrago1;
    private javax.swing.JSpinner spnTrago2;
    private javax.swing.JSpinner spnTrago3;
    private javax.swing.JSpinner spnTrago4;
    private javax.swing.JSpinner spnTrago5;
    private javax.swing.JLabel txtCerveza1;
    private javax.swing.JLabel txtCerveza2;
    private javax.swing.JLabel txtChicha1;
    private javax.swing.JLabel txtChicha2;
    private javax.swing.JLabel txtChicha3;
    private javax.swing.JLabel txtExtra1;
    private javax.swing.JLabel txtExtra2;
    private javax.swing.JLabel txtExtra3;
    private javax.swing.JLabel txtExtra4;
    private javax.swing.JLabel txtExtra5;
    private javax.swing.JLabel txtExtra6;
    private javax.swing.JLabel txtExtra7;
    private javax.swing.JLabel txtExtra8;
    private javax.swing.JLabel txtGaseosa1;
    private javax.swing.JLabel txtGaseosa2;
    private javax.swing.JLabel txtGaseosa3;
    private javax.swing.JLabel txtGaseosa4;
    private javax.swing.JLabel txtLimonada1;
    private javax.swing.JLabel txtLimonada2;
    private javax.swing.JLabel txtLimonada3;
    private javax.swing.JLabel txtMenu;
    private javax.swing.JLabel txtPC1;
    private javax.swing.JLabel txtPC2;
    private javax.swing.JLabel txtPC3;
    private javax.swing.JLabel txtPCe1;
    private javax.swing.JLabel txtPCe2;
    private javax.swing.JLabel txtPE1;
    private javax.swing.JLabel txtPE2;
    private javax.swing.JLabel txtPE3;
    private javax.swing.JLabel txtPE4;
    private javax.swing.JLabel txtPE5;
    private javax.swing.JLabel txtPE6;
    private javax.swing.JLabel txtPE7;
    private javax.swing.JLabel txtPE8;
    private javax.swing.JLabel txtPG1;
    private javax.swing.JLabel txtPG2;
    private javax.swing.JLabel txtPG3;
    private javax.swing.JLabel txtPG4;
    private javax.swing.JLabel txtPL1;
    private javax.swing.JLabel txtPL2;
    private javax.swing.JLabel txtPL3;
    private javax.swing.JLabel txtPM;
    private javax.swing.JLabel txtPP1;
    private javax.swing.JLabel txtPP2;
    private javax.swing.JLabel txtPP3;
    private javax.swing.JLabel txtPP4;
    private javax.swing.JLabel txtPP5;
    private javax.swing.JLabel txtPP6;
    private javax.swing.JLabel txtPPS1;
    private javax.swing.JLabel txtPPS2;
    private javax.swing.JLabel txtPV;
    private javax.swing.JLabel txtPisco1;
    private javax.swing.JLabel txtPisco2;
    private javax.swing.JLabel txtProm1;
    private javax.swing.JLabel txtProm2;
    private javax.swing.JLabel txtProm3;
    private javax.swing.JLabel txtProm4;
    private javax.swing.JLabel txtProm5;
    private javax.swing.JLabel txtProm6;
    private javax.swing.JLabel txtVino;
    // End of variables declaration//GEN-END:variables
}
