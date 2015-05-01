
package Patterns.Chainofresponsibility;

public class Numeros {
    private int numero1;
    private String valor;
   
public Numeros(int numero1, String nombre){
    this.numero1=numero1;
    this.valor=nombre;
}    

public int getNumero1(){
return this.numero1;
}

    
public String getValor(){
return this.valor;
}

}
