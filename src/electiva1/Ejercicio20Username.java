
package electiva1;

import java.util.Scanner;

public class Ejercicio20Username {
    public static void main(String args[]){ 
    String nombre,contraseña;    
    Scanner teclado=new Scanner (System.in);
    System.out.println("Type your username");
    nombre=teclado.nextLine();
    System.out.println("Type your password");
    contraseña=teclado.nextLine();
    
    if(nombre.equals("alex")&&contraseña.equals("mightyducks")){
    System.out.println("You are loged in the sistem");
    }else if(nombre.equals("emily")&&contraseña.equals("cat")){
    System.out.println("You are loged in the sistem");
    }else{
    System.out.println("You username or password was invalid");
    }
    }
    
}
