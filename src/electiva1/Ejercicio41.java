package electiva1;

import java.util.Scanner;

public class Ejercicio41 {
    
  public static void main(String[] args){
      
      int n;
      int b=1;
      int a=70;
      Scanner teclado = new Scanner(System.in);
      System.out.println("Adivina un numero:");
      n = teclado.nextInt();
     
      
      while(n!=a || b<=n){
      if (n>a){
           System.out.println("El numero es menor,conjeturas hechas: "+b);
           System.out.println("Adivina un numero:");
           n = teclado.nextInt();
      }else {
       System.out.println("El numero es mayor,conjeturas hechas: "+b);
       System.out.println("Adivina un numero:");
       n = teclado.nextInt();
      }if(n==a){
          System.out.println("El numero es correcto");
          return;
              }
      b++;
      }
      

  }
}
