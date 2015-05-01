
package electiva1;

import java.util.Scanner;

public class Ejercicio36Loopendeingandremembering {
    public static void main(String args[]){
    
Scanner teclado = new Scanner(System.in);    
System.out.println("Type numbers : ");
      int suma=0;
      int i=1;
      int b=1,c=1;
      int d=0; 
      while(true){
     
          int numeros= Integer.parseInt(teclado.nextLine());
          if(numeros>0||i<=numeros){
          suma=suma+numeros;
          i++;
          } else{
          System.out.println("Thank you and see you later");    
          System.out.println("The sum is: "+suma);
        System.out.println("How many numbers: "+(i-1));
          float promedio= (float)suma/(i-1);
          System.out.println("Average: "+promedio);
          break;
                }
         if (numeros<0){
         break;
         }
         if(numeros%2==0){
         System.out.println("Numero pares"+b);  
         b++;
                }else{
             System.out.println("Numero impares"+c);
         c++;
                }     
                }       
                }
    
    
}
