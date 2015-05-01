
package PatternObjectpool;

import java.util.ArrayList;
import java.util.List;

public class ReusablePool extends Reusable{
    private static ArrayList<Reusable> libre;
    private static ArrayList<Reusable> ocupado;
    
   
    public static ReusablePool getInstance(){
             if (libre.size() != 0)
            {
                ReusablePool po = new ReusablePool();
                ocupado.add(po);
                libre.remove(0);
                return po;
            }
            else
            {
                ReusablePool po = new ReusablePool();
                libre.add(po);
                return po;
            }
        
    }
    
    public Reusable acquireReusable(){
            return new Reusable();
    }
    
    public void releaseReusable(Reusable reusable){
    libre.add(reusable);
    ocupado.add(reusable);
  
    }

    

   
}
