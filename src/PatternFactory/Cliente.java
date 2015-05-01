
package PatternFactory;

import java.util.Scanner;


public class Cliente {
  public static void main (String args[]){
    Scanner teclado= new Scanner(System.in); 
    System.out.println("\nEscriba de 0 a 2 que tipo de producto 'figura' que quiere");
    int numero= Integer.parseInt(teclado.nextLine());
    Factory f=  new Factory();  
    Producto h = f.CreateProduct(numero);
    h.figuras();
//    while (true){  
//        System.out.println("\nEscriba de 0 a 2 que tipo de producto 'figura' que quiere");
//        int numero= Integer.parseInt(teclado.nextLine());
//        Producto p = Factory.CreateProduct(numero);
//        p.Figuras(); 
//    }
    
}
}