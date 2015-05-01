
package Patterns.Chainofresponsibility;


public class Concretehandler3 extends Handler {
    
private Handler siguientes;



    @Override
    public void funcionrequest(Numeros request) {
        if(request.getNumero1()>1000000 && request.getValor().equals("pesos")){
        System.out.println("Su solicitud de prestamo fue aceptada y se realizo correctamente.\n"+"Moneda: "+request.getValor()+"\nMonto : "+request.getNumero1());
        }
    }
    
    
    @Override
    public void setSiguiente(Handler siguiente) {
    this.siguientes=siguiente;
    }
    
}
