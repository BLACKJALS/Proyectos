
package electiva1;
  import java.util.Scanner;

public class Prueba {
    
  

    public static void main(String[] args) {
    String name1 = "Anne";
    String name2 = "Green";
    greet( name1 + " " + name2 );

    int age = 24;
    greet("John " + age + " years");
    }

    // self-written methods
    public static void greet(String name) {
       System.out.println("Hi " + name + ", greetings from the world of methods!");
    }
}

