
package ProyectoConsesionarios;

import java.io.*;

public class Marca implements Serializable{
    private String marca;
    private String submarca;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getSubmarca() {
        return submarca;
    }
    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public Marca(String marca, String submarca) {
        this.marca = marca;
        this.submarca = submarca;
    }
    public Marca(){
    }
    
}
