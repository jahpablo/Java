package ProyectoConsesionarios;

import java.util.*;
import java.io.*;

public class Persistencia {
        public static ArrayList<Automovil> buscarTodos(){
        ArrayList<Automovil>autos = new ArrayList<Automovil>();
        try{   
            File f=new File("Autos.sand");
            FileInputStream fis=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis);
        
            autos=(ArrayList<Automovil>)ois.readObject();            
        }
        catch(Exception ex){}
        return autos;
        }
        
        public static void guardar(Automovil a){
        ArrayList<Automovil> autos=new ArrayList<Automovil>();
        try{
            File f=new File ("Autos.sand");
            if (f.exists()){
                autos=buscarTodos();
                }
            FileOutputStream fos=new FileOutputStream(f);
            ObjectOutputStream oos =new ObjectOutputStream(fos);
            autos.add(a);
            oos.writeObject(autos);
        }
        catch (Exception ex){}
    }
    
    public static Automovil buscarID(int id){
        Automovil a=new Automovil();
        try{      
            a=buscarTodos().get(id);       
        }
        catch (Exception ex){}
        return a;
    }
}
