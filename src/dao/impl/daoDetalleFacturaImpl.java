package dao.impl;

import dao.daoDetalleFactura;
import dto.dtoDetalleFactura;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.cnn;

public class daoDetalleFacturaImpl implements daoDetalleFactura {

    //Atributos para validar datos
    PreparedStatement ps;
    ResultSet rs;
    private String mensaje;

    //Objetos dto - conexion bd
    dtoDetalleFactura dtoDF = new dtoDetalleFactura();
    cnn con = new cnn();
    Connection acceso;
    
    @Override
    public List<dtoDetalleFactura> detalleFacSel() {
        List<dtoDetalleFactura> lista = null;
        //Construccion del query
        StringBuilder sql = new StringBuilder(); //Lo usamos para append 
        sql.append("SELECT ") //Script
                .append("idDetalleFactura,")
                .append("idFactura,")
                .append("nomProd,")
                .append("cantidad,")
                .append("precioProd,")
                .append("montoProd")
                .append(" FROM detallefactura");
        //Excepcion con recursos
        try (Connection cn = con.getConnection()) { //Si la bd esta habilitada
            ps = cn.prepareStatement(sql.toString()); //Filtro de inyecciones sql -> inserta o muestra datos
            rs = ps.executeQuery(); //Ejecuta el query
            lista = new ArrayList<>(); //Inicializa la lista
            //Cargamos el resulsSet -> nos devuelve los resultados
            while (rs.next()) { //Mientras exista un siguiente registro
                dtoDetalleFactura detalleFac = new dtoDetalleFactura(); //obj de trasnferencia de datos
                detalleFac.setIdDetalleFactura(rs.getInt(1));
                detalleFac.setIdFactura(rs.getInt(2));
                detalleFac.setNomProd(rs.getString(3));
                detalleFac.setCantidad(rs.getInt(4));
                detalleFac.setPrecioProd(rs.getDouble(5));
                detalleFac.setMontoProd(rs.getDouble(6));
                lista.add(detalleFac); //Agregamos los valores del objeto a la lista
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }
    
    @Override
    public dtoDetalleFactura detalleFacGet(Integer id) {
        dtoDetalleFactura detalleFac = new dtoDetalleFactura();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ") //Script
                .append("idDetalleFactura,")
                .append("idFactura,")
                .append("nomProd,")
                .append("cantidad,")
                .append("precioProd,")
                .append("montoProd")
                .append(" FROM detallefactura")
                .append(" WHERE idDetalleFactura = ?");
        try (Connection cn = con.getConnection()) { //Conexion a la bd
            PreparedStatement pss = cn.prepareStatement(sql.toString());
            pss.setInt(1, id);
            ResultSet rss = pss.executeQuery();//Ejecutamos el query en la bd
            //Cargamos el resulSet mientras exista un registro
            while (rss.next()) {
                detalleFac.setIdDetalleFactura(rss.getInt(1));
                detalleFac.setIdFactura(rss.getInt(2));
                detalleFac.setNomProd(rss.getString(3));
                detalleFac.setCantidad(rss.getInt(4));
                detalleFac.setPrecioProd(rss.getDouble(5));
                detalleFac.setMontoProd(rss.getDouble(6));
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return detalleFac;
    }
    
    @Override
    public String detalleFacIns(dtoDetalleFactura detFac) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO detallefactura( ")
                .append("idFactura,")
                .append("nomProd,")
                .append("cantidad,")
                .append("precioProd,")
                .append("montoProd")
                .append(") VALUES (?,?,?,?,?)");
        try (Connection cn = con.getConnection()) {
            PreparedStatement pss = cn.prepareStatement(sql.toString());
            pss.setInt(1, detFac.getIdFactura());
            pss.setString(2, detFac.getNomProd());
            pss.setInt(3, detFac.getCantidad());
            pss.setDouble(4, detFac.getPrecioProd());
            pss.setDouble(5, detFac.getMontoProd());
            int cfilas = pss.executeUpdate();
            if (cfilas == 0) {
                mensaje = "0 filas agregadas";
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    //Metodo para mostrar detalle factura por factura - store procedure
    public List<dtoDetalleFactura> detalleFactura(Integer idFactura) {
        List<dtoDetalleFactura> lista = null;
        //Excepcion con recursos
        try (Connection cn = con.getConnection()) { //Si la bd esta habilitada
            CallableStatement cs = (CallableStatement) cn.prepareCall("{call detalleFactura(?)}"); //llamamos el procedimiento
            cs.setInt(1, idFactura); //seteamos el parámetro
            int busper = cs.executeUpdate();
            rs = cs.executeQuery(); //Ejecuta el query
            lista = new ArrayList<>(); //Inicializa la lista
            //Cargamos el resulsSet -> nos devuelve los resultados
            while (rs.next()) { //Mientras exista un siguiente registro
                dtoDetalleFactura detFac = new dtoDetalleFactura(); //obj de trasnferencia de datos
                detFac.setNomProd(rs.getString(1));
                detFac.setCantidad(rs.getInt(2));
                detFac.setPrecioProd(rs.getDouble(3));
                detFac.setMontoProd(rs.getDouble(4));
                lista.add(detFac); //Agregamos los valores del objeto a la lista
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    }
    
    @Override
    public String getMensaje() {
        return mensaje;
    }
    
}