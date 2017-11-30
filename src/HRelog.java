import java.util.Scanner;


public class HRelog {
    public void Hora_relog (){
        
        Scanner HT = new Scanner(System.in);
        System.out.print("ingrese la Hora Actual del Relog en formato de 24 hrs: ");
        float a = HT.nextFloat();
        
        System.out.print("Ingrese Numero de horas: ");
        float x = HT.nextFloat();
        
        float Result = (x + a);
        
        System.out.println("Dentro de " + x + " horas, La hora sera: " + Result % 24);
        
    }
}

