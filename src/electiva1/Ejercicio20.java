
package electiva1;
import static java.awt.SystemColor.text;
import java.util.Scanner;

public class Ejercicio20 {
    
    
       public static void main(String[] args) {
               
        String nombre= "";
        String contraseña= "";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba su nombre de usuario:");
        nombre= teclado.next();
        System.out.println("Escriba su contraseña:");
        contraseña= teclado.next();
     
        if(nombre.equals("alex")&& contraseña.equals("mightyducks")||nombre.equals("emily")&& contraseña.equals("cat")){
        System.out.println("Ha iniciado su sesión en el sistema!");
        }
        else{
         System.out.println("Su nombre de usuario o la contraseña no son válidos");
        }
        
    }
    
}
