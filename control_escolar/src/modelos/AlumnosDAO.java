package modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class AlumnosDAO implements CRUD {
    
    Connection con;
    conexion acceso = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
//    public List listar() {
//        List<Alumnos> lista = new ArrayList<>();
//        String sql = "select * from estudiante";
//        try {
//            con = acceso.Conectar();
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                Alumnos c = new Alumnos();
//                c.setId(rs.getInt(1));
//                c.setMatricula(rs.getString(2));
//                c.setNombrecom(rs.getString(3));
//                c.setCurp(rs.getString(4));
//                c.setFechanaci(rs.getString(5));
//                c.setSexo(rs.getString(6));
//                c.setGrpsangre(rs.getString(7));
//                c.setIdgrado(rs.getInt(8));
//                c.setIdpadre(rs.getInt(9));
//                lista.add(c);
//            }
//        } catch (Exception e) {
//        }
//        return lista;
//    }
    public List listar() {
        List<Alumnos> lista = new ArrayList<>();
//        String sql = "select * from estudiante,padre WHERE estudiante.id_padre=padre.id_padre";
        String sql = "select e.id_estudiante,e.matricula,e.n_completo,CURP,e.f_nacimiento,e.sexo,e.grp_sanguineo,e.id_grado,p.np_completo from "
                + "estudiante as e natural join padre as p";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Alumnos c = new Alumnos();
//                c.setId(rs.getInt("id_estudiante"));
//                c.setMatricula(rs.getString("matricula"));
//                c.setNombrecom(rs.getString("n_completo"));
//                c.setCurp(rs.getString("CURP")); 
//                c.setFechanaci(rs.getString("f_nacimiento"));
//                c.setSexo(rs.getString("sexo"));
//                c.setGrpsangre(rs.getString("grp_sanguineo"));
//                c.setIdgrado(rs.getInt("id_grado"));
//                c.setIdpadre(rs.getInt("np_completo"));
                c.setId(rs.getInt(1));
                c.setMatricula(rs.getString(2));
                c.setNombrecom(rs.getString(3));
                c.setCurp(rs.getString(4));
                c.setFechanaci(rs.getString(5));
                c.setSexo(rs.getString(6));
                c.setGrpsangre(rs.getString(7));
                c.setIdgrado(rs.getInt(8));
//                c.setIdpadre(rs.getInt(9));
                c.setNombreCompleto(rs.getString(9));
                lista.add(c);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into estudiante(matricula,n_completo,CURP,f_nacimiento,sexo,grp_sanguineo,id_grado,id_padre)values(?,?,?,?,?,?,?,?)";
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
    public int actualizar(Object[] o) {
        int r = 0;
//        String sql = "update estudiante set matricula=?,n_completo=?,CURP=?,f_nacimiento=?,sexo=?,grp_sanguineo=?,id_grado=?,id_padre=? where id_estudiante=?";
        String sql = "update estudiante set matricula=?,n_completo=?,CURP=?,f_nacimiento=?,sexo=?,grp_sanguineo=?,id_grado=?,id_padre=? where id_estudiante=?";
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
        String sql = "delete from estudiante where id_estudiante=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
