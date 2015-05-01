
package electiva1;

import java.util.Scanner;

public class Ejercicio34Factorial {
    public static void main (String args[]){
    
    Scanner teclado = new Scanner (System.in);
    System.out.println("Type a number");
    int numero= Integer.parseInt(teclado.nextLine());
    int i=1;
    int factor=1;
    while (i<=numero){
    factor=i*factor;
    i++;
    }   
    System.out.println("Factorial is: "+factor);
    }
}
