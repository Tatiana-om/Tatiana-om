
import java.util.Scanner;


 public class AlturasPersonas {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        // variable de tipo vector

        float[] alturas ;
        alturas = new float [5];
      // Lectura y guardar alturas
      for (int i = 0; i<5; i++) {
       
      
            System.out.print("Ingresar la altura de la persona ");
            alturas[i] = sc.nextFloat();
        }
        // calcular promedio
        float suma=0, promedio=0;
        for (int j=0;j<5;j++){
        suma=suma+alturas[j];
 }
        System.out.println("la suma total:"+suma);
        promedio=suma/5;
         System.out.println("promedio de alturas:"+promedio);
         // contar los mayores y menores}
         int may,men;
         may=0;
         men=0;
         for(int j=0;j<5;j++){
         if(alturas[j]> promedio){
             may++;
         } else if (alturas[j]<promedio){
         men++;
         }
    
         }
         
        System.out.println("la cantidad mayor del promedio es:"+may);
        System.out.println("la cantidad menor del promedio es:"+men);
         }
    }
 
         
         