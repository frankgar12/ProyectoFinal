
package modelos;


public class Grupos {
    
    int id;
    String identificador;
    
    public Grupos(){
        
    }
    public Grupos(int id, String identificador){
        this.id = id;
        this.identificador = identificador;
                
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    
}
