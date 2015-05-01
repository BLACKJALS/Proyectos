
package PatternChainsofresponsability;

public class AccionNumero3 implements Handler {
private Handler next; 

    @Override
    public Handler getNext() {
     return next;   
    }

    @Override
    public void solicitudPrestamo(int monto) {
       if(monto>50000&&monto<=100000){
       System.out.println("Ganancias para el presidente");
       }else{       
       next.solicitudPrestamo(monto);
       } 
    }
  
    @Override
    public void setNext(Handler succesor) {
    next=succesor;
    }
    
}
