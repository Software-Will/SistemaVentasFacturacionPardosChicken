package test;

import dao.daoDetalleFactura;
import dao.impl.daoDetalleFacturaImpl;
import dto.dtoDetalleFactura;
import java.util.List;
import javax.swing.JOptionPane;

public class testDaoDetalleFactura {

    public static void testDetalleFacturaSEL() {
        //Objs para acceso de datos
        daoDetalleFactura dDF = new daoDetalleFacturaImpl();
        List<dtoDetalleFactura> lista = null; //lista de datos

        //Excepcion para comprobar la funcion FacturaSel -> muestra los datos de la bd
        try {
            lista = dDF.detalleFacSel();
            lista.forEach(t -> { //Objeto lambda:foreach para mostrar toda la tabla
                System.out.println(String.format("ID DF: %s ID Fac: %s Nombre Producto: %s Cantidad: %s Precio Producto: S/ %s Monto Producto: S/ %s ",
                        t.getIdDetalleFactura(), t.getIdFactura(), t.getNomProd(), t.getCantidad(), t.getPrecioProd(), t.getMontoProd()));
            });
        } catch (Exception e) {
            dDF.getMensaje();
        }
    }

    public static void testDetalleFacturaGET(Integer id) {
        daoDetalleFactura dDF = new daoDetalleFacturaImpl();
        dtoDetalleFactura dFac = null;
        try {
            dFac = dDF.detalleFacGet(id);
            System.out.println(String.format("ID DF: %s ID Fac: %s Nombre Producto: %s Cantidad: %s Precio Producto: S/ %s Monto Producto: S/ %s ",
                    dFac.getIdDetalleFactura(), dFac.getIdFactura(), dFac.getNomProd(), dFac.getCantidad(), dFac.getPrecioProd(), dFac.getMontoProd()));
        } catch (Exception e) {
            dDF.getMensaje();
        }
    }

    public static void testDetalleFacturaINS(Integer idFactura, String nomProd, Integer cantidad, Double precioProd, Double montoProd) {
        daoDetalleFactura dDF = new daoDetalleFacturaImpl();
        dtoDetalleFactura dFac = new dtoDetalleFactura();
        dFac.setIdFactura(idFactura);
        dFac.setNomProd(nomProd);
        dFac.setCantidad(cantidad);
        dFac.setPrecioProd(precioProd);
        dFac.setMontoProd(montoProd);
        try {
            dDF.detalleFacIns(dFac);
            System.out.println("Fila agregada");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public static void testDetalleFacturaIDFACTURA(Integer idFactura) {
        //Objs para acceso de datos
        daoDetalleFacturaImpl dDFI = new daoDetalleFacturaImpl();
        List<dtoDetalleFactura> lista = null; //lista de datos
        //Excepcion para comprobar la funcion FacturaSel -> muestra los datos de la bd
        try {
            lista = dDFI.detalleFactura(idFactura);
            lista.forEach(t -> { //Objeto lambda:foreach para mostrar toda la tabla
                System.out.println(String.format("Nombre Producto: %s Cantidad: %s Precio Producto: S/ %s Monto Producto: S/ %s ",
                        t.getNomProd(), t.getCantidad(), t.getPrecioProd(), t.getMontoProd()));
            });
        } catch (Exception e) {
            dDFI.getMensaje();
        }
    }

    public static void test() {
        int op = Integer.parseInt(JOptionPane.showInputDialog("SELECCIONA \n1. testDetalleFacturaSEL()"
                + "\n2. testDetalleFacturaGET()"
                + "\n3. testDetalleFacturaINS()"
                + "\n4. testDetalleFacturaIDFACTURA - PARA VER EL DETALLE FACTURA DE LA FACTURA"));
        switch (op) {
            case 1:
                JOptionPane.showMessageDialog(null, "VISTA DE TABLA DETALLA FACTURA");
                testDetalleFacturaSEL();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "VISTA DE TABLA POR ID");
                int id = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL ID"));
                testDetalleFacturaGET(id);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "INSERTAR DETALLE FACTURA");
                int idFactura = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL ID DE LA FACTURA"));
                String nomProd = JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL PRODUCTO");
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD"));
                double precioProd = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL PRECIO DEL PRODUCTO"));
                double montoProd = cantidad * precioProd;
                testDetalleFacturaINS(idFactura, nomProd, cantidad, precioProd, montoProd);
                testDetalleFacturaSEL();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "DETALLE FACTURA POR ID FACTURA");
                int idFacturaForDetalle = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL ID DE LA FACTURA PARA VER SU DETALLE"));
                testDetalleFacturaIDFACTURA(idFacturaForDetalle);
                break;
            default:
                JOptionPane.showMessageDialog(null, "OPCION NO REGISTRADA");
                test();
        }

    }

    public static void main(String[] args) {
        test();
    }

}
