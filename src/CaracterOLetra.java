import java.util.Scanner;
 import javax.swing.JOptionPane;
 
public class CaracterOLetra {
   

	public void Determinar(){
            Scanner Es = new Scanner(System.in);
            System.out.print("Ingrese Una letra, palabra o caracter: ");
            String obtener = Es.nextLine();
            
		if (obtener.charAt(0)>=48&&obtener.charAt(0)<=57)
		{
			JOptionPane.showMessageDialog(null,"Es un Numero");
		}else if(obtener.charAt(0)>=65&&obtener.charAt(0)<=90){
			
			JOptionPane.showMessageDialog(null,"La letra es MAYUSCULA");
		}else if(obtener.charAt(0)>=97&&obtener.charAt(0)<=122){
			
			JOptionPane.showMessageDialog(null,"La letra es minuscula");
		}else{
			
			JOptionPane.showMessageDialog(null,"No es Numero ni Letra");}
	}
}

