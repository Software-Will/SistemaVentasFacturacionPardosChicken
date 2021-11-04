package dao.impl;

import dao.daoFactura;
import dto.dtoFactura;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.cnn;

public class daoFacturaImpl implements daoFactura {

    //Atributos para validar datos
    PreparedStatement ps;
    ResultSet rs;
    private String mensaje;

    //Objetos dto - conexion bd
    dtoFactura dtoFac = new dtoFactura();
    cnn con = new cnn();

    //Metodo para buscar por nombre -- store procedure
    public List<dtoFactura> buscarNombre(String nombre) {
        List<dtoFactura> lista = null;
        //Excepcion con recursos
        try (Connection cn = con.getConnection()) { //Si la bd esta habilitada
            CallableStatement cs = (CallableStatement) cn.prepareCall("{call buscarCliente(?)}"); //llamamos el procedimiento
            cs.setString(1, nombre); //seteamos el parámetro
            int busper = cs.executeUpdate();
            rs = cs.executeQuery(); //Ejecuta el query
            lista = new ArrayList<>(); //Inicializa la lista
            //Cargamos el resulsSet -> nos devuelve los resultados
            while (rs.next()) { //Mientras exista un siguiente registro
                dtoFactura fac = new dtoFactura(); //obj de trasnferencia de datos
                fac.setIdFactura(rs.getInt(1)); //Asignamos los valores a cada columba
                fac.setFecha(rs.getString(2));
                fac.setNombreCliente(rs.getString(3));
                fac.setDniRUC(rs.getString(4));
                fac.setTelefono(rs.getString(5));
                fac.setAdministrador(rs.getString(6));
                fac.setSubtotal(rs.getDouble(7));
                fac.setIgv(rs.getDouble(8));
                fac.setTotal(rs.getDouble(9));
                fac.setMetodoPago(rs.getString(10));
                lista.add(fac); //Agregamos los valores del objeto a la lista
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    //CRUD
    @Override
    public List<dtoFactura> facturaSel() {
        List<dtoFactura> lista = null;
        //Construccion del query
        StringBuilder sql = new StringBuilder(); //Lo usamos para append 
        sql.append("SELECT ") //Script
                .append("idFactura,")
                .append("fecha,")
                .append("nombreCliente,")
                .append("dniRuc,")
                .append("telefono,")
                .append("administrador,")
                .append("subtotal,")
                .append("igv,")
                .append("total,")
                .append("metodoPago")
                .append(" FROM factura");
        //Excepcion con recursos
        try (Connection cn = con.getConnection()) { //Si la bd esta habilitada
            ps = cn.prepareStatement(sql.toString()); //Filtro de inyecciones sql -> inserta o muestra datos
            rs = ps.executeQuery(); //Ejecuta el query
            lista = new ArrayList<>(); //Inicializa la lista
            //Cargamos el resulsSet -> nos devuelve los resultados
            while (rs.next()) { //Mientras exista un siguiente registro
                dtoFactura fac = new dtoFactura(); //obj de trasnferencia de datos
                fac.setIdFactura(rs.getInt(1)); //Asignamos los valores a cada columba
                fac.setFecha(rs.getString(2));
                fac.setNombreCliente(rs.getString(3));
                fac.setDniRUC(rs.getString(4));
                fac.setTelefono(rs.getString(5));
                fac.setAdministrador(rs.getString(6));
                fac.setSubtotal(rs.getDouble(7));
                fac.setIgv(rs.getDouble(8));
                fac.setTotal(rs.getDouble(9));
                fac.setMetodoPago(rs.getString(10));
                lista.add(fac); //Agregamos los valores del objeto a la lista
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    @Override
    public dtoFactura facturaGet(Integer id) {
        dtoFactura fac = new dtoFactura();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ") //Script
                .append("idFactura,")
                .append("fecha,")
                .append("nombreCliente,")
                .append("dniRuc,")
                .append("telefono,")
                .append("administrador,")
                .append("subtotal,")
                .append("igv,")
                .append("total,")
                .append("metodoPago")
                .append(" FROM factura")
                .append(" WHERE idFactura = ?");
        try (Connection cn = con.getConnection()) { //Conexion a la bd
            PreparedStatement pss = cn.prepareStatement(sql.toString());
            pss.setInt(1, id);
            ResultSet rss = pss.executeQuery();//Ejecutamos el query en la bd
            //Cargamos el resulSet mientras exista un registro
            while (rss.next()) {
                fac.setIdFactura(rss.getInt(1)); //Asignamos los valores a cada columba
                fac.setFecha(rss.getString(2));
                fac.setNombreCliente(rss.getString(3));
                fac.setDniRUC(rss.getString(4));
                fac.setTelefono(rss.getString(5));
                fac.setAdministrador(rss.getString(6));
                fac.setSubtotal(rss.getDouble(7));
                fac.setIgv(rss.getDouble(8));
                fac.setTotal(rss.getDouble(9));
                fac.setMetodoPago(rss.getString(10));
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return fac;
    }

    @Override
    public String facturaIns(dtoFactura fac) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO factura( ")
                .append("fecha,")
                .append("nombreCliente,")
                .append("dniRuc,")
                .append("telefono,")
                .append("administrador,")
                .append("subtotal,")
                .append("igv,")
                .append("total,")
                .append("metodoPago")
                .append(") VALUES (?,?,?,?,?,?,?,?,?)");
        try (Connection cn = con.getConnection()) {
            PreparedStatement pss = cn.prepareStatement(sql.toString());
            pss.setString(1, fac.getFecha());
            pss.setString(2, fac.getNombreCliente());
            pss.setString(3, fac.getDniRUC());
            pss.setString(4, fac.getTelefono());
            pss.setString(5, fac.getAdministrador());
            pss.setDouble(6, fac.getSubtotal());
            pss.setDouble(7, fac.getIgv());
            pss.setDouble(8, fac.getTotal());
            pss.setString(9, fac.getMetodoPago());
            int cfilas = pss.executeUpdate();
            if (cfilas == 0) {
                mensaje = "0 filas agregadas";
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    @Override
    public String facturaUpd(dtoFactura fac) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE factura SET ")
                .append("fecha = ?,")
                .append("nombreCliente = ?,")
                .append("dniRuc = ?,")
                .append("telefono = ?,")
                .append("administrador = ?,")
                //                .append("subtotal = ?,")
                //                .append("igv = ?,")
                //                .append("total = ?,")
                .append("metodoPago  = ?")
                .append(" WHERE idFactura = ?");
        try (Connection cn = con.getConnection()) {
            PreparedStatement pss = cn.prepareStatement(sql.toString());
            pss.setString(1, fac.getFecha());
            pss.setString(2, fac.getNombreCliente());
            pss.setString(3, fac.getDniRUC());
            pss.setString(4, fac.getTelefono());
            pss.setString(5, fac.getAdministrador());
//            pss.setDouble(6, fac.getSubtotal());
//            pss.setDouble(7, fac.getIgv());
//            pss.setDouble(8, fac.getTotal());
            pss.setString(6, fac.getMetodoPago());
            pss.setInt(7, fac.getIdFactura());
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
    public String facturaDel(List<Integer> ids) {
        StringBuilder sql = new StringBuilder(); //Objeto para el script
        sql.append("DELETE FROM factura WHERE ")//Script
                .append("idFactura = ? ");
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

    //OBTENER ULTIMO ID PARA INSERTAR EN DETALLE FACTURA - store procedure
    public dtoFactura ultimoID() {
        dtoFactura fac = new dtoFactura();
        try (Connection cn = con.getConnection()) { //Conexion a la bd
            CallableStatement cs = (CallableStatement) cn.prepareCall("{call ultimoId()}"); //llamamos el procedimiento 
            int busper = cs.executeUpdate();
            ResultSet rss = cs.executeQuery();//Ejecutamos el query en la bd
            //Cargamos el resulSet mientras exista un registro
            while (rss.next()) {
                fac.setIdFactura(rss.getInt(1)); //Asignamos los valores a cada columb
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return fac;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

}
