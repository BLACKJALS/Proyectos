
package Patterns.Chainofresponsibility;

public class Concretehandler1 extends Handler{
    private Handler siguientes;
    
    
    public void funcionrequest(Numeros request){
    if (request.getNumero1()<600000 && request.getValor().equals("pesos")){
    System.out.println("No se puede realizar prestamo.\n"+"Moneda: "+request.getValor()+"\nPesos : "+request.getNumero1());
    }else{
     System.out.println("\nse va a llevar a cabo una validación");
     this.siguientes.setSiguiente(siguientes);
    }

    }

    @Override
    public void setSiguiente(Handler siguiente) {
        this.siguientes=siguiente;
    }
    }

