import javax.swing.JOptionPane;
import java.util.Scanner;

public class Program {
    public static void main (String [] na){
        int A = 0;
        
        do{
            try {
                A = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Area y Perimetro de Circulo\n"
                                + "2. Promedio de cuatro notas\n"
                                + "3. Comvecion de CM a Pulgadas\n"
                                + "4. Invierte un Numero de 3 digitos\n"
                                + "5. Calcula Hipotenusa\n"
                                + "6. Saber las Horas del relog\n"
                                + "7. Debuelve parte decimales\n"
                                + "8. Numeros Par o impar\n"
                                + "9. Division Exacta o no\n"
                                + "10. Para ver que palabra es mas Larga\n"
                                + "11. Tablas de multiplicar\n"
                                + "12. Para ver si un año es bisiesto o no\n"
                                + "13. Para ver si lo ingresado es caracter o letra\n"
                                + "14. Tipos de Triangulo\n"
                                + "15. Suma los Numeros Intermedios\n"
                                + "16. \n"
                                + "19. Salir\n"
                                + "Elige una opción...",
                        "Árboles binarios",JOptionPane.QUESTION_MESSAGE));
                
               switch (A){
                    case 1:
                        Area_Circulo B = new Area_Circulo();
                        B.Radio();
                        B.Perimetro();
                        break;
                        
                    case 2:
                        Promedio C = new Promedio();
                        C.notas();
                        break;
                        
                    case 3:
                       Convercion_CmApulgadas CO = new Convercion_CmApulgadas();
                       CO.Pulgada();
                        break;
                        
                    case 4:
                        Dinversos D = new Dinversos();
                        Scanner dx = new Scanner(System.in);
                        System.out.print("Ingrese un Numero: ");
                        int Pr = dx.nextInt();
                        System.out.println("El Digito invertido es: " + D.inv(Pr));
                        break;
                        
                    case 5:
                        TeoremaPitagoras E = new TeoremaPitagoras();
                        E.Calcular();
                        break;
                        
                    case 6:
                        HRelog F = new HRelog();
                        F.Hora_relog();
                        break;
                        
                    case 7:
                        ParteDec G = new ParteDec();
                        G.Decimales();
                        break;
                        
                    case 8:
                        ParesImpares H = new ParesImpares();
                        H.Checa();
                        break;
                        
                    case 9:
                        DivisionExacta_NoExacta I = new DivisionExacta_NoExacta();
                        I.dividir();
                        break;
                        
                    case 10:
                        PalabraMasLarga J = new PalabraMasLarga();
                        J.palabra();
                        break;
                        
                    case 11:
                        TablasMultiplicacion K = new TablasMultiplicacion();
                        K.Tablitaxd();
                        break;
                        
                    case 12:
                        AñoBisiestos L = new AñoBisiestos();
                        L.Año();
                        break;
                        
                    case 13:
                        CaracterOLetra M = new CaracterOLetra();
                        M.Determinar();
                        break;
                        
                    case 14:
                        TiposDTriangulo N = new TiposDTriangulo();
                        N.tipotriangulo();
                        break;
                        
                    case 15:
                        SumaNumerosIntermedios O = new SumaNumerosIntermedios();
                        O.Sumainter();
                        break;
                        
                    case 19:
                        JOptionPane.showMessageDialog(null, "Aplicación finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta","Reintente",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;

                }
            } catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null,"Error " + n.getMessage());
            }
        } while(A!=19);
        
    }
}

