package dao.impl;

import dao.daoPedido;
import dto.dtoPedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import utils.cnn;

public class daoPedidoImpl implements daoPedido {

    String mensaje = "";
    cnn con = new cnn();
    Connection acceso;

    @Override
    public List<dtoPedido> pedidoSel() {
        List<dtoPedido> lista = null;
        return lista;
    }

//    @Override
//    public dtoPedido pedidoGet(Integer id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    @Override
    public String pedidoIns(dtoPedido pedido) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO pedidoproducto( ")
                .append("nombreProducto,")
                .append("cantidad,")
                .append("precioProducto,")
                .append("montoProducto,")
                .append("nombreCliente")
                .append(") VALUES (?,?,?,?,?)");
        try (Connection cn = con.getConnection()) {
            PreparedStatement pss = cn.prepareStatement(sql.toString());
            pss.setString(1, pedido.getNombreProducto());
            pss.setInt(2, pedido.getCantidad());
            pss.setDouble(3, pedido.getPrecioProducto());
            pss.setDouble(4, pedido.getMontoProducto());
            pss.setString(5, pedido.getNombreCliente());
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
    public String getMensaje() {
        return mensaje;
    }

}
