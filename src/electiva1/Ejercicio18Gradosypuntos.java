
package electiva1;

import java.util.Scanner;

public class Ejercicio18Gradosypuntos {
    
    public static void main(String args[]){
    int numero;
    Scanner teclado = new Scanner (System.in);
    System.out.println("Type the points [0-60]: ");
    numero= Integer.parseInt(teclado.nextLine());
    if (numero>=0&& numero<=29){
    System.out.println("Grade: failed");
    }if(numero>=30&&numero<=34){
    System.out.println("Grade: 1");
    }if(numero>=35&&numero<=39){
    System.out.println("Grade: 2");
    }if(numero>=40&&numero<=44){
    System.out.println("Grade: 3");
    }if(numero>=45 && numero<=49){
    System.out.println("Grade: 4");
    }if(numero>=50&&numero<=60){
    System.out.println("Grade: 5");
    }
    }
}
