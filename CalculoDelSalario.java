
package calculo.del.salario;
import java.util.Scanner;
public class CalculoDelSalario {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       double d,monto,s;
       System.out.println("Ingresa sueldo");
       s = sc.nextDouble();
       if(s>2000){
           d=100+(s-1000)*0.03;
           monto=s-d;
       }else{
           if(s>1000 && s<=2000){
               d=100+(s-1000)*0.05;
               monto=s-d;
           }else{
               d=s*0.1;
               monto=s-d;
           }
       }
      System.out.println( "El sueldo percibido es " +monto + "  y su descuento fue " + d);
        }
        
    }
    

