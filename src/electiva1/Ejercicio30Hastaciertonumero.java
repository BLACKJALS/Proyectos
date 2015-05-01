
package electiva1;

import java.util.Scanner;

public class Ejercicio30Hastaciertonumero {
    public static void main(String args[]){
    int numeroi=0;    
    Scanner teclado =new Scanner(System.in);
    System.out.println("Up to what number? ");
    int numero= Integer.parseInt(teclado.nextLine());
    while(numeroi<numero){
    numeroi=numeroi+1;
    System.out.println(numeroi);
    }
    }
}
