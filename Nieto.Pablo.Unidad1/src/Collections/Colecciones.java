package Collections;

import java.util.ArrayList;

public class Colecciones {
    public static void main(String[] args){
        Usuario u1 = new Usuario();
        u1.setId(1);
        u1.setNombre("Sandra");
        u1.setPaterno("Lezama");
        u1.setEmail("sandra@correo.com");
        u1.setSueldo(6000);
        Usuario u2 = new Usuario(2,"Pablo","Nieto","pablo@correo.com",5000);
        Usuario u3 = new Usuario(3,"Ana","Lopez","ana@correo.com",3000);
        
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        
        for(Usuario u:usuarios){
        System.out.println(u);        
        }
    }
    
}
