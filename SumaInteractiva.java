import java.util.Scanner;
public class SumaInteractiva {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("digita un numero: ");
        int num1 = Scanner.nextInt();
        System.out.print("digita otro numero: ");
        int num2 = Scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int residuo = num1 % num2;

        System.out.println("suma: " + suma);
        System.out.println("resta: " + resta);
        System.out.println("multiplicacion: " + multiplicacion);
        System.out.println("division: " + division);
        System.out.println("residuo: " + residuo);
        Scanner.close();
    }
    }