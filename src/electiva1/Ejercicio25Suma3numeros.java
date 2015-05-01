
package electiva1;

import java.util.Scanner;

public class Ejercicio25Suma3numeros {
    public static void main(String args[]){
    int sum=0;    
    Scanner teclado =new Scanner(System.in);
    int numero1,numero2,numero3;
    System.out.println("Type the first number: ");
    numero1=Integer.parseInt(teclado.nextLine());
    System.out.println("Type the second number: ");
    numero2=Integer.parseInt(teclado.nextLine());
    System.out.println("Type the third number: ");
    numero3=Integer.parseInt(teclado.nextLine());
    
    sum=numero1+numero2+numero3;
    System.out.println("Sum: "+sum);
    
    }
    
    
    
}
