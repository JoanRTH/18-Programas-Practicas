import java.util.Scanner;
public class Convercion_CmApulgadas {
    
    public void Pulgada(){
        double Cm;
       
        Scanner A = new Scanner(System.in);
        
        System.out.println("Introduce los CM a convertir");
        Cm = A.nextDouble();
        
        System.out.println("Las Pulgadas son: " + (Cm /2.54));
    }
    
}
