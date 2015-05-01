
package electiva1;

import java.util.Scanner;

public class Ejercicio32Sumadeunconjuntodenumeros {
    public static void main(String args []){
    Scanner teclado= new Scanner (System.in);
    System.out.println("Until what? ");
    int n= Integer.parseInt(teclado.nextLine());
    int i=0;
    int total=0;
    while(i <= n){
    total=i+total;
    i++;
    }
    System.out.println(total);
    }   
}
