import java.util.Scanner;

public class TeoremaPitagoras {
    public void Calcular(){
        double Result;
        
        Scanner TP = new Scanner(System.in);
        System.out.println("Ingrese cateto A");
        double a = TP.nextDouble();
        System.out.println("Ingrese cateto B");
        double b = TP.nextDouble();
        
        Result = Math.sqrt((a*a) + (b*b));
        
        System.out.println("El valor de la Hipotenusa es: " + Result);
    }
}
