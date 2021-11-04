package test;

import dao.daoProd_View;
import dao.impl.daoProd_ViewImpl;
import dto.dtoProd_View;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class testDaoProd_View {
    //Metodos estaticos para muestreos y CRUD

    public static void testProductoSEL() {
        //Objs para acceso de datos
        daoProd_View dP = new daoProd_ViewImpl();
        List<dtoProd_View> lista = null; //lista de datos

        //Excepcion para comprobar la funcion administradorSel -> muestra los datos de la bd
        try {
            lista = dP.productoSel();
            lista.forEach(t -> { //Objeto lambda:foreach para mostrar toda la tabla
                System.out.println(String.format("ID: %s Nombre: %s Precio: %s Categoría: %s ",
                        t.getIdProducto(), t.getNomProd(), t.getPrecio(), t.getCategoría()));
            });
        } catch (Exception e) {
            dP.getMensaje();
        }

    }

    public static void testProductoCat(String cat) {
        //Objs para acceso de datos
        daoProd_ViewImpl dP = new daoProd_ViewImpl();
        List<dtoProd_View> lista = null; //lista de datos

        //Excepcion para comprobar la funcion administradorSel -> muestra los datos de la bd
        try {
            lista = dP.prodCategoria(cat);
            lista.forEach(t -> { //Objeto lambda:foreach para mostrar toda la tabla
                System.out.println(String.format("ID: %s Nombre: %s Precio: %s Categoría: %s ",
                        t.getIdProducto(), t.getNomProd(), t.getPrecio(), t.getCategoría()));
            });
        } catch (Exception e) {
            dP.getMensaje();
        }

    }

    public static void testProductoGET(int id) {
        daoProd_View dP = new daoProd_ViewImpl();
        dtoProd_View prod = null;
        try {
            prod = dP.productoGet(id);
            System.out.println(String.format("ID: %s Nombre: %s Precio: %s Categoría: %s ",
                    prod.getIdProducto(), prod.getNomProd(), prod.getPrecio(), prod.getCategoría()));
        } catch (Exception e) {
            dP.getMensaje();
        }

    }

//    public static void testProductoINS(String nombre, String telefono, String mail, String username, String password) {
//        daoProducto dP = new daoProductoImpl();
//        dtoProducto admin = new dtoProducto();
//        //Asignamos nuevos datos
//        admin.setNombre(nombre);
//        admin.setTelefono(telefono);
//        admin.setMail(mail);
//        admin.setUsername(username);
//        admin.setContraseña(password);
//        try {
//            dP.administradorIns(admin);//Se ejecuta el metodo del dao insert
//            System.out.println("Fila agregada");
//        } catch (Exception e) {
//            dP.getMensaje();
//        }
//    }
//
    public static void testProductoUPD(Double precioUpd, Integer idProdUpd) {
        daoProd_View dP = new daoProd_ViewImpl();
        dtoProd_View prod = new dtoProd_View();
        prod.setPrecio(precioUpd);
        prod.setIdProducto(idProdUpd);
        try {
            dP.productoUpd(prod);
            System.out.println("Fila " + idProdUpd + " actualizada");
        } catch (Exception e) {
            dP.getMensaje();
        }
    }
//

    public static void testProductoDEL(Integer idDel) {
        daoProd_View dP = new daoProd_ViewImpl();
        List<Integer> list = new ArrayList<>();
        list.add(idDel);
        try {
            dP.productoDel(list);
            System.out.println("Fila eliminada");
        } catch (Exception e) {
            dP.getMensaje();
        }
    }

    public static void testMain() {
        //Declarar - leer
        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite el test a realizar: "
                + "\n1. Mostrar la tabla"
                + "\n2. Mostra producto segun categoria"
                + "\n3. Mostra fila segun id"
                + "\n4. Insertar un nuevo administrador"
                + "\n5. Actualizar un administrador"
                + "\n6. Eliminar un administrador"
                + "\n7. Salir"));
        //Estructura switch para op
        switch (op) {
            case 1:
                JOptionPane.showMessageDialog(null, "Mostrar tabla Producto");
                testProductoSEL();
                testMain();
                break;
            case 2:
                String cat = JOptionPane.showInputDialog("Ingrese la categoria");
                testProductoCat(cat);
                testMain();
                break;
            case 3:
                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID"));
                testProductoGET(id);
                testMain();
                break;
//            case 4:
//                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del nuevo admin");
//                String telefono = JOptionPane.showInputDialog("Ingrese el telefono del nuevo admin");
//                String mail = JOptionPane.showInputDialog("Ingrese el mail del nuevo admin");
//                String username = JOptionPane.showInputDialog("Ingrese el username del nuevo admin");
//                String password = JOptionPane.showInputDialog("Ingrese el password del nuevo admin");
//                testProductoINS(nombre, telefono, mail, username, password);
//                System.out.println("Actualizacion");
//                testProductoSEL();
//                testMain();
//                break;
            case 5:
                System.out.println("Tabla Actual");
                testProductoSEL();
                int idProdUpd = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del producto a actualizar"));
                double precioUpd = Double.parseDouble(JOptionPane.showInputDialog("Actualice el precio del producto #" + idProdUpd));
                testProductoUPD(precioUpd, idProdUpd);
                System.out.println("\nTabla actualizada");
                testProductoSEL();
                testMain();
                break;
            case 6:
                System.out.println("Tabla Actual");
                testProductoSEL();
                int idDel = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del producto a eliminar"));
                testProductoDEL(idDel);
                System.out.println("\nTabla actualizada");
                testProductoSEL();
                testMain();
                break;
            case 7:
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
