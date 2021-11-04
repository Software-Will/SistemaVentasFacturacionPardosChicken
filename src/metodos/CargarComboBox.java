package metodos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import utils.cnn;

public class CargarComboBox {

    public void cbxAdmins(JComboBox cbxAdmin) {
        cnn con = new cnn();
        String sql = "SELECT nombre FROM administrador ORDER BY nombre ASC";
        try {
            Connection cn = con.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            cbxAdmin.addItem("Administrador");
            while (rs.next()) {
                cbxAdmin.addItem(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
