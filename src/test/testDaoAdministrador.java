package test;

import dao.daoAdministrador;
import dao.impl.daoAdministradorImpl;
import dto.dtoAdministrador;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class testDaoAdministrador {
    //Metodos estaticos para muestreos y CRUD

    public static void testAdministradorSEL() {
        //Objs para acceso de datos
        daoAdministrador dA = new daoAdministradorImpl();
        List<dtoAdministrador> lista = null; //lista de datos

        //Excepcion para comprobar la funcion administradorSel -> muestra los datos de la bd
        try {
            lista = dA.administradorSel();
            lista.forEach(t -> { //Objeto lambda:foreach para mostrar toda la tabla
                System.out.println(String.format("ID: %s Nombre: %s Telefono: %s Mail: %s UserName: %s Password: %s",
                        t.getIdAdministrador(), t.getNombre(), t.getTelefono(), t.getMail(), t.getUsername(), t.getContraseña()));
            });
        } catch (Exception e) {
            dA.getMensaje();
        }

    }

    public static void testAdministradorGET(int id) {
        daoAdministrador dA = new daoAdministradorImpl();
        dtoAdministrador admin = null;
        try {
            admin = dA.administradorGet(id);
            System.out.println(String.format("ID: %s Nombre: %s Telefono: %s Mail: %s UserName: %s Password: %s",
                    admin.getIdAdministrador(), admin.getNombre(), admin.getTelefono(), admin.getMail(), admin.getUsername(), admin.getContraseña()));
        } catch (Exception e) {
            dA.getMensaje();
        }

    }

    public static void testAdministradorINS(String nombre, String telefono, String mail, String username, String password) {
        daoAdministrador dA = new daoAdministradorImpl();
        dtoAdministrador admin = new dtoAdministrador();
        //Asignamos nuevos datos
        admin.setNombre(nombre);
        admin.setTelefono(telefono);
        admin.setMail(mail);
        admin.setUsername(username);
        admin.setContraseña(password);
        try {
            dA.administradorIns(admin);//Se ejecuta el metodo del dao insert
            System.out.println("Fila agregada");
        } catch (Exception e) {
            dA.getMensaje();
        }
    }

    public static void testAdminitradorUPD(String nombreUpd, String telefonoUpd, String mailUpd, String usernameUpd, String passwordUpd, Integer idUpd) {
        daoAdministrador dA = new daoAdministradorImpl();
        dtoAdministrador admin = new dtoAdministrador();
        admin.setNombre(nombreUpd);
        admin.setTelefono(telefonoUpd);
        admin.setMail(mailUpd);
        admin.setUsername(usernameUpd);
        admin.setContraseña(nombreUpd);
        admin.setIdAdministrador(idUpd);
        try {
            dA.administradorUpd(admin);
            System.out.println("Fila " + idUpd + " actualizada");
        } catch (Exception e) {
            dA.getMensaje();
        }
    }

    public static void testAdministradorDEL(Integer idDel) {
        daoAdministrador dA = new daoAdministradorImpl();
        List<Integer> list = new ArrayList<>();
        list.add(idDel);
        try {
            dA.administradorDel(list);
            System.out.println("Fila eliminada");
        } catch (Exception e) {
            dA.getMensaje();
        }
    }

    public static void testMain() {
        //Declarar - leer
        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite el test a realizar: \n1. Mostrar la tabla"
                + "\n2. Mostra fila segun id"
                + "\n3. Insertar un nuevo administrador"
                + "\n4. Actualizar un administrador"
                + "\n5. Eliminar un administrador"
                + "\n6. Salir"));
        //Estructura switch para op
        switch (op) {
            case 1:
                JOptionPane.showMessageDialog(null, "Mostrar tabla Administrador");
                testAdministradorSEL();
                testMain();
                break;
            case 2:
                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID"));
                testAdministradorGET(id);
                testMain();
                break;
            case 3:
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del nuevo admin");
                String telefono = JOptionPane.showInputDialog("Ingrese el telefono del nuevo admin");
                String mail = JOptionPane.showInputDialog("Ingrese el mail del nuevo admin");
                String username = JOptionPane.showInputDialog("Ingrese el username del nuevo admin");
                String password = JOptionPane.showInputDialog("Ingrese el password del nuevo admin");
                testAdministradorINS(nombre, telefono, mail, username, password);
                System.out.println("Actualizacion");
                testAdministradorSEL();
                testMain();
                break;
            case 4:
                System.out.println("Tabla Actual");
                testAdministradorSEL();
                int idUpd = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del admin a actualizar"));
                String nombreUpd = JOptionPane.showInputDialog("Actualice el nombre del admin #" + idUpd);
                String telefonoUpd = JOptionPane.showInputDialog("Actualice el telefono del admin #" + idUpd);
                String mailUpd = JOptionPane.showInputDialog("Actualice el mail del admin #" + idUpd);
                String usernameUpd = JOptionPane.showInputDialog("Actualice el username del admin #" + idUpd);
                String passwordUpd = JOptionPane.showInputDialog("Actualice el password del admin #" + idUpd);
                testAdminitradorUPD(nombreUpd, telefonoUpd, mailUpd, usernameUpd, passwordUpd, idUpd);
                System.out.println("\nTabla actualizada");
                testAdministradorSEL();
                testMain();
                break;
            case 5:
                System.out.println("Tabla Actual");
                testAdministradorSEL();
                int idDel = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del admin a eliminar"));
                testAdministradorDEL(idDel);
                System.out.println("\nTabla actualizada");
                testAdministradorSEL();
                testMain();
                break;
            case 6:
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
