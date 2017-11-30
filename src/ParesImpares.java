import java.util.Scanner;

public class ParesImpares {
    public void Checa (){
        Scanner Ob = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int No = Ob.nextInt();
        
        if ((No % 2 ) ==0){ System.out.println("El numero " + No + " Es par ");}
            else{ System.out.println("El numero " + No + " Es impar ");}
    }
}
