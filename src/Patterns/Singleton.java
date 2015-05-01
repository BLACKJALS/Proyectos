
package Patterns;

public class Singleton {
    private static Singleton instance;
    
    public static void main (String args[]){
    getInstance();
    }
    
    public static Singleton getInstance(){
        if (instance==null){
        instance=new Singleton();       
        System.out.println(instance);
        }
        return instance;
    } 
    
    private Singleton(){
    
    }
    
//    static{
//    instance=new Singleton();
//   // System.out.println(instance);
//    }
//    
    
}