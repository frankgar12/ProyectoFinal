package modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class AdministradorDAO implements CRUD {

    Connection con;
    conexion acceso = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    public Administradores ValidarAdmin(String contra, String nombreus) {
        Administradores ev = new Administradores();
        String sql = "select * from administrador where contraseña=? and nomusuario=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, contra);
            ps.setString(2, nombreus);
            rs = ps.executeQuery();
            while (rs.next()) {
                ev.setId(rs.getInt(1));
                ev.setNombrecompleto(rs.getString(2));
                ev.setFecha_nacimiento(rs.getString(3));
                ev.setSexo(rs.getString(4));
                ev.setCorreo(rs.getString(5));
                ev.setTelefono(rs.getString(6));
                ev.setDireccion(rs.getString(7));
                ev.setNomusuario(rs.getString(8));
                ev.setContraseña(rs.getString(9));

            }
        } catch (Exception e) {
        }
        return ev;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into administrador(n_completo,f_nacimiento,sexo,correo,telefono,direccion,nomusuario,contraseña)values(?,?,?,?,?,?,?,?)";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            ps.setObject(8, o[7]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public List listar() {
        List<Administradores> lista = new ArrayList<>();
        String sql = "select * from administrador";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Administradores c = new Administradores();
                c.setId(rs.getInt(1));
                c.setNombrecompleto(rs.getString(2));
                c.setFecha_nacimiento(rs.getString(3));
                c.setSexo(rs.getString(4));
                c.setCorreo(rs.getString(5));
                c.setTelefono(rs.getString(6));
                c.setDireccion(rs.getString(7));
                c.setNomusuario(rs.getString(8));
                c.setContraseña(rs.getString(9));
                lista.add(c);
            }
        } catch (Exception e) {
        }
        return lista;

    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update administrador set n_completo=?,f_nacimiento=?,sexo=?,correo=?,telefono=?,direccion=?,nomusuario=?,contraseña=? where id_usuario=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            ps.setObject(8, o[7]);
            ps.setObject(9, o[8]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;

    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from administrador where id_usuario=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
