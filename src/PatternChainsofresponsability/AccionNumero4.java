
package PatternChainsofresponsability;


public class AccionNumero4 implements Handler{
  private Handler next;
   
    @Override
    public Handler getNext() {
        return next;
    }

    @Override
    public void solicitudPrestamo(int monto) {
       if (monto>100000){
       System.out.println("this is my");
       }
    }
    
     @Override
    public void setNext(Handler aprobador) {
      next = aprobador;
    }

}
