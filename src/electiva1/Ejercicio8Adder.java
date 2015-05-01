
package electiva1;

import java.util.Scanner;

public class Ejercicio8Adder {
   public static void main(String args[]){
   Scanner teclado=new Scanner (System.in);
   System.out.println("Type a number:");
   int a= Integer.parseInt(teclado.nextLine());
   System.out.println("Type a another number:");
   int b=Integer.parseInt(teclado.nextLine());
   int c=a+b;
   System.out.println("Sum of the numbers: "+c);
  }   
}
