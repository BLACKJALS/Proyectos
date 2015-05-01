
package electiva1;

import java.util.Scanner;

public class Ejercicio12Sumaedades {
    public static void main(String argss[]){
    int a,b;
    String nombre,nombre1;
    Scanner teclado =new Scanner(System.in);
    System.out.println("Type your name:");
    nombre= teclado.nextLine();
    System.out.println("Type your age:");
    a= Integer.parseInt(teclado.nextLine());
    System.out.println("Type your name:");
    nombre1=teclado.nextLine();
    System.out.println("Type your age: ");
    b=Integer.parseInt(teclado.nextLine());
    int c=a+b;
    System.out.println(nombre+" and "+nombre1+" are "+c+" years old in total.");
    }
}
