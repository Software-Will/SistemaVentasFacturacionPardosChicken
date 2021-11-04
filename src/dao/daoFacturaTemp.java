package dao;

import dto.dtoFacturaTemp;

public interface daoFacturaTemp {

    //CRUD - String : mensaje
    String pedidoIns(dtoFacturaTemp pedidoTemp);

    String truncateTable(); //Metodo para limpiar los datos de la tabla

    String getMensaje(); //Confirma reg    

}
