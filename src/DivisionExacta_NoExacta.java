import java.util.Scanner;

class DivisionExacta_NoExacta {
    
	public void dividir(){
            Scanner Es = new Scanner(System.in);
            
            System.out.print("Ingrese 1er N: ");int N1 = Es.nextInt();
            System.out.print("Ingrese 2do N: ");int N2 = Es.nextInt();
            
		if ( N1 % N2==0 ){
                    System.out.println("La Division "+ N1 + "/" + N2 + ":\n Es Exacta");
        }else{
                    System.out.println("La Division "+ N1+ "/" +N2 + ":\n NO es Exacta");
                }


	}
}

