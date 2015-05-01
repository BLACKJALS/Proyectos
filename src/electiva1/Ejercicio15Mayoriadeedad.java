
package electiva1;

import java.util.Scanner;

public class Ejercicio15Mayoriadeedad {
    public static void main(String args[]){
    int edad;
    Scanner teclado= new Scanner(System.in);
    System.out.println("How old are you? ");
    edad= Integer.parseInt(teclado.nextLine());
    
    if (edad>=18){
    System.out.println("You have reached the age of majority!");
    }else{
    System.out.println("You have not reached the age of majority yet!");
    } 
    }
}
