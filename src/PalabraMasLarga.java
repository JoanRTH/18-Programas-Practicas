import java.util.Scanner;
import javax.swing.JOptionPane;

public class PalabraMasLarga {

	
	public void palabra(){
            Scanner Es = new Scanner(System.in);
            
            System.out.print("Ingresa la 1er palabra: ");String palabra1 = Es.nextLine();
            
            System.out.print("Ingresa la 2da palabra: ");String palabra2 = Es.nextLine();

		int Cantidad1 = palabra1.length();
		int Cantidad2 = palabra2.length();

		int Result = Math.abs(Cantidad1 - Cantidad2); 

		if(Cantidad1>Cantidad2){
                    JOptionPane.showMessageDialog(null,"La palabra mas larga es: " + palabra1+"\n "+
					"La diferencia de letras es: "+ Result);	
                        
		}else if (Cantidad1==Cantidad2){
                    JOptionPane.showMessageDialog(null,"Las palabras tienen la misma longitud");	
                
		}else{
                    JOptionPane.showMessageDialog(null,"La palabra mas larga es: " + palabra2+"\n "+
					"La diferencia de letras es: "+ Result );}	
	}

}