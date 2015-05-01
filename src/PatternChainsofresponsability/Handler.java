
package PatternChainsofresponsability;

public interface Handler {
  

    public void setNext(Handler aprobador);
    public Handler getNext();
    public void solicitudPrestamo(int monto);
}
