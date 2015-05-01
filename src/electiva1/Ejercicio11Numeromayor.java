
package electiva1;

import java.util.Scanner;

public class Ejercicio11Numeromayor {
    public static void main(String args[]){
    Scanner teclado=new Scanner (System.in);    
    System.out.println("Type a number:");
    int a=Integer.parseInt(teclado.nextLine());
    System.out.println("Type another number");
    int b= Integer.parseInt(teclado.nextLine());
    int c= Math.max(a, b);
    System.out.println("The bigger number of the two number given was: "+c);
    }
}
