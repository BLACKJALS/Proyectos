
package electiva1;

import java.util.Scanner;

public class Ejercicio21Añobisiesto {
    
    public static void main(String args[]){
    int año;    
    Scanner teclado=new Scanner(System.in);
    System.out.println("Type a year: ");
    año= Integer.parseInt(teclado.nextLine());
    if((año%4==0 && año%100!=0)  || año%400==0 ){
    System.out.println("The year is a leap year");
   }else {
     System.out.println("The year is not leap year");
    }
    }
    
    
}

