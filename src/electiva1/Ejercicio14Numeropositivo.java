package electiva1;

import java.util.Scanner;

public class Ejercicio14Numeropositivo {

    public static void main(String args[]) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Type a number");
        numero = Integer.parseInt(teclado.nextLine());

        if (numero >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }
}
