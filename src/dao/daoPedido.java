package dao;

import dto.dtoPedido;
import java.util.List;

public interface daoPedido {

    //Metodos abstractos y constantes
    List<dtoPedido> pedidoSel(); //Select (lee la tabla) -> muestra todos los elementos

//    dtoPedido pedidoGet(Integer id); //Select where : -> muestra un solo elemento

    //CRUD - String : mensaje
    String pedidoIns(dtoPedido pedido);

    String getMensaje(); //Confirma reg    

}
