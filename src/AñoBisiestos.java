import java.util.Scanner;
import javax.swing.JOptionPane;

public class AñoBisiestos {
	
	public void Año(){
            Scanner Es = new Scanner(System.in);
            System.out.print("Ingrese un año: ");
            int año = Es.nextInt();
            
           if( año % 4 == 0 )
        	{
        	   JOptionPane.showMessageDialog(null,"El año Es Bisiesto");
        	   
           }else{
        	   JOptionPane.showMessageDialog(null,"El año NO es bisiesto");
           }
        }
}
