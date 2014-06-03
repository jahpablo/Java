package Unidad1.Animal;

public class PruebaAnimal {
    public static void main(String...x){
        Animal a1=new Animal();
        a1.setNombre("Gato");
        System.out.println("Soy un "+ a1.getNombre());
        Animal a2=new Animal("Perro");
        System.out.println("Yo soy un "+ a2.getNombre());
    }
} 
