
package electiva1;

import java.util.Scanner;

public class Ejercicio17Numeromayor {
    
    public static void main (String args[]){
        int number1,number2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Type the first number" );
        number1= Integer.parseInt(teclado.nextLine());
        System.out.println("Type the second number");
        number2= Integer.parseInt(teclado.nextLine());
        
        if(number1<number2){
        System.out.println("Greater number: "+number2);
        }if(number1>number2){
        System.out.println("Greater number: "+number1);
        }if(number1==number2){
        System.out.println("The numbers are equal!");
        }
        
    }
    
}
