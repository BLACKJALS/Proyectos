
package electiva1;

import java.util.Scanner;

public class Ejercicio33Sumadedosnumeros {
    
    public static void main(String args[]){
    Scanner teclado=new Scanner (System.in);
    System.out.println("First: ");
    int numero1= Integer.parseInt(teclado.nextLine());
    System.out.println("Last: ");
    int numero2= Integer.parseInt(teclado.nextLine());
    int i=numero1;
    int suma=0;
    while(i<=numero2){    
    suma=i+suma;
    i++;
    }
    System.out.println(suma);
    }
    
}
