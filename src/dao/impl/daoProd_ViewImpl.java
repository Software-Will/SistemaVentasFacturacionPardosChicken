package dao.impl;

import dao.daoProd_View;
import dto.dtoProd_View;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.cnn;

public class daoProd_ViewImpl implements daoProd_View {

    //Atributos para validar datos
    PreparedStatement ps;
    ResultSet rs;
    private String mensaje;

    //Objetos dto - conexion bd
    dtoProd_View dtoProd = new dtoProd_View();
    cnn con = new cnn();
    Connection acceso;

    @Override
    public List<dtoProd_View> productoSel() {
        List<dtoProd_View> lista = null;
        //Construccion del query
        StringBuilder sql = new StringBuilder(); //Lo usamos para append 
        sql.append("SELECT ") //Script
                .append("idProducto,")
                .append("nomProd,")
                .append("precio,")
                .append("Categoría")
                .append(" FROM prod_view");

        //Excepcion con recursos
        try (Connection cn = con.getConnection()) { //Si la bd esta habilitada
            ps = cn.prepareStatement(sql.toString()); //Filtro de inyecciones sql -> inserta o muestra datos
            rs = ps.executeQuery(); //Ejecuta el query
            lista = new ArrayList<>(); //Inicializa la lista
            //Cargamos el resulsSet -> nos devuelve los resultados
            while (rs.next()) { //Mientras exista un siguiente registro
                dtoProd_View prod = new dtoProd_View(); //obj de trasnferencia de datos
                prod.setIdProducto(rs.getInt(1)); //Asignamos los valores a cada columba
                prod.setNomProd(rs.getString(2));
                prod.setPrecio(rs.getDouble(3));
                prod.setCategoría(rs.getString(4));
                lista.add(prod); //Agregamos los valores del objeto a la lista
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    //store procedure
    public List<dtoProd_View> prodCategoria(String cat) {
        List<dtoProd_View> lista = null;
        //Excepcion con recursos
        try (Connection cn = con.getConnection()) { //Si la bd esta habilitada
            CallableStatement cs = (CallableStatement) cn.prepareCall("{call prodCate(?)}");
            cs.setString(1, cat); //seteamos el parámetro
            int busper = cs.executeUpdate();
            rs = cs.executeQuery(); //Ejecuta el query
            lista = new ArrayList<>(); //Inicializa la lista
            //Cargamos el resulsSet -> nos devuelve los resultados
            while (rs.next()) { //Mientras exista un siguiente registro
                dtoProd_View prod = new dtoProd_View(); //obj de trasnferencia de datos
                prod.setIdProducto(rs.getInt(1)); //Asignamos los valores a cada columba
                prod.setNomProd(rs.getString(2));
                prod.setPrecio(rs.getDouble(3));
                prod.setCategoría(rs.getString(4));
                lista.add(prod); //Agregamos los valores del objeto a la lista
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    @Override
    public dtoProd_View productoGet(Integer id) {
        dtoProd_View prod = new dtoProd_View();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ") //Script
                .append("idProducto,")
                .append("nomProd,")
                .append("precio,")
                .append("Categoría")
                .append(" FROM prod_view")
                .append(" WHERE idProducto = ?");
        try (Connection cn = con.getConnection()) { //Conexion a la bd
            PreparedStatement pss = cn.prepareStatement(sql.toString());
            pss.setInt(1, id);
            ResultSet rss = pss.executeQuery();//Ejecutamos el query en la bd
            //Cargamos el resulSet mientras exista un registro
            while (rss.next()) {
                prod.setIdProducto(rss.getInt(1)); //Asignamos los valores a cada columba
                prod.setNomProd(rss.getString(2));
                prod.setPrecio(rss.getDouble(3));
                prod.setCategoría(rss.getString(4));
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return prod;
    }

    @Override
    public String productoIns(dtoProd_View prod) {
//        StringBuilder sql = new StringBuilder();
//        sql.append("INSERT INTO prod_view( ")
//                .append("nomProd,")
//                .append("precio,")
//                .append("Categoría")
//                .append(") VALUES (?,?,?)");
//        try (Connection cn = con.getConnection()) {
//            PreparedStatement pss = cn.prepareStatement(sql.toString());
//            pss.setString(1, prod.getNomProd());
//            pss.setDouble(2, prod.getPrecio());
//            pss.setString(3, prod.getCategoría());
//            pss.setInt(4, prod.getIdProducto());
//            int cfilas = pss.executeUpdate();
//            if (cfilas == 0) {
//                mensaje = "0 filas agregadas";
//            }
//        } catch (Exception e) {
//            mensaje = e.getMessage();
//        }
        return mensaje;
    }

    @Override
    public String productoUpd(dtoProd_View prod) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE prod_view SET ")
                .append("precio = ?") //Solo se permite modificar 3 de los 5 campos
                .append(" WHERE idProducto = ?");
        try (Connection cn = con.getConnection()) {
            PreparedStatement pss = cn.prepareStatement(sql.toString());
            pss.setDouble(1, prod.getPrecio());
            pss.setInt(2, prod.getIdProducto());
            int cupd = pss.executeUpdate();
            if (cupd == 0) {
                mensaje = "0 filas actualizadas";
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    @Override
    public String productoDel(List<Integer> ids) {
        StringBuilder sql = new StringBuilder(); //Objeto para el script
        sql.append("DELETE FROM producto WHERE ")//Script
                .append("idProducto = ? ");
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

    @Override
    public String getMensaje() {
        return mensaje;
    }

}
