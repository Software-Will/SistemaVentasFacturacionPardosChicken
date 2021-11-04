package view;

import dao.daoDetalleFactura;
import dao.daoFactura;
import dao.impl.daoFacturaImpl;
import dao.impl.daoFacturaTempImpl;
import dto.dtoFactura;
import dto.dtoFacturaTemp;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import metodos.CargarComboBox;
import metodos.TextPrompt;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import utils.cnn;
import dao.daoFacturaTemp;
import dao.impl.daoDetalleFacturaImpl;
import dto.dtoDetalleFactura;

public class generarFac extends javax.swing.JFrame {

    String nameAdmin;
    String metoP;
    double subTotal = 0, igv = 0, montoFinal = 0;
    DefaultTableModel modelo = new DefaultTableModel();

    //Constructor
    public generarFac() {
        initComponents();
        this.setTitle("Registro Venta | Factura - Pardos Chicken"); //Nombre de ventana
        setIconImage(new ImageIcon(getClass().getResource("/img/iconPardos.png")).getImage()); //cambiar el icono de la ventana
        setLocationRelativeTo(null); //centro de la pantalla
        this.getContentPane().setBackground(Color.white); //color ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//al cerrar la ventana, se dejara de ejecutar en 2do plano
        setResizable(false); //No redimenzionable
        setDefaultCloseOperation(0);
        TextPrompt placeholder1 = new TextPrompt("    Nombre del cliente", txtNomCli);
        TextPrompt placeholder2 = new TextPrompt("         DNI|RUC", txtDNIRUC);
        TextPrompt placeholder3 = new TextPrompt("         Telefono", txtTelefono);
        lblFechaActual.setText(fechaActual()); //LA FECHA SE SETEA AUTOMATICAMENTE
        CargarComboBox objCCB = new CargarComboBox();
        objCCB.cbxAdmins(cbxAdmin); //llenado de cbx
        System.out.println("CANTIDAD DE PRODUCTOS: " + carta.pedido.size());
        listarPedido();
//        for (dtoFacturaTemp pedido : carta.pedido) {
//            System.out.println(pedido);
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxMetodoPago = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedido = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();
        lblIGV = new javax.swing.JLabel();
        lblMontoTotal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnGenerarFactura = new javax.swing.JButton();
        txtNomCli = new javax.swing.JTextField();
        txtDNIRUC = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        cbxAdmin = new javax.swing.JComboBox<>();
        lblFechaActual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconPardosFac.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel2.setText("Lima Metropolitana - Perú");

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel3.setText("987 654 321 - 01 987 543 21");

        cbxMetodoPago.setBackground(new java.awt.Color(255, 255, 255));
        cbxMetodoPago.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        cbxMetodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Efectivo", "Tarjeta" }));
        cbxMetodoPago.setToolTipText("");
        cbxMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMetodoPagoActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dinersClub.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/visa .png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mastercard.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pagoEfectivo.png"))); // NOI18N

        tablaPedido.setBackground(new java.awt.Color(255, 255, 255));
        tablaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCTO", "CANTIDAD", "PRECIO UNIDAD", "MONTO"
            }
        ));
        jScrollPane1.setViewportView(tablaPedido);

        jLabel8.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        jLabel8.setText("Lunes a Sabado 11:00 am - 11:00 pm");

        jLabel9.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        jLabel9.setText("Horario de atención");

        jLabel10.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        jLabel10.setText("Domingo y Feriados 10:00 am - 8:00 pm");

        lblSubTotal.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        lblSubTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblIGV.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        lblIGV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMontoTotal.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        lblMontoTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setText("Sub Total");

        jLabel12.setText("IGV 18%");

        jLabel13.setText("Monto Total");

        btnGenerarFactura.setBackground(new java.awt.Color(51, 51, 51));
        btnGenerarFactura.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        btnGenerarFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarFactura.setText("Generar Factura");
        btnGenerarFactura.setBorder(null);
        btnGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarFacturaActionPerformed(evt);
            }
        });

        txtNomCli.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        txtNomCli.setForeground(java.awt.Color.black);
        txtNomCli.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtDNIRUC.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        txtDNIRUC.setForeground(java.awt.Color.black);
        txtDNIRUC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDNIRUC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtDNIRUC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIRUCKeyTyped(evt);
            }
        });

        txtTelefono.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        txtTelefono.setForeground(java.awt.Color.black);
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        cbxAdmin.setBackground(new java.awt.Color(255, 255, 255));
        cbxAdmin.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        cbxAdmin.setToolTipText("");
        cbxAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAdminActionPerformed(evt);
            }
        });

        lblFechaActual.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        lblFechaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaActual.setText("Fecha Actual");
        lblFechaActual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGenerarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(lblIGV, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(643, 643, 643))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(517, 517, 517)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel11)
                                        .addGap(16, 16, 16)
                                        .addComponent(lblSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addGap(74, 74, 74)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNomCli, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                            .addComponent(txtDNIRUC)
                                            .addComponent(txtTelefono))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbxMetodoPago, 0, 180, Short.MAX_VALUE)
                                            .addComponent(cbxAdmin, 0, 180, Short.MAX_VALUE)
                                            .addComponent(lblFechaActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel6))))))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDNIRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4))))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIGV, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel13))
                    .addComponent(lblMontoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarFacturaActionPerformed
        try {
            comprobarDatosFac();
        } catch (SQLException ex) {
            Logger.getLogger(generarFac.class.getName()).log(Level.SEVERE, null, ex);
        }
        carta.pedido.clear();
    }//GEN-LAST:event_btnGenerarFacturaActionPerformed

    //Metodos limitadores 
    private void txtDNIRUCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIRUCKeyTyped
        if (txtDNIRUC.getText().length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDNIRUCKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (txtTelefono.getText().length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    //cbxNombreAdmin que atendio
    private void cbxAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAdminActionPerformed
        nameAdmin = (String) cbxAdmin.getSelectedItem();
    }//GEN-LAST:event_cbxAdminActionPerformed

    //cbx metodopago 
    private void cbxMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMetodoPagoActionPerformed
        metoP = (String) cbxMetodoPago.getSelectedItem();
    }//GEN-LAST:event_cbxMetodoPagoActionPerformed

    //Metodo generarFactura
    public void comprobarDatosFac() throws SQLException {
        if ("ADMINISTRADOR".equalsIgnoreCase(nameAdmin) || "-".equalsIgnoreCase(metoP)
                || txtDNIRUC.getText().equals("") || txtNomCli.getText().equals("") || txtNomCli.getText().equals("") || txtTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "NO PUEDE GENERAR LA FACTURA CON DATOS EN BLANCO");
            JOptionPane.showMessageDialog(null, "SELECCIONE EL ADMINISTRADOR | ¿QUIEN ATENDIÓ?");
        } else {
            if (txtDNIRUC.getText().contains("-") || txtDNIRUC.getText().contains("+")) {
                JOptionPane.showMessageDialog(null, "EL DNI O RUC NO PUEDE CONTENER SIGNOS");
            } else if (txtTelefono.getText().contains("-") || txtTelefono.getText().contains("+")) {
                JOptionPane.showMessageDialog(null, "EL NUMERO TELEFONICO NO PUEDE CONTENER SIGNOS");
            } else {
                if (txtTelefono.getText().matches("[+-]?\\d*(\\.\\d+)?")) {
                    registrarFactura(); //Registramos factura
                } else {
                    JOptionPane.showMessageDialog(null, "TELEFONO INVALIDO");
                }
            }
        }
    }

    //Metodo listar pedido
    public void listarPedido() { //ACA SE LISTA EN LA TABLA DEL VIEW GENERAR FAC
        double subTotalAux;
        Object arrayTabla[][] = new Object[carta.pedido.size()][4]; // f * c || i* j
        for (int i = 0; i < carta.pedido.size(); i++) {
            arrayTabla[i][0] = carta.pedido.get(i).getNombreProducto();
            arrayTabla[i][1] = carta.pedido.get(i).getCantidad();
            arrayTabla[i][2] = carta.pedido.get(i).getPrecioProducto();
            arrayTabla[i][3] = (carta.pedido.get(i).getCantidad() * carta.pedido.get(i).getPrecioProducto());
        }
        for (int i = 0; i < carta.pedido.size(); i++) { //For para acumular el subtotal
            subTotalAux = Math.round((carta.pedido.get(i).getCantidad() * carta.pedido.get(i).getPrecioProducto()) * 100.0) / 100.0; //get(i) -> dentro de cada indice hay un objeto dto y cada indice se puede mostrar por su get
            subTotal = Math.round((subTotal + subTotalAux) * 100.0) / 100.0;
        }
        igv = Math.round((subTotal * 0.18) * 100.0) / 100.0;
        montoFinal = Math.round((subTotal + igv) * 100.0) / 100.0;
        //Seteo de valores en jframe 
        lblSubTotal.setText("S/ " + String.valueOf(subTotal));
        lblIGV.setText("S/ " + String.valueOf(igv));
        lblMontoTotal.setText("S/ " + String.valueOf(montoFinal));
        JOptionPane.showMessageDialog(null, "SUBTOTAL: S/ " + subTotal + "\nIGV 18%: S/ " + igv + "\nMONTO FINAL: S/ " + montoFinal); //mensaje de prueba
        tablaPedido.setModel(new javax.swing.table.DefaultTableModel(
                arrayTabla,
                new String[]{
                    "PRODUCTO", "CANTIDAD", "PRECIO UNIDAD", "MONTO"
                }));
    }

    //Metodo para generar factura - SOLO TABLA FACTURA - NO DETALLEFAC
    public void registrarFactura() throws SQLException {
        try { //Registrar factura en la bd
            dtoFactura dtoFac = new dtoFactura();
            daoFactura daoFac = new daoFacturaImpl();
            //Capturamos valores
            String fecha = lblFechaActual.getText();
            String nombreCliente = txtNomCli.getText();
            String dniRuc = txtDNIRUC.getText();
            String telefono = txtTelefono.getText();
            String admin = nameAdmin; //Esta captura se da en cbxAdmin
            double sTotal = subTotal;
            double iGV = igv;
            double mFinal = montoFinal;
            String metodoPago = metoP;
            dtoFac.setFecha(fecha);
            dtoFac.setNombreCliente(nombreCliente);
            dtoFac.setDniRUC(dniRuc);
            dtoFac.setTelefono(telefono);
            dtoFac.setAdministrador(admin);
            dtoFac.setSubtotal(sTotal);
            dtoFac.setIgv(iGV);
            dtoFac.setTotal(mFinal);
            dtoFac.setMetodoPago(metodoPago);
            daoFac.facturaIns(dtoFac); //ACA INSERTO LOS DATOS DE LA FACTURA
            registroPedidoTEMP(); //METODO REGISTRA PEDIDO TEMP
            registrarDetalleFactura();
            /*METODO PARA REGISTRA DETALLE FACTURA (DATOS DEL PEDIDO) DE MANERA PERMANENTE 
            TIENE QUE SER DESPUES DE REALIZAR DAOFAC.FACTURAINS(DTOFAC), POR LA PRECEDENCIA DE DATOS*/
            facturaPDF();
            cierreView(); //CIERRA LA VISTA DE FACTURA
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    //Metodo para setear datos en la tabla detallefactura
    public void registrarDetalleFactura() {
        daoFacturaImpl dFI = new daoFacturaImpl(); //DAO DE FACTURA PARA LLAMAR AL ULTIMO ID
        dtoFactura fac = new dtoFactura();
        dtoDetalleFactura detFac = new dtoDetalleFactura(); //OBJETOS DE DETALLE FACTURA - NORMAL
        daoDetalleFactura dDF = new daoDetalleFacturaImpl();
        fac = dFI.ultimoID(); //ULTIMO ID
        int ultimoID = fac.getIdFactura(); //CAPTURAMOS EL ULTIMO ID del obj mediante el .get
        for (int i = 0; i < carta.pedido.size(); i++) { //for para setear los valores
            try {
                //Capturamos valores
                String nombreProducto = carta.pedido.get(i).getNombreProducto();
                int cantidad = carta.pedido.get(i).getCantidad();
                double precioProd = carta.pedido.get(i).getPrecioProducto();
                double montoProd = carta.pedido.get(i).getCantidad() * carta.pedido.get(i).getPrecioProducto();
                detFac.setIdFactura(ultimoID); //SETEO DTO
                detFac.setNomProd(nombreProducto);
                detFac.setCantidad(cantidad);
                detFac.setPrecioProd(precioProd);
                detFac.setMontoProd(montoProd);
                //SETEO DAO
                dDF.detalleFacIns(detFac);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }
    }

    //Metodo para setear los valores del array list en la base de datos
    public void registroPedidoTEMP() {
        dtoFacturaTemp pedTemp = new dtoFacturaTemp();
        daoFacturaTemp dPT = new daoFacturaTempImpl();
        for (int i = 0; i < carta.pedido.size(); i++) { //for pq se debe setear todas las filas del arraylist
            try {
                //Capturamos valores
                String nombreCliente = txtNomCli.getText();
                String dniRuc = txtDNIRUC.getText();
                String telefono = txtTelefono.getText();
                String admin = nameAdmin; //Esta captura se da en cbxAdmin
                String metodoPago = metoP;
                String nombreProducto = carta.pedido.get(i).getNombreProducto();
                int cantidad = carta.pedido.get(i).getCantidad();
                double precioProducto = carta.pedido.get(i).getPrecioProducto();
                double montoProducto = carta.pedido.get(i).getCantidad() * carta.pedido.get(i).getPrecioProducto();
                double sTotal = subTotal;
                double iGV = igv;
                double mFinal = montoFinal;
                //Seteo DTO
                pedTemp.setNombreCliente(nombreCliente);
                pedTemp.setDniRuc(dniRuc);
                pedTemp.setTelefono(telefono);
                pedTemp.setAdministrador(admin);
                pedTemp.setMetodoPago(metodoPago);
                pedTemp.setNombreProducto(nombreProducto);
                pedTemp.setCantidad(cantidad);
                pedTemp.setPrecioProducto(precioProducto);
                pedTemp.setMontoProducto(montoProducto);
                pedTemp.setSubtotal(sTotal);
                pedTemp.setIgv(iGV);
                pedTemp.setTotal(mFinal);
                //Seteo DAO INSERT
                dPT.pedidoIns(pedTemp);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }
    }

    //Metodo para generar la factura (pdf)
    public void facturaPDF() throws SQLException {
        try {
            cnn con = new cnn();
            Connection conn = con.getConnection();
            JasperReport factura = null;
            String path = "src\\reportes\\factura.jasper"; //Ruta del jasper
            factura = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(path, null, conn);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    //METODO PARA CAPTURAR LA FECHA
    public String fechaActual() {
        Date fecha = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); //Formato de fecha para administrador
        return df.format(fecha);
    }

    //Metodo para cerrar la vista de genFactura
    public void cierreView() {
        JOptionPane.showMessageDialog(null, "VENTA | FACTURA REGISTRADA");
        JOptionPane.showMessageDialog(null, "ATENDIDO POR: " + nameAdmin.toUpperCase());
        menuPrincipal objMen = new menuPrincipal();
        objMen.setVisible(true);
        dispose();
    }

//Main
    public static void main(String args[]) {
        generarFac objVenta = new generarFac();
        objVenta.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarFactura;
    private javax.swing.JComboBox<String> cbxAdmin;
    private javax.swing.JComboBox<String> cbxMetodoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaActual;
    private javax.swing.JLabel lblIGV;
    private javax.swing.JLabel lblMontoTotal;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JTable tablaPedido;
    private javax.swing.JTextField txtDNIRUC;
    private javax.swing.JTextField txtNomCli;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
