import java.util.Scanner;
import javax.swing.JOptionPane;
public class SumaNumerosIntermedios {
    
	public void Sumainter(){
            Scanner Es = new Scanner(System.in);
            
            System.out.print("Ingrece un nmero: ");
            int n1 = Es.nextInt();
            System.out.print("Ingrece un nmero: ");
            int n2 = Es.nextInt();
            
		int suma=0;
		for ( int i=n1+1; i<n2; i++ )
		{
			suma =suma + i;	
		}
		JOptionPane.showMessageDialog(null,"La suma que hay entre "+ n1 +" y "+  n2 +" es: \n" + suma);
	}
}



