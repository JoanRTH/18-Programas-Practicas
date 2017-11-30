
import java.util.Scanner;

public class Promedio {
    
    public void notas() {
       int B, A;
        
        int Result = 0;
        Scanner En = new Scanner(System.in);
        
        System.out.println("Cuantas Calificaciones son");
        B = En.nextInt();
       
        for (int i = 0; i < B; i++){
            System.out.print("Ingrese Calif. " + (i+1) + ": ");
            A = En.nextInt();
            Result = Result + A;
        }
        System.out.println("El Promedio es: " + (Result / B));
    }
}
