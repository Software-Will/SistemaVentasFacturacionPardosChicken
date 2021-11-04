package dao;

import dto.dtoProd_View;
import java.util.List;

public interface daoProd_View {
    //Metodos abstractos y constantes

    List<dtoProd_View> productoSel(); //Select (lee la tabla) -> muestra todos los elementos

    dtoProd_View productoGet(Integer id); //Select where : -> muestra un solo elemento

    //CRUD - String : mensaje
    String productoIns(dtoProd_View prod);

    String productoUpd(dtoProd_View prod);

    String productoDel(List<Integer> ids);

    String getMensaje(); //Confirma reg
}
