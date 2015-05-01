
package PatternObjectpool;


public class Reusable {

        public void hacer(){
            
            Reusable reusable = ReusablePool.getInstance().acquireReusable();  
            ReusablePool.getInstance().releaseReusable(reusable);
       
        }  

}
