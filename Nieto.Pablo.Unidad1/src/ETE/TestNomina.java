package ETE;

public class TestNomina {
    public static void main(String args[]){
       try{
        Nomina a = new Nomina();
        Nomina b = new Nomina();
        
        a.setIdTrabajador(1);
        a.setSaldo(20000);
        System.out.println(a.getsaldo());
               
        b.setIdTrabajador(2);
        b.setSaldo(27496.50);
               
       }
       catch (saldoFueradeRangoException ex){
           System.out.println(ex.getMessage());
       }
    }
    
}
