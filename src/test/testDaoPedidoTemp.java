package test;

import dao.impl.daoFacturaTempImpl;
import dto.dtoFacturaTemp;
import javax.swing.JOptionPane;
import dao.daoFacturaTemp;

public class testDaoPedidoTemp {

    public static void pedidoTempINS(String nomCli, String dniRuc, String telefono, String admin, String metodoPago, String nombreProducto, Integer cantidad, Double precioProducto,
            Double montoProducto, Double subtotal, Double igv, Double total) {
        daoFacturaTemp dPT = new daoFacturaTempImpl();
        dtoFacturaTemp pedTemp = new dtoFacturaTemp();
        //Asignamos nuevos dato
        pedTemp.setNombreCliente(nomCli);
        pedTemp.setDniRuc(dniRuc);
        pedTemp.setTelefono(telefono);
        pedTemp.setAdministrador(admin);
        pedTemp.setMetodoPago(metodoPago);
        pedTemp.setNombreProducto(nombreProducto);
        pedTemp.setCantidad(cantidad);
        pedTemp.setPrecioProducto(precioProducto);
        pedTemp.setMontoProducto(montoProducto);
        pedTemp.setSubtotal(subtotal);
        pedTemp.setIgv(igv);
        pedTemp.setTotal(total);
        try {
            dPT.pedidoIns(pedTemp);
            System.out.println("Fila agregada");
        } catch (Exception e) {
            dPT.getMensaje();
        }
    }

    public static void pedidoTempTRUNCATE() {
        daoFacturaTemp dPT = new daoFacturaTempImpl();
        try {
            dPT.truncateTable();
            System.out.println("Tabla truncada");
        } catch (Exception e) {
            dPT.getMensaje();
        }
    }

    public static void test() {
        int op = Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE\n1. INSERTAR \n2. LIMPIAR TABLA TEMPORAL"));
        switch (op) {
            case 1:
                JOptionPane.showMessageDialog(null, "INSERTAR DATOS");
                String nomCli = JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL CLIENTE");
                String dniRuc = JOptionPane.showInputDialog("INGRESE EL DNI | RUC");
                String telefono = JOptionPane.showInputDialog("INGRESE EL TELEFONO");
                String admin = JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL ADMIN");
                String metodoPago = JOptionPane.showInputDialog("INGRESE EL METODO DE PAGO");
                String nombreProducto = JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL PRODUCTO");
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DEL PRODUCTO"));
                double precioProducto = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL PRECIO DEL PRODUCTO"));
                double montoProducto = cantidad * precioProducto;
                double subtotal = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL SUBTOTAL"));
                double igv = subtotal * 0.18;
                double total = subtotal + igv;
                pedidoTempINS(nomCli, dniRuc, telefono, admin, metodoPago, nombreProducto, cantidad, precioProducto, montoProducto, subtotal, igv, total);
                break;
            case 2:
                pedidoTempTRUNCATE();
                break;
            default:
        }
    }

    public static void main(String[] args) {
        test();
    }

}
