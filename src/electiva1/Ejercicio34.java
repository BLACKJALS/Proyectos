
package electiva1;

import java.util.Scanner;


public class Ejercicio34 {
    
   
        public static void main(String[] args){ 
            
        int n,suma=1,r=1,c=1;    
            
        Scanner teclado =new Scanner(System.in); 
         
        System.out.println("Escriba un numero"); 
        n = teclado.nextInt(); 

        while(c<=n){

        r=r*c;
        c=c+1;
        }
        System.out.println("El factorial es "+r); 
} 
}
        
    

