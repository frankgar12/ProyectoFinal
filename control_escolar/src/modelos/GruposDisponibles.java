package modelos;

public class GruposDisponibles {

    int id;
    int grado;
    int grupo;
    int docente;

    public GruposDisponibles() {

    }

    public GruposDisponibles(int id, int grado, int grupo, int docente) {
        this.id = id;
        this.grado = grado;
        this.grupo = grupo;
        this.docente = docente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public int getDocente() {
        return docente;
    }

    public void setDocente(int docente) {
        this.docente = docente;
    }
}
