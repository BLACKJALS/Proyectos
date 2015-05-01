package electiva1;


import java.util.Scanner;



public class Ejercicio16 {
    
  
     public static void main(String[] args) {
        int a;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Tipo de numero:\n");
        a =  teclado.nextInt();
        
        if(a%2==0){
            System.out.println("el numero es par");
        }else{
        System.out.println("el numero es impar");
        }
        
    }
}
