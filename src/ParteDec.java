import java.util.Scanner;

public class ParteDec {
    public void Decimales(){
        
        Scanner X = new Scanner(System.in);
        int PE;
        double PD;
        System.out.print("Introduce un Numero Real: ");
        double NR = X.nextDouble();
       
        PE = (int) NR;
        PD = NR - PE;
        
        System.out.println("la parte decimal es: " + PD);
    }
}