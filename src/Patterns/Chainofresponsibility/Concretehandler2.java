
package Patterns.Chainofresponsibility;


public class Concretehandler2 extends Handler {
      private Handler siguientes;

    @Override
    public void funcionrequest(Numeros request) {    
        if(request.getNumero1()>=600000 && request.getNumero1()<=1000000 && request.getValor().equals("pesos")){
        System.out.println("Su transacción de prestamo se verificará.\n"+"Moneda: "+request.getValor()+"\n Monto : "+request.getNumero1());
        }else { 
        this.siguientes.setSiguiente(siguientes);
     }
       
    }

    @Override
    public void setSiguiente(Handler siguiente) {
    this.siguientes=siguiente;    
    }
}
