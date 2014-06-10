
package Unidad2.Tipos;

public class Tipos {
   //static int algo; //se pone antes del main para que el constructor lo inicialice 
    public static void main(String[] args) {
       // int [] arreglo1 = new int[3];
      // System.out.println(arreglo1[1]);
      // System.out.println(algo);
      int []arreglo1={20,7,8};
      int []arreglo2=new int[4];
      /* for(int i=0;i<3;i++){
        System.out.println(arreglo1[i]);
       }
       for(int j=0;j<arreglo2.length;j++){
        System.out.println(arreglo2[j]);
         }*/
      for (int x:arreglo1){
        System.out.println(x);  
        }
      for (int y:arreglo2){
        System.out.println(y);
        }
       }
    }

