
package electiva1;

import java.util.Scanner;

public class Ejercicio9Divider {
    public static void main(String args[]){
    Scanner teclado= new Scanner(System.in);
    System.out.println("Type a number");
    float a=Float.parseFloat(teclado.nextLine());
    System.out.println("Type a another number");
    float b=Float.parseFloat(teclado.nextLine());
    float c=a/b;
    System.out.println("Division: "+a+"/"+b+"="+c);
    }
}
