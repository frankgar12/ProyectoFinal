package modelos;

import java.util.List;

public interface CRUD {

    //Metodos que se utilizaran en los formularios.
    public List listar();

    public int add(Object[] o);

    public int actualizar(Object[] o);

    public void eliminar(int id);

}
