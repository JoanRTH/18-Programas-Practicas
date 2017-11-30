import java.util.Scanner;

public class Area_Circulo {
    
    public void Radio(){
       
         Scanner P = new Scanner(System.in);
         System.out.println("Ingrese el Radio del circulo para calcular el area");
         double Radio = P.nextDouble();
         System.out.println("El area es: " + (Radio * Radio) * 3.1416);
    }
    
    public void Perimetro(){
        
        Scanner A = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo para calcular el perimetro");
        double P = A.nextDouble();
        System.out.println("EL perimetro es: " + (2*P) * 3.1416);
    }
}
