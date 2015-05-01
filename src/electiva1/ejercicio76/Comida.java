
package electiva1.ejercicio76;

class Comida {
   
     public static void main(String[] args) {
           
     Menu comida = new Menu("");
     
     comida.addMeal("Hamburguer");
     comida.addMeal("Fish'n'Chips");
     comida.addMeal("Sauerkraut");
    

     
     comida.addMeal("");
     comida.printMeals();
     comida.clearMenu();
     comida.addMeal("");
     comida.printMeals();
 
     
     
    
 
     
     }
}
