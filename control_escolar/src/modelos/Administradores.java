package modelos;

public class Administradores {

    int id;
    String nombrecompleto;
    String fecha_nacimiento;
    String sexo;
    String correo;
    String telefono;
    String direccion;
    String nomusuario;
    String contraseña;

    public Administradores() {
    }

    public Administradores(int id, String nombrecompleto, String fecha_nacimiento,
            String sexo, String correo, String telefono, String direccion, String nomusuario, String contraseña) {
        this.id = id;
        this.nombrecompleto = nombrecompleto;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nomusuario = nomusuario;
        this.contraseña = contraseña;

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

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public String getNomusuario() {
        return nomusuario;
    }

    public void setNomusuario(String nomusuario) {
        this.nomusuario = nomusuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
