package view;

import dao.impl.daoDetalleFacturaImpl;
import dto.dtoDetalleFactura;
import dto.dtoFactura;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class detalleFactura extends javax.swing.JFrame {

    //Constructor
    public detalleFactura(int idFactura) {
        initComponents();
        this.setTitle("Detalle Factura - Pardos Chicken"); //Nombre de ventana
        setIconImage(new ImageIcon(getClass().getResource("/img/iconPardos.png")).getImage()); //cambiar el icono de la ventana
        setLocationRelativeTo(null); //centro de la pantalla
        this.getContentPane().setBackground(Color.white); //color ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//al cerrar la ventana, se dejara de ejecutar en 2do plano
        setResizable(false); //No redimenzionable
        //Metodo para placeholder -> metodos/TextPromptClass
        setDefaultCloseOperation(0);
        listar("", idFactura);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalleFactura = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        tablaDetalleFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE PRODUCTO", "CANTIDAD", "PRECIO ", "MONTO"
            }
        ));
        jScrollPane1.setViewportView(tablaDetalleFactura);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton Salir
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    //Listar
    public void listar(String aux, int idFactura) {
        DefaultTableModel modelo = new DefaultTableModel();
        daoDetalleFacturaImpl daoDetFac = new daoDetalleFacturaImpl();
        ArrayList<dtoDetalleFactura> listar = new ArrayList<>();
        if (aux.length() == 0) {
            listar = (ArrayList<dtoDetalleFactura>) daoDetFac.detalleFactura(idFactura);
        }
        modelo.setRowCount(listar.size());
        Iterator it = listar.iterator();
        modelo.addColumn("NOMBRE PRODUCTO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("PRECIO");
        modelo.addColumn("MONTO");
        int i = 0;
        while (it.hasNext()) {
            Object obj = it.next();
            dtoDetalleFactura dtoDetalleFactura = (dtoDetalleFactura) obj;
            modelo.setValueAt(dtoDetalleFactura.getNomProd(), i, 0);
            modelo.setValueAt(dtoDetalleFactura.getCantidad(), i, 1);
            modelo.setValueAt("S/ " + dtoDetalleFactura.getPrecioProd(), i, 2);
            modelo.setValueAt("S/ " + dtoDetalleFactura.getMontoProd(), i, 3);

            i++;
        }
        tablaDetalleFactura.setModel(modelo); //SETEAMOS LOS DATOS EN LA TABLA
    }

    //Main
    public static void main(String args[]) {
        detalleFactura objF = new detalleFactura(0);
        objF.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDetalleFactura;
    // End of variables declaration//GEN-END:variables
}
