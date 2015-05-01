
package electiva1;

import java.util.Scanner;


public class Ejercicio22Password {
    
    public static void main (String args[]){
    Scanner teclado= new Scanner (System.in); 
 
    while(true){
    System.out.println("Type a password: ");
    String contraseña= teclado.nextLine();
        
    if(contraseña.equals("Zanahoria")){
    System.out.println("Right!\n");
    System.out.println("The secret is: jryy qbar");
    break;
    }else{
    System.out.println("Wrong!");
    }
    }
    }  
}
