package view.Mantenimiento;

import dao.daoFactura;
import dao.impl.daoFacturaImpl;
import dto.dtoFactura;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import metodos.TextPrompt;
import view.mantenimiento;

public class manFactura extends javax.swing.JFrame {

    int op;

    //Constructor
    public manFactura() {
        initComponents();
        this.setTitle("Mantenimiento Factura - Pardos Chicken"); //Nombre de ventana
        setIconImage(new ImageIcon(getClass().getResource("/img/iconPardos.png")).getImage()); //cambiar el icono de la ventana
        setLocationRelativeTo(null); //centro de la pantalla
        this.getContentPane().setBackground(Color.white); //color ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//al cerrar la ventana, se dejara de ejecutar en 2do plano
        setDefaultCloseOperation(0); //Deshabilitar la funcion de close (X)
        setResizable(false); //No redimenzionable
        TextPrompt placeholder1 = new TextPrompt("  Nombre del cliente", txtNomCli);
        TextPrompt placeholder2 = new TextPrompt("       Telefono", txtTelefono);
        TextPrompt placeholder3 = new TextPrompt("      DNI | RUC", txtDNIRUC);
        txtNomCli.requestFocus();
        listar("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbxMetodoPago = new javax.swing.JComboBox<>();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFactura = new javax.swing.JTable();
        lblCapturarAdmin = new javax.swing.JLabel();
        txtNomCli = new javax.swing.JTextField();
        lblNumFac = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblrandom = new javax.swing.JLabel();
        txtDNIRUC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconFacturas.png"))); // NOI18N

        cbxMetodoPago.setBackground(new java.awt.Color(255, 255, 255));
        cbxMetodoPago.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        cbxMetodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medio de pago", "Efectivo", "Tarjeta" }));
        cbxMetodoPago.setToolTipText("");
        cbxMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMetodoPagoActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(0, 153, 204));
        btnActualizar.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(204, 0, 51));
        btnEliminar.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

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

        tablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "FECHA", "NOMBRE", "DNI | RUC", "TELEFONO", "ADMINISTRADOR", "METODO DE PAGO"
            }
        ));
        tablaFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFacturaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaFactura);

        lblCapturarAdmin.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        lblCapturarAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCapturarAdmin.setText("Admin : Automatico");
        lblCapturarAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNomCli.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        txtNomCli.setForeground(java.awt.Color.black);
        txtNomCli.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblNumFac.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        lblNumFac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumFac.setText("N° : No cambia");
        lblNumFac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFecha.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("Fecha : No cambia");
        lblFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTelefono.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        txtTelefono.setForeground(java.awt.Color.black);
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        lblrandom.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        lblrandom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblrandom.setText("(*) Para mas detalles ve al apartado de facturas");

        txtDNIRUC.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        txtDNIRUC.setForeground(java.awt.Color.black);
        txtDNIRUC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDNIRUC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtDNIRUC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIRUCKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(lblrandom, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumFac, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCapturarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDNIRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNumFac)
                                .addGap(32, 32, 32)
                                .addComponent(txtNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(lblCapturarAdmin))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDNIRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFecha)
                                .addGap(32, 32, 32)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(cbxMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblrandom)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
        mantenimiento objMan = new mantenimiento();
        objMan.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    //Limitador de numero telefonico
    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (txtTelefono.getText().length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    //Metodo para capturar valores
    private void tablaFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFacturaMouseClicked
        int fila = tablaFactura.getSelectedRow();
        lblNumFac.setText(String.valueOf(tablaFactura.getValueAt(fila, 0)));
        lblFecha.setText(String.valueOf(tablaFactura.getValueAt(fila, 1)));
        txtNomCli.setText(String.valueOf(tablaFactura.getValueAt(fila, 2)));
        txtDNIRUC.setText(String.valueOf(tablaFactura.getValueAt(fila, 3)));
        txtTelefono.setText(String.valueOf(tablaFactura.getValueAt(fila, 4)));
        lblCapturarAdmin.setText(String.valueOf(tablaFactura.getValueAt(fila, 5)));
        if ("Efectivo".equals(String.valueOf(tablaFactura.getValueAt(fila, 6)))) {
            cbxMetodoPago.setSelectedIndex(1);
        } else if ("Tarjeta".equals(String.valueOf(tablaFactura.getValueAt(fila, 6)))) {
            cbxMetodoPago.setSelectedIndex(2);
        }
    }//GEN-LAST:event_tablaFacturaMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        update();
        listar("");
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        delete();
        listar("");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cbxMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMetodoPagoActionPerformed
        op = cbxMetodoPago.getSelectedIndex();
    }//GEN-LAST:event_cbxMetodoPagoActionPerformed

    private void txtDNIRUCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIRUCKeyTyped
        if (txtDNIRUC.getText().length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDNIRUCKeyTyped

    //Metodo listar -> SEL/GET: daoImpl
    public void listar(String aux) {
        DefaultTableModel modelo = new DefaultTableModel();
        daoFactura daoFac = new daoFacturaImpl();
        ArrayList<dtoFactura> listar = new ArrayList<>();
        if (aux.length() == 0) {
            listar = (ArrayList<dtoFactura>) daoFac.facturaSel();
        }
        modelo.setRowCount(listar.size());
        Iterator it = listar.iterator();
        modelo.addColumn("N°");
        modelo.addColumn("FECHA");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("DNI | RUC");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("ADMINISTRADOR");
        modelo.addColumn("METODO DE PAGO");
        int i = 0;
        while (it.hasNext()) {
            Object obj = it.next();
            dtoFactura dtoFac = (dtoFactura) obj;
            modelo.setValueAt(dtoFac.getIdFactura(), i, 0);
            modelo.setValueAt(dtoFac.getFecha(), i, 1);
            modelo.setValueAt(dtoFac.getNombreCliente(), i, 2);
            modelo.setValueAt(dtoFac.getDniRUC(), i, 3);
            modelo.setValueAt(dtoFac.getTelefono(), i, 4);
            modelo.setValueAt(dtoFac.getAdministrador(), i, 5);
            modelo.setValueAt(dtoFac.getMetodoPago(), i, 6);
            i++;
        }
        tablaFactura.setModel(modelo); //SETEAMOS LOS DATOS EN LA TABLA
    }

    //Metodo actualizar
    public void update() {
        String idFac, fecha, nombreCli, dniRuc, telefono, admin, metodoPago = "";
        idFac = lblNumFac.getText();
        fecha = lblFecha.getText();
        nombreCli = txtNomCli.getText();
        dniRuc = txtDNIRUC.getText();
        telefono = txtTelefono.getText();
        admin = lblCapturarAdmin.getText();
        if (op == 1) {
            metodoPago = "Efectivo";
        } else if (op == 2) {
            metodoPago = "Tarjeta";
        }
        //Objetos dto dao
        dtoFactura dtoFac = new dtoFactura();
        daoFactura daoFac = new daoFacturaImpl();//Seteamos el objeto dto en el daoImplUpdate
        if ("".equals(txtNomCli.getText()) || "".equals(txtTelefono.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA FILA");
        } else {
            if (telefono.contains("-") || telefono.contains("+")) {
                JOptionPane.showMessageDialog(null, "UN NUMERO NO PUEDE CONTENER SIGNOS");
            } else {
                if (telefono.matches("[+-]?\\d*(\\.\\d+)?")) {
                    try {
                        dtoFac.setIdFactura(Integer.parseInt(idFac));
                        dtoFac.setFecha(fecha);
                        dtoFac.setNombreCliente(nombreCli);
                        dtoFac.setDniRUC(dniRuc);
                        dtoFac.setTelefono(telefono);
                        dtoFac.setAdministrador(admin);
                        dtoFac.setMetodoPago(metodoPago);
                        daoFac.facturaUpd(dtoFac);
                        JOptionPane.showMessageDialog(null, "FILA ACTUALIZADA");
                        //RESETEAMOS VALORES
                        lblNumFac.setText("N° : No cambia");
                        txtNomCli.setText("");
                        txtTelefono.setText("");
                        lblFecha.setText("Fecha : No cambia");
                        lblCapturarAdmin.setText("Admin : No cambia");
                        cbxMetodoPago.setSelectedIndex(0);
                        txtNomCli.requestFocus();
                    } catch (HeadlessException | NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage() + " : VERIFIQUE LA BD");
                        JOptionPane.showMessageDialog(null, daoFac.getMensaje());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "NUMERO TELEFONICO INVALIDO");
                }

            }
        }
    }

    //Metodo delete
    public void delete() {
        String idFac;
        idFac = lblNumFac.getText();
        daoFactura daoFac = new daoFacturaImpl();
        List<Integer> list = new ArrayList<>();
        if ("".equals(txtNomCli.getText()) || "".equals(txtDNIRUC.getText()) || "".equals(txtTelefono.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA FILA");
        } else {
            try {
                int op = JOptionPane.showOptionDialog(null, "¿ESTA SEGURO DE ELIMINAR ESTE REGISTRO?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                switch (op) {
                    case 0:
                        list.add(Integer.parseInt(idFac));
                        daoFac.facturaDel(list);
                        JOptionPane.showMessageDialog(null, "FILA ELIMINADA");
                        //RESETEAMOS VALORES
                        lblNumFac.setText("N° : No cambia");
                        txtNomCli.setText("");
                        txtTelefono.setText("");
                        lblFecha.setText("Fecha : No cambia");
                        lblCapturarAdmin.setText("Admin : No cambia");
                        cbxMetodoPago.setSelectedIndex(0);
                        txtNomCli.requestFocus();
                        break;
                    case 1:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "OPCION NO REGISTRADA");
                        break;
                }
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + " : VERIFIQUE LA BD");
                JOptionPane.showMessageDialog(null, daoFac.getMensaje());
            }
        }
    }

    //Main
    public static void main(String args[]) {
        manFactura objMFac = new manFactura();
        objMFac.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxMetodoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCapturarAdmin;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNumFac;
    private javax.swing.JLabel lblrandom;
    private javax.swing.JTable tablaFactura;
    private javax.swing.JTextField txtDNIRUC;
    private javax.swing.JTextField txtNomCli;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
