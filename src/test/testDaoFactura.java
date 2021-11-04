package test;

import dao.daoFactura;
import dao.impl.daoFacturaImpl;
import dto.dtoFactura;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class testDaoFactura {
    //Metodos estaticos para muestreos y CRUD

    public static void testFacturaSEL() {
        //Objs para acceso de datos
        daoFactura dF = new daoFacturaImpl();
        List<dtoFactura> lista = null; //lista de datos

        //Excepcion para comprobar la funcion FacturaSel -> muestra los datos de la bd
        try {
            lista = dF.facturaSel();
            lista.forEach(t -> { //Objeto lambda:foreach para mostrar toda la tabla
                System.out.println(String.format("ID: %s Fecha: %s Nombre del Cliente: %s DNI | RUC: %s Telefono: %s Administrador: %s "
                        + "SubTotal: S/ %s IGV: S/%s Total: S/ %s Metodo de pago: %s",
                        t.getIdFactura(), t.getFecha(), t.getNombreCliente(), t.getDniRUC(), t.getTelefono(), t.getAdministrador().toUpperCase(), t.getSubtotal(),
                        t.getIgv(), t.getTotal(), t.getMetodoPago()));
            });
        } catch (Exception e) {
            dF.getMensaje();
        }

    }

    public static void testBuscarNombre(String nombre) {
        //Objs para acceso de datos
        daoFacturaImpl dF = new daoFacturaImpl();
        List<dtoFactura> lista = null; //lista de datos

        //Excepcion para comprobar la funcion
        try {
            lista = dF.buscarNombre(nombre);
            lista.forEach(t -> { //Objeto lambda:foreach para mostrar toda la tabla
                System.out.println(String.format("ID: %s Fecha: %s Nombre del Cliente: %s DNI | RUC: %s Telefono: %s Administrador: %s "
                        + "SubTotal: S/ %s IGV: S/%s Total: S/ %s Metodo de pago: %s",
                        t.getIdFactura(), t.getFecha(), t.getNombreCliente(), t.getDniRUC(), t.getTelefono(), t.getAdministrador().toUpperCase(), t.getSubtotal(),
                        t.getIgv(), t.getTotal(), t.getMetodoPago()));
            });
        } catch (Exception e) {
            dF.getMensaje();
        }

    }

    public static void testFacturaGET(int id) {
        daoFactura dF = new daoFacturaImpl();
        dtoFactura fac = null;
        try {
            fac = dF.facturaGet(id);
            System.out.println(String.format("ID: %s Fecha: %s Nombre del Cliente: %s DNI | RUC: %s Telefono: %s Administrador: %s "
                    + "SubTotal: S/ %s IGV: S/%s Total: S/ %s Metodo de pago: %s",
                    fac.getIdFactura(), fac.getFecha(), fac.getNombreCliente(), fac.getDniRUC(), fac.getTelefono(), fac.getAdministrador().toUpperCase(), fac.getSubtotal(),
                    fac.getIgv(), fac.getTotal(), fac.getMetodoPago()));
        } catch (Exception e) {
            dF.getMensaje();
        }

    }

    public static void testFacturaINS(String fecha, String nomCli, String dniRuc, String telefono, String admin, double subTotal, double igv, double total, String metodoPago) {
        daoFactura dF = new daoFacturaImpl();
        dtoFactura fac = new dtoFactura();
        //Asignamos nuevos datos
        fac.setFecha(fecha);
        fac.setNombreCliente(nomCli);
        fac.setDniRUC(dniRuc);
        fac.setTelefono(telefono);
        fac.setAdministrador(admin);
//        fac.setSubtotal(subTotal);
//        fac.setIgv(igv);
//        fac.setTotal(total);
        fac.setMetodoPago(metodoPago);
        try {
            dF.facturaIns(fac);//Se ejecuta el metodo del dao insert
            System.out.println("Fila agregada");
        } catch (Exception e) {
            dF.getMensaje();
        }

    }

    public static void testFacturaUPD(String fechaUpd, String nomCliUpd, String dniRucUpd, String telefonoUpd, String adminUpd, double subTotalUpd, double igvUpd, double totalUpd, String metodoPagoUpd, int idUpd) {
        daoFactura dF = new daoFacturaImpl();
        dtoFactura fac = new dtoFactura();
        fac.setFecha(fechaUpd);
        fac.setNombreCliente(nomCliUpd);
        fac.setDniRUC(dniRucUpd);
        fac.setTelefono(telefonoUpd);
        fac.setAdministrador(adminUpd);
        fac.setSubtotal(subTotalUpd);
        fac.setIgv(igvUpd);
        fac.setTotal(totalUpd);
        fac.setMetodoPago(metodoPagoUpd);
        fac.setIdFactura(idUpd);
        try {
            dF.facturaUpd(fac);
            System.out.println("Fila " + idUpd + " actualizada");
        } catch (Exception e) {
            dF.getMensaje();
        }
    }

    public static void testFacturaDEL(Integer idDel) {
        daoFactura dF = new daoFacturaImpl();
        List<Integer> list = new ArrayList<>();
        list.add(idDel);
        try {
            dF.facturaDel(list);
            System.out.println("Fila eliminada");
        } catch (Exception e) {
            dF.getMensaje();
        }
    }

    public static void testUltimoID() {
        daoFacturaImpl dFI = new daoFacturaImpl();
        dtoFactura fac = new dtoFactura();
        try {
            fac = dFI.ultimoID();
            int ultimoID = fac.getIdFactura();
            JOptionPane.showMessageDialog(null, ultimoID);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void testMain() {
        //Declarar - leer
        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite el test a realizar: \n1. Mostrar la tabla"
                + "\n2. Busque por nombre"
                + "\n3. Mostra fila segun id"
                + "\n4. Insertar una nueva factura"
                + "\n5. Actualizar una factura"
                + "\n6. Eliminar una factura"
                + "\n7. Mostrar el ultimo ID"
                + "\n8. Salir"));
        //Estructura switch para op
        switch (op) {
            case 1:
                JOptionPane.showMessageDialog(null, "Mostrar tabla Factura");
                testFacturaSEL();
                testMain();
                break;
            case 2:
                String nom = JOptionPane.showInputDialog("Ingrese el nombre a buscar");
                testBuscarNombre(nom);
                testMain();
                break;
            case 3:
                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID"));
                testFacturaGET(id);
                testMain();
                break;
            case 4:
                String fecha = JOptionPane.showInputDialog("Ingrese la fecha en formato (AA-MM-DD)");
                String nomCli = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
                String dniRuc = JOptionPane.showInputDialog("Ingrese el DNI o RUC del cliente");
                String telefono = JOptionPane.showInputDialog("Ingrese el telefono del cliente");
                String admin = JOptionPane.showInputDialog("Ingrese el nombre del admin");
                double subtotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el subtotal"));
                double igv = subtotal * 0.18;
                double total = subtotal + igv;
                int opp = Integer.parseInt(JOptionPane.showInputDialog("Digite el metodo de pago: \n1. Tarjeta \n2. Efectivo"));
                String metodoPago = null;
                if (opp == 1) {
                    metodoPago = "Tarjeta";
                } else if (opp == 2) {
                    metodoPago = "Efectivo";
                }
                testFacturaINS(fecha, nomCli, dniRuc, telefono, admin, subtotal, igv, total, metodoPago);
                System.out.println("Actualizacion");
                testFacturaSEL();
                testMain();
                break;
            case 5:
                System.out.println("Tabla Actual");
                testFacturaSEL();
                JOptionPane.showMessageDialog(null, "Metodo actualizar factura");
                int idUpd = Integer.parseInt(JOptionPane.showInputDialog("Digite el id de la factura a actualizar"));
                String fechaUpd = JOptionPane.showInputDialog("Ingrese la fecha en formato (AA-MM-DD)");
                String nomCliUpd = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
                String dniRucUpd = JOptionPane.showInputDialog("Ingrese el DNI o RUC del cliente");
                String telefonoUpd = JOptionPane.showInputDialog("Ingrese el telefono del cliente");
                String adminUpd = JOptionPane.showInputDialog("Ingrese el nombre del admin");
                double subtotalUpd = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el subtotal"));
                double igvUpd = subtotalUpd * 0.18;
                double totalUpd = subtotalUpd + igvUpd;
                int oopp = Integer.parseInt(JOptionPane.showInputDialog("Digite el metodo de pago: \n1. Tarjeta \n2. Efectivo"));
                String metodoPagoUpd = null;
                if (oopp == 1) {
                    metodoPagoUpd = "Tarjeta";
                } else if (oopp == 2) {
                    metodoPagoUpd = "Efectivo";
                }
                testFacturaUPD(fechaUpd, nomCliUpd, dniRucUpd, telefonoUpd, adminUpd, subtotalUpd, igvUpd, totalUpd, metodoPagoUpd, idUpd);
                System.out.println("\nTabla actualizada");
                testFacturaSEL();
                testMain();
                break;
            case 6:
                System.out.println("Tabla Actual");
                testFacturaSEL();
                int idDel = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del admin a eliminar"));
                testFacturaDEL(idDel);
                System.out.println("\nTabla actualizada");
                testFacturaSEL();
                testMain();
                break;
            case 7:
                testUltimoID();
                break;
            case 8:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no registrada - Intentelo de nuevo");
                testMain();
        }

    }

    //Main
    public static void main(String[] args) {
        testMain();
    }
}
