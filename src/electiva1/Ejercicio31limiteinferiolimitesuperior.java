

package electiva1;

import java.util.Scanner;

public class Ejercicio31limiteinferiolimitesuperior {
    
    public static void main (String args[]){
        int numero1,numero2;
    Scanner teclado=new Scanner(System.in);
    System.out.println("First: ");
    numero1= Integer.parseInt(teclado.nextLine());
    System.out.println("Last: ");
    numero2= Integer.parseInt(teclado.nextLine());
    
    while(numero1<=numero2){
    numero1=numero1;
    System.out.println(numero1);
    numero1++;
    }
    }

    }
