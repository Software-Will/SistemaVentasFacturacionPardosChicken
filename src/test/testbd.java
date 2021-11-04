package test;

import java.sql.Connection;
import java.sql.SQLException;
import utils.cnn;

public class testbd {

    public static void main(String[] args) {
        cnn con = new cnn();
        Connection cnx = null;
        try {
            cnx = con.getConnection();
            System.out.println("Exito");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
