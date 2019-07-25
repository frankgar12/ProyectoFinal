package modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class GruposDAO implements CRUD {

    Connection con;
    conexion acceso = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<Grupos> lista = new ArrayList<>();
        String sql = "select * from grupo_identificador";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Grupos c = new Grupos();
                c.setId(rs.getInt(1));
                c.setIdentificador(rs.getString(2));
                lista.add(c);
            }
        } catch (Exception e) {
        }
        return lista;

    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into grupo_identificador(letra)values(?)";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from grupo_identificador where id_grupo=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
