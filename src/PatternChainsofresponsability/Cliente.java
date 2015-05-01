
package PatternChainsofresponsability;

import java.util.Scanner;

public class Cliente {
    
    public static void main(String args[]){
//    Scanner teclado= new Scanner(System.in);
//    System.out.println("Escriba un numero");
//    int numero=Integer.parseInt(teclado.nextLine());
//    System.out.println("Escriba un nombre");
//    String nombre= teclado.nextLine();
    
    Negocio a= new Negocio();
    a.solicitudPrestamo(6000);
    AccionNumero3 b= new AccionNumero3();
    b.solicitudPrestamo(80000);
    } 
    
    
    
    
}
