package modelos;

public class Docentes {

    int id;
    String nombrecompleto;
    String codigo_presu;
    String telefono;
    String direccion;
    String correo;
    String curp;
    String año_sep;
    String año_esc;
    String año_zona;
    String fecha_nacimiento;
    String rfc;
    String cargo;
    String no_identifi;
    String contraseña;

    public Docentes() {
    }

    public Docentes(int id, String codigo_presu, String telefono, String direccion, String correo, String curp, String año_sep,
            String año_esc, String año_zona, String fecha_nacimineto, String rfc, String cargo, String no_ident, String contraseña) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getCodigo_presu() {
        return codigo_presu;
    }

    public void setCodigo_presu(String codigo_presu) {
        this.codigo_presu = codigo_presu;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getAño_sep() {
        return año_sep;
    }

    public void setAño_sep(String año_sep) {
        this.año_sep = año_sep;
    }

    public String getAño_esc() {
        return año_esc;
    }

    public void setAño_esc(String año_esc) {
        this.año_esc = año_esc;
    }

    public String getAño_zona() {
        return año_zona;
    }

    public void setAño_zona(String año_zona) {
        this.año_zona = año_zona;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNo_identifi() {
        return no_identifi;
    }

    public void setNo_identifi(String no_identifi) {
        this.no_identifi = no_identifi;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
