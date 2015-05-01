
package electiva1;

import java.util.Scanner;


public class Ejercicio39Imprimir {
private static void printStars(int amount) {
    Scanner teclado= new Scanner (System.in);
    amount = Integer.parseInt(teclado.nextLine());
    for (int a=1; amount >=a;a++){
     System.out.println("*****");
     System.out.println("***");
     System.out.println("*********");
    }
    
    
}

public static void main(String[] args) {
    printStars(5);
    printStars(3);
    printStars(9);
}
}
