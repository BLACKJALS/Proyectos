
package electiva1;

import java.util.Scanner;

public class Ejercicio38Muchasimpresiones {
    public static void main (String args []){
    Printext();
    
    }
    
    
    public static void Printext(){
    Scanner teclado= new  Scanner(System.in);
    System.out.println("How many");
    int numero = Integer.parseInt(teclado.nextLine());
    
    for (int a=1;numero>=a;a++){
    System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
    
    } 
    
}
