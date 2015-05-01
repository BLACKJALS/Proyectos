
package Patterns.Chainofresponsibility;

import java.util.Scanner;


public class Cliente {
    
    public static void main (String args[]){
    Scanner teclado = new Scanner (System.in);
    Handler h1= new Concretehandler1(); 
    Handler h2= new Concretehandler2(); 
    Handler h3= new Concretehandler3(); 
    
  
    
    System.out.println("Escriba el valor de ingresos mensuales");
    int numero= Integer.parseInt(teclado.nextLine());
    System.out.println("Su moneda debe ser en pesos, por favor escriba a continuación 'pesos' :");
    String cadena= teclado.nextLine();
   
    h1.setSiguiente(h2);
    h2.setSiguiente(h3);

    
    h1.funcionrequest(new Numeros(numero,cadena));
    h2.funcionrequest(new Numeros(numero,cadena));
    h3.funcionrequest(new Numeros(numero,cadena));
    }
    
}
