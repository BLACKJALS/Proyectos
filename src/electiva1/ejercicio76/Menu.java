
package electiva1.ejercicio76;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
  
  private ArrayList<String> meals;

  
    public Menu(String string) {
        this.meals = new ArrayList<String>();
    }
    

    public void addMeal(String meal) {
       this.meals.add(meal);  
    }
       
   
   
   public void printMeals() {
    for (String n: meals){
      System.out.println(n);
    }
   }

   
public void clearMenu(){
     this.meals.clear();
     System.out.println(meals);
     System.out.println("No hay menu");
}

    
    
}
    
    
    

