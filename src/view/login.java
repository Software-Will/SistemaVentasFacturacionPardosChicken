package view;

import dao.impl.daoAdministradorImpl;
import dto.dtoAdministrador;
import java.awt.Color;
import javax.swing.*;
import metodos.TextPrompt;

public class login extends javax.swing.JFrame {

    //Constructor
    public login() {
        initComponents();
        this.setTitle("Inicio de Sesión - Pardos Chicken"); //Nombre de ventana
        setIconImage(new ImageIcon(getClass().getResource("/img/iconPardos.png")).getImage()); //cambiar el icono de la ventana
        setLocationRelativeTo(null); //centro de la pantalla
        setResizable(false); //No redimenzionable
        this.getContentPane().setBackground(Color.white);
        //Metodo para placeholder -> metodos/TextPromptClass
        TextPrompt placeholder1 = new TextPrompt("          username", txtUserName);
        TextPrompt placeholder2 = new TextPrompt("                                          **********", txtPassword);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setIconImages(null);

        txtUserName.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        txtUserName.setForeground(java.awt.Color.black);
        txtUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtPassword.setForeground(java.awt.Color.black);
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnIngresar.setBackground(new java.awt.Color(0, 102, 153));
        btnIngresar.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btnIngresar.setForeground(java.awt.Color.white);
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(153, 51, 0));
        btnSalir.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btnSalir.setForeground(java.awt.Color.white);
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inicio de Sesión");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoPardosLogin.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton Salir
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    //Boton Ingresar -> Validaremos los datos
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        validar();
    }//GEN-LAST:event_btnIngresarActionPerformed

    //Metodo adminName
    public String adminName() {
        return txtUserName.getText().trim();
    }

    //Metodo validar
    public void validar() {
        //Objetos
        login objLogin = new login();
        menuPrincipal objMenuPrincipal = new menuPrincipal();
        dtoAdministrador dtoAdmin;
        daoAdministradorImpl daoAdmin = new daoAdministradorImpl();
        //Capturamos datos
        String username = txtUserName.getText();
        String contraseña = txtPassword.getText();
        if (txtUserName.getText().equals("") || txtPassword.getText().equals("")) { //If para requerir datos
            JOptionPane.showMessageDialog(null, "DATOS REQUERIDOS");
            txtUserName.requestFocus(); //Vuelve el mouse
        } else {
            dtoAdmin = daoAdmin.validarAdministrador(username, contraseña); //Enviamos los datos hacia el dto
            if (dtoAdmin.getUsername() != null && dtoAdmin.getContraseña() != null) { //If para validar datos de la bd
                JOptionPane.showMessageDialog(null, "BIENVENIDO ADMIN @" + username.toUpperCase());
                objMenuPrincipal.setVisible(true); //Abre la ventana del menu principal
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN USUARIO VALIDO");
                txtUserName.setText("");
                txtPassword.setText("");
                txtUserName.requestFocus();
            }
        }
    }

    //Main
    public static void main(String args[]) {
        //Objeto
        login objLogin = new login();
        //Activamos manualmente la ventana
        objLogin.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
