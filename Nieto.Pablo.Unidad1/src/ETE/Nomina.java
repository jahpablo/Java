package ETE;

public class Nomina {
    private double saldo;
    private int idTrabajador;
    
    public Nomina(){};
    public Nomina(double saldo, int idTrabajador){};
    
    
    
    public double setsaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo=saldo;
    } 

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
    
    
    
}
