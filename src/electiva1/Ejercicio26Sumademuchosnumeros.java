
package electiva1;

import java.util.Scanner;

public class Ejercicio26Sumademuchosnumeros {
    public static void main (String args[]){
    Scanner teclado= new Scanner (System.in);
    int sum=0;
    while(true){   
    int numero= Integer.parseInt(teclado.nextLine());
    if (numero==0){
    break;
    }
    int sum2=sum+numero;
    sum=sum2;
    System.out.println("Sum now: "+sum );
    
    
    }
    System.out.println("Sum in the end: "+sum);
    }
    
    
    
}
