
package ProyectoConsesionarios;

import java.io.*;

public class Automovil implements Serializable{
    private String nombre_Dueño;
    private String modelo;
    private int num_serie;
    Marca m;

    public Marca getM() {
        return m;
    }

    public void setM(Marca m) {
        this.m = m;
    }

    public String getNombre_Dueño() {
        return nombre_Dueño;
    }
    public void setNombre_Dueño(String nombre_Dueño) {
        this.nombre_Dueño = nombre_Dueño;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getNum_serie() {
        return num_serie;
    }
    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public Automovil(String nombre_Dueño, String modelo, int num_serie) {
        this.nombre_Dueño = nombre_Dueño;
        this.modelo = modelo;
        this.num_serie = num_serie;
    }
    public Automovil(){
    }
    
}
