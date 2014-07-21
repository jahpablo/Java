package ETE;

public class Nomina {
    private double saldo;
    private int idTrabajador;
    
    public Nomina(){};
    public Nomina(double saldo, int idTrabajador){};
    
    
    
    public double getsaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo)throws saldoFueradeRangoException{
        if (19999 < saldo )
            if (saldo < 25001)
                this.saldo=saldo;
            else 
                throw new saldoFueradeRangoException();
    } 

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
    
    
    
}
