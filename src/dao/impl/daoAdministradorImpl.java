package dao.impl;

import dto.dtoAdministrador;
import dao.daoAdministrador;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import utils.cnn;

public class daoAdministradorImpl implements daoAdministrador {

    //Atributos para validar datos
    PreparedStatement ps;
    ResultSet rs;
    private String mensaje;

    //Objetos dto - conexion bd
    dtoAdministrador dtoAdmin = new dtoAdministrador();
    cnn con = new cnn();
    Connection acceso;

    //Metodo para validar datos - store procedure
    public dtoAdministrador validarAdministrador(String username, String contraseña) {
        try {
            acceso = con.getConnection();//Conecta a la bd
            CallableStatement cs = (CallableStatement) acceso.prepareCall("{call validarUsuario(?,?)}");
            cs.setString(1, username);
            cs.setString(2, contraseña);
            int busper = cs.executeUpdate();
            rs = cs.executeQuery(); //Ejecuta query
            while (rs.next()) { //While para buscar los datos
                dtoAdmin.setIdAdministrador(rs.getInt(1));
                dtoAdmin.setNombre(rs.getString(2));
                dtoAdmin.setTelefono(rs.getString(3));
                dtoAdmin.setMail(rs.getString(4));
                dtoAdmin.setUsername(rs.getString(5));
                dtoAdmin.setContraseña(rs.getString(6));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexion a la base de datos");
            System.out.println(e.getMessage());
        }
        return dtoAdmin;
    }

    @Override //Ver todas las filas de la tabla -> Leer
    public List<dtoAdministrador> administradorSel() { //Mostrar toda la tabla
        List<dtoAdministrador> lista = null;
        //Construccion del query
        StringBuilder sql = new StringBuilder(); //Lo usamos para append 
        sql.append("SELECT ") //Script
                .append("idAdministrador,")
                .append("nombre,")
                .append("telefono,")
                .append("mail,")
                .append("username,")
                .append("contraseña")
                .append(" FROM administrador");
        //Excepcion con recursos
        try (Connection cn = con.getConnection()) { //Si la bd esta habilitada
            ps = cn.prepareStatement(sql.toString()); //Filtro de inyecciones sql -> inserta o muestra datos
            rs = ps.executeQuery(); //Ejecuta el query
            lista = new ArrayList<>(); //Inicializa la lista
            //Cargamos el resulsSet -> nos devuelve los resultados
            while (rs.next()) { //Mientras exista un siguiente registro
                dtoAdministrador admin = new dtoAdministrador(); //obj de trasnferencia de datos
                admin.setIdAdministrador(rs.getInt(1)); //Asignamos los valores a cada columba
                admin.setNombre(rs.getString(2));
                admin.setTelefono(rs.getString(3));
                admin.setMail(rs.getString(4));
                admin.setUsername(rs.getString(5));
                admin.setContraseña(rs.getString(6));
                lista.add(admin); //Agregamos los valores del objeto a la lista
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    @Override //Ver una fila por id
    public dtoAdministrador administradorGet(Integer id) {
        dtoAdministrador admin = new dtoAdministrador();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("idAdministrador,")
                .append("nombre,")
                .append("telefono,")
                .append("mail,")
                .append("username,")
                .append("contraseña")
                .append(" FROM administrador")
                .append(" WHERE idAdministrador = ?");
        try (Connection cn = con.getConnection()) { //Conexion a la bd
            PreparedStatement pss = cn.prepareStatement(sql.toString());
            pss.setInt(1, id);
            ResultSet rss = pss.executeQuery();//Ejecutamos el query en la bd
            //Cargamos el resulSet mientras exista un registro
            while (rss.next()) {
                admin.setIdAdministrador(rss.getInt(1)); //Asignamos los valores a cada columba
                admin.setNombre(rss.getString(2));
                admin.setTelefono(rss.getString(3));
                admin.setMail(rss.getString(4));
                admin.setUsername(rss.getString(5));
                admin.setContraseña(rss.getString(6));
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return admin;
    }

    //CRUD
    @Override //Insert
    public String administradorIns(dtoAdministrador admin) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO administrador( ")
                .append("nombre,")
                .append("telefono,")
                .append("mail,")
                .append("username,")
                .append("contraseña")
                .append(") VALUES (?,?,?,?,?)");
        try (Connection cn = con.getConnection()) {
            PreparedStatement pss = cn.prepareStatement(sql.toString());
            pss.setString(1, admin.getNombre());
            pss.setString(2, admin.getTelefono());
            pss.setString(3, admin.getMail());
            pss.setString(4, admin.getUsername());
            pss.setString(5, admin.getContraseña());
            int cfilas = pss.executeUpdate();
            if (cfilas == 0) {
                mensaje = "0 filas agregadas";
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    @Override //Update
    public String administradorUpd(dtoAdministrador admin) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE administrador SET ")
                .append("nombre = ?,")
                .append("telefono = ?,")
                .append("mail = ?") //Solo se permite modificar 3 de los 5 campos
                //                .append("username = ?,")
                //                .append("contraseña = ?")
                .append(" WHERE idAdministrador = ?");
        try (Connection cn = con.getConnection()) {
            PreparedStatement pss = cn.prepareStatement(sql.toString());
            pss.setString(1, admin.getNombre());
            pss.setString(2, admin.getTelefono());
            pss.setString(3, admin.getMail());
//            pss.setString(4, admin.getUsername());
//            pss.setString(5, admin.getContraseña());
            pss.setInt(4, admin.getIdAdministrador());
            int cupd = pss.executeUpdate();
            if (cupd == 0) {
                mensaje = "0 filas actualizadas";
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    @Override //Delete
    public String administradorDel(List<Integer> ids) {
        StringBuilder sql = new StringBuilder(); //Objeto para el script
        sql.append("DELETE FROM administrador WHERE ")//Script
                .append("idAdministrador = ? ");
        try (Connection cn = con.getConnection()) {
            PreparedStatement pss = cn.prepareStatement(sql.toString());  //Filtro de inyecciones sql -> inserta o muestra datos
            cn.setAutoCommit(false); //Para deshacer todos los cambios - seteado por el programador!
            boolean ok = true;
            //Estructura for para ids
            for (int i = 0; i < ids.size(); i++) {
                pss.setInt(1, ids.get(i)); //Seteamos el id
                int ctos = pss.executeUpdate(); //Ejercuta script - cambios
                if (ctos == 0) {
                    ok = false;
                    mensaje = "0 filas eliminadas";
                }
                if (ok) {
                    cn.commit(); //Mantiene los cambios
                } else {
                    cn.rollback(); //Deshace los cambios
                }
            }//Fin for
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    @Override //Mensajes de error
    public String getMensaje() { //Retorno del mensaje
        return mensaje;
    }

}
