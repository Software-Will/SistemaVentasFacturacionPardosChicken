package view;

import dao.daoAdministrador;
import dao.impl.daoAdministradorImpl;
import dto.dtoAdministrador;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import metodos.TextPrompt;

public class registrarAdmin extends javax.swing.JFrame {

    //Constructor
    public registrarAdmin() {
        initComponents();
        this.setTitle("Registrar Administrador - Pardos Chicken"); //Nombre de ventana
        setIconImage(new ImageIcon(getClass().getResource("/img/iconPardos.png")).getImage()); //cambiar el icono de la ventana
        setLocationRelativeTo(null); //centro de la pantalla
        this.getContentPane().setBackground(Color.white); //color ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//al cerrar la ventana, se dejara de ejecutar en 2do plano
        //Metodo para placeholder -> metodos/TextPromptClass
        TextPrompt placeholder1 = new TextPrompt("      Nombre Admin", txtNomAdmin);
        TextPrompt placeholder2 = new TextPrompt("         Email", txtMailAdmin);
        TextPrompt placeholder3 = new TextPrompt("       Telefono", txtTelfAdmin);
        TextPrompt placeholder4 = new TextPrompt("         UserAdmin", txtUserAdmin);
//        TextPrompt placeholder5 = new TextPrompt("         Password", txtPassAdmin);
        TextPrompt placeholder6 = new TextPrompt("                      **********", txtPassword);
        setResizable(false); //No redimenzionable
        setDefaultCloseOperation(0); //Deshabilitar la funcion de close (X)

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtNomAdmin = new javax.swing.JTextField();
        txtMailAdmin = new javax.swing.JTextField();
        txtTelfAdmin = new javax.swing.JTextField();
        txtUserAdmin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconAdmin.png"))); // NOI18N

        btnRegistrar.setBackground(new java.awt.Color(0, 153, 204));
        btnRegistrar.setFont(new java.awt.Font("JetBrains Mono", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

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

        txtNomAdmin.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        txtNomAdmin.setForeground(java.awt.Color.black);
        txtNomAdmin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtMailAdmin.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        txtMailAdmin.setForeground(java.awt.Color.black);
        txtMailAdmin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMailAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtTelfAdmin.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        txtTelfAdmin.setForeground(java.awt.Color.black);
        txtTelfAdmin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelfAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtTelfAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelfAdminKeyTyped(evt);
            }
        });

        txtUserAdmin.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        txtUserAdmin.setForeground(java.awt.Color.black);
        txtUserAdmin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel2.setText("Registrar Administrador");

        txtPassword.setForeground(java.awt.Color.black);
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNomAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(txtMailAdmin)
                    .addComponent(txtTelfAdmin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUserAdmin)
                    .addComponent(txtPassword))
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelfAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMailAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton salir
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
        menuPrincipal objMP = new menuPrincipal();
        objMP.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    //Btn registrar
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrarAdmin();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    //Limitante de caracteres
    private void txtTelfAdminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelfAdminKeyTyped
        if (txtTelfAdmin.getText().length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelfAdminKeyTyped

    //Funcion registrarAdmin -> CRUD: INS
    public void registrarAdmin() {
        //Objetos
        dtoAdministrador dtoAdmin = new dtoAdministrador();
        daoAdministrador daoAdmin = new daoAdministradorImpl();
        //Capturamos valores
        String nombre = txtNomAdmin.getText();
        String email = txtMailAdmin.getText();
        String telefono = txtTelfAdmin.getText();
        String userAdmin = txtUserAdmin.getText();
        String password = txtPassword.getText();
        //If anidado para requerir datos e insertar datos
        if (txtNomAdmin.getText().equals("") || txtMailAdmin.getText().equals("") || txtTelfAdmin.getText().equals("")
                || txtUserAdmin.getText().equals("") || txtPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "SE REQUIERE QUE INGRESE TODOS LOS DATOS");
            txtNomAdmin.requestFocus(); //Por default vuelve el cursor
        } else {
            if (telefono.contains("-") || telefono.contains("+")) {
                JOptionPane.showMessageDialog(null, "UN NUMERO NO PUEDE CONTENER SIGNOS");
            } else {
                if (telefono.matches("[+-]?\\d*(\\.\\d+)?")) {
                    try {
                        //Seteamos los datos en el dto
                        dtoAdmin.setNombre(nombre);
                        dtoAdmin.setMail(email);
                        dtoAdmin.setTelefono(telefono);
                        dtoAdmin.setUsername(userAdmin);
                        dtoAdmin.setContraseña(password);
                        //Llamado de la funcion
                        daoAdmin.administradorIns(dtoAdmin); //Enviamos el objeto dtoAdmin con todos los datos seteados para su ejecucion en el dao IMPL
                        JOptionPane.showMessageDialog(null, "ADMINISTRADOR REGISTRADO");
                        //RESETEAMOS VALORES
                        txtNomAdmin.setText("");
                        txtMailAdmin.setText("");
                        txtTelfAdmin.setText("");
                        txtUserAdmin.setText("");
                        txtPassword.setText("");
                        txtNomAdmin.requestFocus();
                    } catch (HeadlessException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage() + ": VERIFIQUE LA BASE DE DATOS");
                        daoAdmin.getMensaje();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "NUMERO TELEFONICO INVALIDO");
                }
            }
        }
    }

    //Main
    public static void main(String args[]) {
        registrarAdmin objRA = new registrarAdmin();
        objRA.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtMailAdmin;
    private javax.swing.JTextField txtNomAdmin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelfAdmin;
    private javax.swing.JTextField txtUserAdmin;
    // End of variables declaration//GEN-END:variables
}
