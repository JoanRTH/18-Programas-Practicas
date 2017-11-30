import java.util.Scanner;
import javax.swing.JOptionPane;

public class TiposDTriangulo {
    
	public void tipotriangulo(){
            Scanner es = new Scanner(System.in);
            System.out.println("Ingrece L1 del Triangulo");
            double L1 = es.nextDouble();
            System.out.println("Ingrece L2 del Triangulo");
            double L2 = es.nextDouble();
            System.out.println("Ingrece L3 del Triangulo");
            double L3 = es.nextDouble();
            
		if (L1==L2 && L2==L3){
                    JOptionPane.showMessageDialog(null,"Triangulo Equilatero");
                    
		}else if(L1==L2 || L1==L3 || L2==L3){
                    JOptionPane.showMessageDialog(null,"Triangulo Isosceles");
                    
		}else if(L1!=L2 || L1!=L3 || L3!=L2){
                    JOptionPane.showMessageDialog(null,"Es un Trinagulo Escaleno");
                    
		}else{
                    JOptionPane.showMessageDialog(null,"Triangulo es Invalido");}
	}
}

