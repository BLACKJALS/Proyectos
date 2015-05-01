/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.Chainofresponsibility;

public abstract class Handler {
   
    public abstract void setSiguiente(Handler siguiente);
    public abstract void funcionrequest(Numeros request); 
 
}
