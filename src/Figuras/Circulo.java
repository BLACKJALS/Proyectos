
package Figuras;

import java.awt.Color;

public class Circulo implements Figuras{
    private String nombre;
    private String color;
    
    public  Circulo(String nombre, String color) {
        this.color=color;
        this.nombre=nombre;
    }
    
    
    @Override
    public void SetNombre(String nombre) {
        this.nombre=nombre;
    }
    
   
    @Override
    public String getNombre(){
    return this.nombre;
    }
    
    
    @Override
    public void setColor(String color){
    this.color=color;
    }
   
    @Override
    public String getColor(){
    return this.color;
    }
 
     
    @Override
   public void pintar(){
      System.out.println("Nombre: "+this.nombre+ " Color: "+color);
   } 

    
}
