package dao;

import dto.dtoAdministrador;
import java.util.List;

public interface daoAdministrador {
    //Metodos abstractos y constantes

    List<dtoAdministrador> administradorSel(); //Select (lee la tabla) -> muestra todos los elementos

    dtoAdministrador administradorGet(Integer id); //Select where : -> muestra un solo elemento

    //CRUD - String : mensaje
    String administradorIns(dtoAdministrador admin);

    String administradorUpd(dtoAdministrador admin);

    String administradorDel(List<Integer> ids);

    String getMensaje(); //Confirma reg    

}
