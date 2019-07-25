package modelos;

import java.sql.Connection;
import java.sql.DriverManager;


public class conexion {

    //Conexion a la base de datos.
    Connection con;
    String url = "jdbc:mysql://localhost:3306/controlescolar";
    String user = "root";
    String pass = "";

    public Connection Conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {

        }
        return con;

    }
}
