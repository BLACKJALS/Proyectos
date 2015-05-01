
package electiva1;

import java.util.Scanner;

public class Ejercicio19Verificacionedad {
    
       public static void main(String args[]){
           int edad;
           Scanner teclado=new Scanner(System.in);
           System.out.println("How old are you? ");
           edad=Integer.parseInt(teclado.nextLine());
           if (edad>=0&&edad<=120){
           System.out.println("OKAY");
           }if (edad<0|| edad>120){
           System.out.println("Immpossible!");
           }
       }
}
