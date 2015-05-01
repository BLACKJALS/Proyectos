
package electiva1;

import java.util.Scanner;


public class Ejercicio69 {
   

public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Type a text: ");
    String text = reader.nextLine();
   
    if (palindrome(text)) {
       System.out.println("The text is a palindrome!");
    } else {
       System.out.println("The text is not a palindrome!");
    }
}
   

    private static boolean palindrome(String text) {
        String nuevonombre="  ";
    boolean b = true ;
    for(int a=text.length()-1;a>=0;a--){ 
    nuevonombre=nuevonombre+text.charAt(a); 
    if(text.charAt(a)!=text.charAt(text.length()-a-1)){
         b=false;
    } 
    }
    return b;
    }
}