
package electiva1;

import java.util.Scanner;

public class Ejercicio35Sumadepotencias {
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Type a number: ");
    int numero= Integer.parseInt(teclado.nextLine());
    
    int suma=0;
    int i=0,j=1;
    int result;
    
    while(i<=numero){
    result=(int)Math.pow(2, i);
    suma=suma+result;
    i++;
    }
    System.out.println(suma);
    }
    
    
    
}

