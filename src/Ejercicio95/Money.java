

package Ejercicio95;

public class Money {
    
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros(){
        return euros;
    }

    public int cents(){
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        Money d=new Money(this.euros+added.euros,this.cents+added.cents);
        System.out.println(d);
        return d;
    }

  public boolean less(Money compared){
       if(this.euros>compared.euros || this.cents>compared.cents){
       return false; 
       } else {
       return true;
       } 
    }
  
  
  
  public Money minus(Money decremented){
        if(this.euros-decremented.euros>0){
         
        
        
        }
      return null;

  }

   
  
  
  
    
    
}
