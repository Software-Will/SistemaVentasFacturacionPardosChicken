package view;

import dao.impl.daoFacturaImpl;
import dto.dtoFactura;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import metodos.TextPrompt;

public class buscarFactura extends javax.swing.JFrame {

    //Variable global para enviar idFac a detalle factura
    int idFactura = 0;

    //Constructor
    public buscarFactura() {
        initComponents();
        this.setTitle("Buscar Facturas - Pardos Chicken"); //Nombre de ventana
        setIconImage(new ImageIcon(getClass().getResource("/img/iconPardos.png")).getImage()); //cambiar el icono de la ventana
        setLocationRelativeTo(null); //centro de la pantalla
        this.getContentPane().setBackground(Color.white); //color ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//al cerrar la ventana, se dejara de ejecutar en 2do plano
        setResizable(false); //No redimenzionable
        //Metodo para placeholder -> metodos/TextPromptClass
        TextPrompt placeholder1 = new TextPrompt("                                                                   Ingresa el nombre del cliente para buscar o eliminar", txtNomClienteFac);
        setDefaultCloseOperation(0);
        listar("", "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFactura = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtNomClienteFac = new javax.swing.JTextField();
        btnDetalleFac = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconFacturas.png"))); // NOI18N

        btnSalir.setBackground(new java.awt.Color(204, 0, 51));
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
                "ID FACTURA", "FECHA", "NOMBRE", "DNI | RUC", "TELEFONO", "ADMINISTRADOR", "SUBTOTAL", "IGV", "TOTAL ", "METODO DE PAGO"
            }
        ));
        tablaFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFacturaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaFactura);

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel4.setText("Buscar Factura");

        btnBuscar.setBackground(new java.awt.Color(0, 153, 204));
        btnBuscar.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtNomClienteFac.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        txtNomClienteFac.setForeground(java.awt.Color.black);
        txtNomClienteFac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomClienteFac.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnDetalleFac.setBackground(new java.awt.Color(0, 102, 102));
        btnDetalleFac.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        btnDetalleFac.setForeground(new java.awt.Color(255, 255, 255));
        btnDetalleFac.setText("Ver Detalle");
        btnDetalleFac.setBorder(null);
        btnDetalleFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleFacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txtNomClienteFac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDetalleFac, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1388, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(632, 632, 632)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomClienteFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetalleFac, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton Salir
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
        login objLogin = new login();
        menuPrincipal objMP = new menuPrincipal();
        objMP.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    //Boton buscar
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        listar("", txtNomClienteFac.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    //Capturamos el id de la fila
    private void tablaFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFacturaMouseClicked
        int fila = tablaFactura.getSelectedRow();
        idFactura = Integer.parseInt(String.valueOf(tablaFactura.getValueAt(fila, 0)));
    }//GEN-LAST:event_tablaFacturaMouseClicked

    private void btnDetalleFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleFacActionPerformed
        if (idFactura == 0) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN ID DE FACTURA PARA VER EL DETALLE DE LA FACTURA");
        } else {
            detalleFactura objDF = new detalleFactura(idFactura); //Se envia el parametro
            objDF.setVisible(true);
        }
    }//GEN-LAST:event_btnDetalleFacActionPerformed

    //Listar
    public void listar(String aux, String nom) {
        DefaultTableModel modelo = new DefaultTableModel();
        daoFacturaImpl daoFac = new daoFacturaImpl();
        ArrayList<dtoFactura> listar = new ArrayList<>();
        if (aux.length() == 0) {
            listar = (ArrayList<dtoFactura>) daoFac.buscarNombre(nom);
        }
        modelo.setRowCount(listar.size());
        Iterator it = listar.iterator();
        modelo.addColumn("ID FACTURA");
        modelo.addColumn("FECHA");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("DNI | RUC");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("ADMINISTRADOR");
        modelo.addColumn("SUBTOTAL");
        modelo.addColumn("IGV");
        modelo.addColumn("TOTAL");
        modelo.addColumn("METODO DE PAGO");
        int i = 0;
        while (it.hasNext()) {
            Object obj = it.next();
            dtoFactura dtoFactura = (dtoFactura) obj;
            modelo.setValueAt(dtoFactura.getIdFactura(), i, 0);
            modelo.setValueAt(dtoFactura.getFecha(), i, 1);
            modelo.setValueAt(dtoFactura.getNombreCliente(), i, 2);
            modelo.setValueAt(dtoFactura.getDniRUC(), i, 3);
            modelo.setValueAt(dtoFactura.getTelefono(), i, 4);
            modelo.setValueAt(dtoFactura.getAdministrador(), i, 5);
            modelo.setValueAt("S/ " + dtoFactura.getSubtotal(), i, 6);
            modelo.setValueAt("S/ " + dtoFactura.getIgv(), i, 7);
            modelo.setValueAt("S/ " + dtoFactura.getTotal(), i, 8);
            modelo.setValueAt(dtoFactura.getMetodoPago(), i, 9);
            i++;
        }
        tablaFactura.setModel(modelo); //SETEAMOS LOS DATOS EN LA TABLA
    }

    //Main
    public static void main(String args[]) {
        buscarFactura objF = new buscarFactura();
        objF.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDetalleFac;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaFactura;
    private javax.swing.JTextField txtNomClienteFac;
    // End of variables declaration//GEN-END:variables
}
