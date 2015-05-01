
package PatternFactory;

public class Factory {
    
    public  Producto CreateProduct(int tipo){
    if (tipo==0){
        return new ConcreteProduct();    
    }
    if (tipo==1){
     return new ConcreteProduct2(); 
    }
    if (tipo==2){
     return new ConcreteProduct3(); 
    }
  
     return null;
}
}