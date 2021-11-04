package view.Mantenimiento;

import dao.daoProd_View;
import dao.impl.daoProd_ViewImpl;
import dto.dtoProd_View;
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

public class manCartaPrecios extends javax.swing.JFrame {

    //variables globales
    int op;
    String catg[] = {"-", "Promoción", "Menú", "Bebidas", "Extras", "Tragos"};

    //Constructor
    public manCartaPrecios() {
        initComponents();
        this.setTitle("Mantenimiento Carta | Precios - Pardos Chicken"); //Nombre de ventana
        setIconImage(new ImageIcon(getClass().getResource("/img/iconPardos.png")).getImage()); //cambiar el icono de la ventana
        setLocationRelativeTo(null); //centro de la pantalla
        this.getContentPane().setBackground(Color.white); //color ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//al cerrar la ventana, se dejara de ejecutar en 2do plano
        setDefaultCloseOperation(0); //Deshabilitar la funcion de close (X)
        setResizable(false); //No redimenzionable
        TextPrompt placeholder3 = new TextPrompt("      Precio", txtPrecio);
        listar("", "");
        txtPrecio.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbxCateg = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        lblPlato = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconCarta .png"))); // NOI18N

        cbxCateg.setBackground(new java.awt.Color(255, 255, 255));
        cbxCateg.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        cbxCateg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Promoción", "Menú", "Bebidas", "Extras", "Tragos" }));
        cbxCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategActionPerformed(evt);
            }
        });

        tablaProducto.setBackground(new java.awt.Color(255, 255, 255));
        tablaProducto.setForeground(new java.awt.Color(0, 0, 0));
        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUCTO", "NOMBRE", "PRECIO", "CATEGORÍA"
            }
        ));
        tablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProducto);

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

        txtPrecio.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        txtPrecio.setForeground(java.awt.Color.black);
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblID.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblID.setText("ID : No cambia");
        lblID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPlato.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        lblPlato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlato.setText("Nombre");
        lblPlato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCategoria.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        lblCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategoria.setText("Categoría");
        lblCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(647, 647, 647)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxCateg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblPlato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoria)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(lblPlato)))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
        mantenimiento objMan = new mantenimiento();
        objMan.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    //VISTA PRODUCTOS
    private void tablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductoMouseClicked
        // TODO add your handling code here:
        int fila = tablaProducto.getSelectedRow();
        lblID.setText(String.valueOf(tablaProducto.getValueAt(fila, 0)));
        lblPlato.setText(String.valueOf(tablaProducto.getValueAt(fila, 1)));
        txtPrecio.setText(String.valueOf(tablaProducto.getValueAt(fila, 2)));
        lblCategoria.setText(String.valueOf(tablaProducto.getValueAt(fila, 3)));
    }//GEN-LAST:event_tablaProductoMouseClicked

    private void cbxCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategActionPerformed
        // TODO add your handling code here:
        op = cbxCateg.getSelectedIndex();
        listar("", catg[op]); //Muestra los datos de acuerdo al indice del arreglo
    }//GEN-LAST:event_cbxCategActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        update();
        listar("", catg[op]);

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        delete();
        listar("", catg[op]);

    }//GEN-LAST:event_btnEliminarActionPerformed

    //Método listar por categoría
    public void listar(String aux, String ctg) {
        DefaultTableModel modelo = new DefaultTableModel();
        daoProd_ViewImpl daoProd = new daoProd_ViewImpl();
        ArrayList<dtoProd_View> listar = new ArrayList<>();
        if (aux.length() == 0) {
            listar = (ArrayList<dtoProd_View>) daoProd.prodCategoria(ctg);
        }
        modelo.setRowCount(listar.size());
        Iterator it = listar.iterator();
        modelo.addColumn("ID PRODUCTO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("PRECIO");
        modelo.addColumn("CATEGORÍA");
        int i = 0;
        while (it.hasNext()) {
            Object obj = it.next();
            dtoProd_View dtoProd = (dtoProd_View) obj;
            modelo.setValueAt(dtoProd.getIdProducto(), i, 0);
            modelo.setValueAt(dtoProd.getNomProd(), i, 1);
            modelo.setValueAt(dtoProd.getPrecio(), i, 2);
            modelo.setValueAt(dtoProd.getCategoría(), i, 3);
            i++;
        }
        tablaProducto.setModel(modelo); //SETEAMOS LOS DATOS EN LA TABLA
    }

    //Método Update
    public void update() {
        String id, nombre, precio, categoria;
        id = lblID.getText();
        nombre = lblPlato.getText();
        precio = txtPrecio.getText();
        categoria = lblCategoria.getText();
        //Objetos dto dao
        dtoProd_View dtoProd = new dtoProd_View();
        daoProd_View daoProd = new daoProd_ViewImpl();//Seteamos el objeto dto en el daoImplUpdate
        if ("".equals(txtPrecio.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA FILA");
        } else {
            if (precio.contains("-")) { //Comprueba que sea positivo
                JOptionPane.showMessageDialog(null, "EL PRECIO NO PUEDE SER NEGATIVO");
            } else {
                if (precio.matches("[+-]?\\d*(\\.\\d+)?")) { //Comprueba si es un numero
                    try {
                        dtoProd.setIdProducto(Integer.parseInt(id));
                        dtoProd.setNomProd(nombre); //Seteamos valores en el dto
                        dtoProd.setPrecio(Double.parseDouble(precio));
                        dtoProd.setCategoría(categoria);
                        daoProd.productoUpd(dtoProd);
                        JOptionPane.showMessageDialog(null, "FILA ACTUALIZADA");
                        //RESETEAMOS VALORES
                        lblID.setText("No cambia");
                        lblPlato.setText("Nombre");
                        txtPrecio.setText("");
                        lblCategoria.setText("Categoría");
                        txtPrecio.requestFocus();
                    } catch (HeadlessException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage() + " : VERIFIQUE LA BD");
                        JOptionPane.showMessageDialog(null, daoProd.getMensaje());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "EL PRECIO DEBE SER UN NUMERO");
                }
            }
        }
    }

    //Método Delete
    public void delete() {
        String id;
        id = lblID.getText();
        daoProd_View daoProd = new daoProd_ViewImpl();
        List<Integer> list = new ArrayList<>();
        if ("".equals(txtPrecio.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA FILA");
        } else {
            try {
                int op = JOptionPane.showOptionDialog(null, "¿ESTA SEGURO DE ELIMINAR ESTE REGISTRO?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                switch (op) {
                    case 0:
                        list.add(Integer.parseInt(id));
                        daoProd.productoDel(list);
                        JOptionPane.showMessageDialog(null, "FILA ELIMINADA");
                        //RESETEAMOS VALORES
                        lblID.setText("ID : No cambia");
                        lblPlato.setText("Nombre");
                        txtPrecio.setText("");
                        lblCategoria.setText("Categoría");
                        txtPrecio.requestFocus();
                        break;
                    case 1:
//                        JOptionPane.showMessageDialog(null, "");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "OPCION NO REGISTRADA");
                        break;
                }

            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + " : VERIFIQUE LA BD");
                JOptionPane.showMessageDialog(null, daoProd.getMensaje());
            }
        }
    }

    //Main
    public static void main(String args[]) {
        manCartaPrecios objCP = new manCartaPrecios();
        objCP.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxCateg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblPlato;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
