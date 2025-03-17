
package ejerciciomasacorporal;
import java.util.Scanner;
public class Ejerciciomasacorporal {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      float kg, mts, imc, x;
      System.out.println("cual es tu peso? (kg) ");
      kg=sc.nextFloat();
      System.out.println("cual es tu altura? (mts) ");
      mts=sc.nextFloat();
      imc=mts*mts;
      x=kg/imc;
      System.out.println("Tu indice de masa corporal es: " +x);
        
    }
       
}
