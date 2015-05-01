
package PatternChainsofresponsability;

public class Negocio implements Handler{
    private Handler next; 

 
    @Override
    public Handler getNext() {
     return next;        
    }

    @Override
    public void solicitudPrestamo(int monto) {
        AgregarNumero vendedor=new AgregarNumero();
        this.setNext(vendedor);
        
        Accionnumero2 lider=new Accionnumero2();
        this.setNext(lider);
        
        
        AccionNumero3 ejecutivo=new AccionNumero3();
        this.setNext(ejecutivo);
        
        AccionNumero4 gerente=new AccionNumero4();
        this.setNext(gerente);
        
        next.solicitudPrestamo(monto);
    }

       @Override
    public void setNext(Handler aprobador) {
       next = aprobador; 
    }

   
    }


   
    
    

