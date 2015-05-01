
package PatternChainsofresponsability;

import java.util.Scanner;


public class AgregarNumero implements Handler{
    private Handler next;

    
     @Override
    public Handler getNext() {
      return next; 
    }
    
    @Override
    public void solicitudPrestamo(int monto) {
    if (monto<=10000){
    System.out.println("Ganancia del vendedor");
    }else{
    next.solicitudPrestamo(monto);
    }   
    }

    @Override
    public void setNext(Handler aprobador) {
    next = aprobador; 
    } 

 

  

 
}
