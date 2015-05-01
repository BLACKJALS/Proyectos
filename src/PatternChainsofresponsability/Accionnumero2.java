
package PatternChainsofresponsability;


public class Accionnumero2 implements Handler{
   private Handler next;
    
    
      @Override
    public Handler getNext() {
        return next;
    }
   
    @Override
    public void solicitudPrestamo(int monto) {
    if(monto>10000&&monto<=50000){
    System.out.println("Ganancias de jefe");
    }else{
    next.solicitudPrestamo(monto);
    } 
    }

 

    @Override
    public void setNext(Handler aprobador) {
    next =aprobador;   
    }
    
}
