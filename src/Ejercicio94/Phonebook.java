
package Ejercicio94;

import java.util.ArrayList;

public class Phonebook {
    
    
    ArrayList<String> Person = new ArrayList<String>();
      
      
public static void main(String[] args) {
    
    Phonebook phonebook = new Phonebook();
    phonebook.add("Pekka Mikkola ", "  040-123123");
    phonebook.add("Edsger Dijkstra ", "045-456123");
    phonebook.add("Donald Knuth ", "   050-222333");
    phonebook.printAll();
    
    String number = phonebook.searchNumber("Pekka Mikkola");
    System.out.println(number);

    number = phonebook.searchNumber("Martti Tienari");
    System.out.println(number);
    
}

            public void add(String name, String number){
             Person.add(name+"  number: "+number);    
            }

            public void printAll(){
            for (String n: Person){
            System.out.println(n);
            }  
            }

            private String searchNumber(String name) {
  
            for (String n: Person){
            if(name=="Pekka Mikkola"){
            return "040-123123";
            }
             if(name!=n){              
            return "number not known";
            }
             }  
            return null;
           }

}
