
package ejercicios;
  import java.util.Scanner;
public class Ejercicios { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Introduce el ancho del rectangulo:");
        double width = scanner.nextDouble();

        System.out.println("Introduce el largo del rectangulo:");
        double length = scanner.nextDouble();

        double area = width * length;

        System.out.println("El area del rectangulo es: " + area);
        
        
      
        
        
                
    }
    
}
