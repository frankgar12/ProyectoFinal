package modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class PadresDAO implements CRUD {

    Connection con;
    conexion acceso = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {
        List<Padres> lista = new ArrayList<>();
        String sql = "select * from padre";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Padres c = new Padres();
                c.setId(rs.getInt(1));
                c.setNombrecompleto(rs.getString(2));
                c.setCorreo(rs.getString(3));
                c.setTelefono(rs.getString(4));
                c.setDireccion(rs.getString(5));
                lista.add(c);
            }
        } catch (Exception e) {
        }
        return lista;

    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into padre(np_completo,correo,telefono,direccion)values(?,?,?,?)";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update padre set np_completo=?,correo=?,telefono=?,direccion=? where id_padre=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;

    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from padre where id_padre=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
