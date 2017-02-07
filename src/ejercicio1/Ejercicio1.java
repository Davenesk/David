
package ejercicio1;
import java.util.*;

public class Ejercicio1 {

    
    public static void main(String[] args) {
    java.util.Scanner lec;
       lec = new java.util.Scanner (System.in);
       System.out.print("tamaño arreglo");
       int tam =lec.nextInt();
       int[] vectorA = new int[tam];
       int[] vectorB = new int[tam];
       for (int i=0; i<tam; i++){
           System.out.println ("dato"+i+"A");
           vectorA[i]=lec.nextInt();
           System.out.println ("dato"+i+"B");
           vectorB[i]=lec.nextInt();
       }
       int[] resultado=sumavectores(vectorA, vectorB);
       for (int i=0; i<tam; i++){
           System.out.println (resultado[i]);
       }
    }
    static int[] sumavectores( int[]A, int[]B){
        int r[]=new int[A.length];
        for (int i=0; i<A.length; i++)
            r[i]=A[i]+B[i];
        
        return r;
    }
    
}
