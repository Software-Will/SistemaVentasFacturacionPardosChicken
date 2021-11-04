package dao.impl;

import dto.dtoFacturaTemp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import utils.cnn;
import dao.daoFacturaTemp;
import java.sql.CallableStatement;

public class daoFacturaTempImpl implements daoFacturaTemp {

    String mensaje = "";
    cnn con = new cnn();
    Connection acceso;

    @Override
    public String pedidoIns(dtoFacturaTemp pedidoTemp) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO facturatemp( ")
                .append("nombreCliente,")
                .append("dniRuc,")
                .append("telefono,")
                .append("administrador,")
                .append("metodoPago,")
                .append("nombreProducto,")
                .append("cantidad,")
                .append("precioProducto,")
                .append("montoProducto,")
                .append("subtotal,")
                .append("igv,")
                .append("total")
                .append(") VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
        try (Connection cn = con.getConnection()) {
            PreparedStatement pss = cn.prepareStatement(sql.toString());
            pss.setString(1, pedidoTemp.getNombreCliente());
            pss.setString(2, pedidoTemp.getDniRuc());
            pss.setString(3, pedidoTemp.getTelefono());
            pss.setString(4, pedidoTemp.getAdministrador());
            pss.setString(5, pedidoTemp.getMetodoPago());
            pss.setString(6, pedidoTemp.getNombreProducto());
            pss.setInt(7, pedidoTemp.getCantidad());
            pss.setDouble(8, pedidoTemp.getPrecioProducto());
            pss.setDouble(9, pedidoTemp.getMontoProducto());
            pss.setDouble(10, pedidoTemp.getSubtotal());
            pss.setDouble(11, pedidoTemp.getIgv());
            pss.setDouble(12, pedidoTemp.getTotal());
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
    //store procedure
    public String truncateTable() {
        try (Connection cn = con.getConnection()) {
            CallableStatement cs = (CallableStatement) cn.prepareCall("{call truncate()}");
            int cfilas = cs.executeUpdate();
            if (cfilas == 0) {
                mensaje = "0 filas agregadas";
            }
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
