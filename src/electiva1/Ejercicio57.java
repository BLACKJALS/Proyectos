
package electiva1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio57 {
    
    public static void main(String[] args) {
        
  String a="";      
  ArrayList<String> words = new ArrayList<String>();
  Scanner Teclado = new Scanner(System.in);
  
  

  for (int b=0; b <=1000; b ++ ){
  System.out.println("Escriba una palabra");
  a=Teclado.nextLine();
  for(String word: words){
  words.add(a);
  }if(a.equals("")){
  System.out.println("no hay nada" );
  break;
  }
  }
   System.out.println(a);
  }
 
}
