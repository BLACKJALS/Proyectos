
package Ejercicio94;
public class Person {
    
    
    private String getName;
    private String getNumber;
    private String getNumbers;
    
    public static void main(String[] args) {
        
        
    Person pekka = new Person("Pekka Mikkola", "040-123123");
    
    System.out.println( pekka.getName());
    System.out.println( pekka.getNumber());
    pekka.changeNumber("050-333444");
    System.out.println( pekka );
    System.out.println( pekka.getNumbers());
    
}
    

    private Person(String pekka_Mikkola, String string) {
    this.getName="pekka mikkola";
    this.getNumber="040-123123";
    }

    Person() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
            public String toString() {
            return this.getName  + "  number: " + this.getNumber ;
            }
            
            public String getNumber(){
            return  this.getNumber;
            }


            public String getName(){
            return this.getName;
            }
            
            
            public String getNumbers(){
            return this.getNumbers;
            }

            public void changeNumber(String newNumber) {
            this.getNumbers=this.getName+ "  number: "+newNumber;
            }
  

}


