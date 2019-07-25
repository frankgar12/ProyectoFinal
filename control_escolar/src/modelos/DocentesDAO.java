package modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class DocentesDAO implements CRUD {

    Connection con;
    conexion acceso = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    public Docentes ValidarAdmin(String contra, String nombreus) {
        Docentes ev = new Docentes();
        String sql = "select * from docente where contraseña=? and no_ident=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, contra);
            ps.setString(2, nombreus);
            rs = ps.executeQuery();
            while (rs.next()) {
                ev.setId(rs.getInt(1));
                ev.setNombrecompleto(rs.getString(2));
                ev.setCodigo_presu(rs.getString(3));
                ev.setTelefono(rs.getString(4));
                ev.setDireccion(rs.getString(5));
                ev.setCorreo(rs.getString(6));
                ev.setCurp(rs.getString(7));
                ev.setAño_sep(rs.getString(8));
                ev.setAño_esc(rs.getString(9));
                ev.setAño_zona(rs.getString(10));
                ev.setFecha_nacimiento(rs.getString(11));
                ev.setRfc(rs.getString(12));
                ev.setCargo(rs.getString(13));
                ev.setNo_identifi(rs.getString(14));
                ev.setContraseña(rs.getString(15));

            }
        } catch (Exception e) {
        }
        return ev;
    }

    @Override
    public List listar() {
        List<Docentes> lista = new ArrayList<>();
        String sql = "select * from docente";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Docentes c = new Docentes();
                c.setId(rs.getInt(1));
                c.setNombrecompleto(rs.getString(2));
                c.setCodigo_presu(rs.getString(3));
                c.setTelefono(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setCurp(rs.getString(7));
                c.setAño_sep(rs.getString(8));
                c.setAño_esc(rs.getString(9));
                c.setAño_zona(rs.getString(10));
                c.setFecha_nacimiento(rs.getString(11));
                c.setRfc(rs.getString(12));
                c.setCargo(rs.getString(13));
                c.setNo_identifi(rs.getString(14));
                c.setContraseña(rs.getString(15));
                lista.add(c);
            }
        } catch (Exception e) {
        }
        return lista;

    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into docente(n_completo,cod_presu,telefono,direccion,correo,CURP,año_ingreSEP,año_ingreESC,año_ingreZN,f_nacimiento,RFC,cargo,no_ident,contraseña)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            ps.setObject(10, o[9]);
            ps.setObject(11, o[10]);
            ps.setObject(12, o[11]);
            ps.setObject(13, o[12]);
            ps.setObject(14, o[13]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "update docente set n_completo=?,cod_presu=?,telefono=?,direccion=?,correo=?,CURP=?,año_ingreSEP=?,año_ingreESC=?,año_ingreZN=?,f_nacimiento=?,RFC=?,cargo=?,no_ident=?,contraseña=? where id_docente=?";
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
            ps.setObject(10, o[9]);
            ps.setObject(11, o[10]);
            ps.setObject(12, o[11]);
            ps.setObject(13, o[12]);
            ps.setObject(14, o[13]);
            ps.setObject(15,o [14]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from docente where id_docente=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
