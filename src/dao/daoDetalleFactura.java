package dao;

import dto.dtoDetalleFactura;
import java.util.List;

public interface daoDetalleFactura { //No se implementar delete aca, ya que es cascade con daoFactura

    //Metodos abstractos y constantes
    List<dtoDetalleFactura> detalleFacSel(); //Select (lee la tabla) -> muestra todos los elementos

    dtoDetalleFactura detalleFacGet(Integer id); //Select where : -> muestra un solo elemento

    //CRUD - String : mensaje
    String detalleFacIns(dtoDetalleFactura detFac);

    String getMensaje(); //Confirma reg    

}
