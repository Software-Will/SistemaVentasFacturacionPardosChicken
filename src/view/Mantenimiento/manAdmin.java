package view.Mantenimiento;

import dao.daoAdministrador;
import dao.impl.daoAdministradorImpl;
import dto.dtoAdministrador;
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

public class manAdmin extends javax.swing.JFrame {

    //Constructor
    public manAdmin() {
        initComponents();
        this.setTitle("Mantenimiento Administrador - Pardos Chicken"); //Nombre de ventana
        setIconImage(new ImageIcon(getClass().getResource("/img/iconPardos.png")).getImage()); //cambiar el icono de la ventana
        setLocationRelativeTo(null); //centro de la pantalla
        this.getContentPane().setBackground(Color.white); //color ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//al cerrar la ventana, se dejara de ejecutar en 2do plano
        setResizable(false); //No redimenzionable
        setDefaultCloseOperation(0); //Deshabilitar la funcion de close (X)
        TextPrompt placeholder1 = new TextPrompt("         Nombre", txtNombreAdmin);
        TextPrompt placeholder2 = new TextPrompt("        Telefono", txtTelefono);
        TextPrompt placeholder3 = new TextPrompt("         Email", txtMail);
        listar(""); //Listamos los valores en la tabla
        txtNombreAdmin.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAdmin = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        lblIDAdmin = new javax.swing.JLabel();
        txtNombreAdmin = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        lblrandom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconAdmin.png"))); // NOI18N

        tablaAdmin.setBackground(new java.awt.Color(255, 255, 255));
        tablaAdmin.setForeground(new java.awt.Color(0, 0, 0));
        tablaAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ADMIN", "NOMBRE", "TELEFONO", "EMAIL"
            }
        ));
        tablaAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAdmin);

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

        lblIDAdmin.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        lblIDAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIDAdmin.setText("ID : No cambia");
        lblIDAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNombreAdmin.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        txtNombreAdmin.setForeground(java.awt.Color.black);
        txtNombreAdmin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtTelefono.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        txtTelefono.setForeground(java.awt.Color.black);
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtMail.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        txtMail.setForeground(java.awt.Color.black);
        txtMail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblrandom.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        lblrandom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblrandom.setText("(*) Si presenta problemas de acceso, comuniquese con los desarrolladores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblrandom, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIDAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(txtNombreAdmin))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIDAdmin))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrandom))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
        mantenimiento objMan = new mantenimiento();
        objMan.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    //TABLA ADMINISTRADORES
    private void tablaAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAdminMouseClicked
        int fila = tablaAdmin.getSelectedRow();
        lblIDAdmin.setText(String.valueOf(tablaAdmin.getValueAt(fila, 0)));
        txtNombreAdmin.setText(String.valueOf(tablaAdmin.getValueAt(fila, 1)));
        txtTelefono.setText(String.valueOf(tablaAdmin.getValueAt(fila, 2)));
        txtMail.setText(String.valueOf(tablaAdmin.getValueAt(fila, 3)));
    }//GEN-LAST:event_tablaAdminMouseClicked

    //btn actualizar
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        update();
        listar("");
    }//GEN-LAST:event_btnActualizarActionPerformed

    //btn eliminar
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        delete();
        listar("");
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Limitante de caracteres
    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (txtTelefono.getText().length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    //Metodo listar -> SEL/GET: daoImpl
    public void listar(String aux) {
        DefaultTableModel modelo = new DefaultTableModel();
        daoAdministrador daoAdmin = new daoAdministradorImpl();
        ArrayList<dtoAdministrador> listar = new ArrayList<>();
        if (aux.length() == 0) {
            listar = (ArrayList<dtoAdministrador>) daoAdmin.administradorSel();
        }
        modelo.setRowCount(listar.size());
        Iterator it = listar.iterator();
        modelo.addColumn("ID ADMIN");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("EMAIL");
        int i = 0;
        while (it.hasNext()) {
            Object obj = it.next();
            dtoAdministrador dtoAdmin = (dtoAdministrador) obj;
            modelo.setValueAt(dtoAdmin.getIdAdministrador(), i, 0);
            modelo.setValueAt(dtoAdmin.getNombre(), i, 1);
            modelo.setValueAt(dtoAdmin.getTelefono(), i, 2);
            modelo.setValueAt(dtoAdmin.getMail(), i, 3);
            i++;
        }
        tablaAdmin.setModel(modelo); //SETEAMOS LOS DATOS EN LA TABLA
    }

    //Metodo Actualizar -> UPD : daoImpl
    public void update() {
        String id, nombre, telefono, email;
        id = lblIDAdmin.getText();
        nombre = txtNombreAdmin.getText();
        telefono = txtTelefono.getText();
        email = txtMail.getText();
        //Objetos dto dao
        dtoAdministrador dtoAdmin = new dtoAdministrador();
        daoAdministrador daoAdmin = new daoAdministradorImpl();//Seteamos el objeto dto en el daoImplUpdate
        if ("".equals(txtNombreAdmin.getText()) || "".equals(txtTelefono.getText()) || "".equals(txtMail.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA FILA");
        } else {
            if (telefono.contains("-") || telefono.contains("+")) {
                JOptionPane.showMessageDialog(null, "UN NUMERO NO PUEDE CONTENER SIGNOS");
            } else {
                if (telefono.matches("[+-]?\\d*(\\.\\d+)?")) {
                    try {
                        dtoAdmin.setIdAdministrador(Integer.parseInt(id));
                        dtoAdmin.setNombre(nombre); //Seteamos valores en el dto
                        dtoAdmin.setTelefono(telefono);
                        dtoAdmin.setMail(email);
                        daoAdmin.administradorUpd(dtoAdmin);
                        JOptionPane.showMessageDialog(null, "FILA ACTUALIZADA");
                        //RESETEAMOS VALORES
                        lblIDAdmin.setText("ID : No cambia");
                        txtNombreAdmin.setText("");
                        txtTelefono.setText("");
                        txtMail.setText("");
                        txtNombreAdmin.requestFocus();
                    } catch (HeadlessException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage() + " : VERIFIQUE LA BD");
                        JOptionPane.showMessageDialog(null, daoAdmin.getMensaje());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "NUMERO TELEFONICO INVALIDO");
                }

            }
        }
    }

    //Metodo Eliminar -> DEL : daoImpl
    public void delete() {
        String id;
        id = lblIDAdmin.getText();
        daoAdministrador daoAdmin = new daoAdministradorImpl();
        List<Integer> list = new ArrayList<>();
        if ("".equals(txtNombreAdmin.getText()) || "".equals(txtMail.getText()) || "".equals(txtTelefono.getText())) {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA FILA");
        } else {
            try {
                int op = JOptionPane.showOptionDialog(null, "¿ESTA SEGURO DE ELIMINAR ESTE REGISTRO?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                switch (op) {
                    case 0:
                        list.add(Integer.parseInt(id));
                        daoAdmin.administradorDel(list);
                        JOptionPane.showMessageDialog(null, "FILA ELIMINADA");
                        //RESETEAMOS VALORES
                        lblIDAdmin.setText("ID : No cambia");
                        txtNombreAdmin.setText("");
                        txtTelefono.setText("");
                        txtMail.setText("");
                        txtNombreAdmin.requestFocus();
                        break;
                    case 1:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "OPCION NO REGISTRADA");
                        break;
                }
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + " : VERIFIQUE LA BD");
                JOptionPane.showMessageDialog(null, daoAdmin.getMensaje());
            }
        }
    }
    //Main

    public static void main(String args[]) {
        manAdmin objMA = new manAdmin();
        objMA.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIDAdmin;
    private javax.swing.JLabel lblrandom;
    private javax.swing.JTable tablaAdmin;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombreAdmin;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
