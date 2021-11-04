package dao;

import dto.dtoFactura;
import java.util.List;

public interface daoFactura {

    //Metodos abstractos y constantes
    List<dtoFactura> facturaSel(); //Select (lee la tabla) -> muestra todos los elementos

    dtoFactura facturaGet(Integer id); //Select where : -> muestra un solo elemento

    //CRUD - String : mensaje
    String facturaIns(dtoFactura fac);

    String facturaUpd(dtoFactura fac);

    String facturaDel(List<Integer> ids);

    String getMensaje(); //Confirma reg    

}
