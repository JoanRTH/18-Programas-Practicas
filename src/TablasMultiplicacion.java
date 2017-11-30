import java.util.Scanner;

public class TablasMultiplicacion {

	public void Tablitaxd(){
		Scanner Es = new Scanner(System.in);
                
            System.out.println("Ingrese el numero para sacar la Tabla");
            int Mul = Es.nextInt();
            
		for(int i = 1; i<=10; i++){
                    int resultado = Mul*i;
                    System.out.println("Tabla " + Mul + " * " + i + " = "+  resultado);
		}
	}
}
