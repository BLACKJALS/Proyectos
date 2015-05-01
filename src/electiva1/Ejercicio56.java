package electiva1;

import java.util.Scanner;

public class Ejercicio56 {
    
    public static void main(String[] args) {
    System.out.print("Type in your text: ");
    
    Scanner reader= new Scanner (System.in);
    String text = reader.nextLine();
    System.out.println("In reverse order: " + reverse(text));
}
    
    public static String reverse(String text) {
    String nuevonombre="";
    
    for(int a=text.length()-1;a>=0;a--){ 
    nuevonombre=nuevonombre+text.charAt(a); 

    }
    
        
        //  public static String reverse(String text) {
    //String nuevonombre="";
    
    //for(int a=text.length()-1;a>=0;a--){ 
    //nuevonombre=nuevonombre+text.charAt(a);

     
    if (nuevonombre.equals(text.equals(nuevonombre))){
     System.out.print("Type in your text: \n" + nuevonombre);
    }
    System.out.print("Type in your text: \n" + nuevonombre);
    return nuevonombre;
  
}
}