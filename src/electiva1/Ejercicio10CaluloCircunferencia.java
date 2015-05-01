
package electiva1;

import java.util.Scanner;

public class Ejercicio10CaluloCircunferencia {
    
    public static void main(String args[]){
     float a =(float) Math.PI;
     float b,c;
     Scanner teclado = new Scanner(System.in);
     System.out.println("Type as radius: ");
     b = Integer.parseInt(teclado.nextLine());
     c=2*a*b; 
     System.out.println(c);
    }
}
