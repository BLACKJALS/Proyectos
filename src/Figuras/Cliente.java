
package Figuras;

import java.awt.Color;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String color;
    
    
 public static void main(String args[]){
     
   ArrayList <Figuras> f = new ArrayList<Figuras>();
   Cliente a=new Cliente();
   f.add(new Circulo  ("Circulo","blanco"));
   f.add(new Cuadrado ("Cuadrado","verde"));
   f.add(new Triangulo("Triangulo","azul"));
   a.pintar(f);
   
    
 }   
   public void pintar(ArrayList<Figuras> f){ 
    for (Figuras figuras: f){
    figuras.pintar();
    } 
   }
   
   
 
 }
