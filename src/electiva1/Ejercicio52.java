

package electiva1;

import java.util.Scanner;
public class Ejercicio52 {
    
    public static void main(String[] args) {
    
    String nombre="";    
    Scanner Teclado = new Scanner (System.in);
    System.out.println("Escriba su nombre");
    nombre=Teclado.next();
    String nuevonombre="";
    for(int a=nombre.length()-1;a>=0;a--){     
    nuevonombre=nuevonombre+nombre.charAt(a);  
    }
    System.out.println(nuevonombre);
    
    
    }
    
    
}
