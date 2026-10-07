import java.util.Scanner;
public class LecturasMixtas {

    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);

        System.out.print("Edad: ");
        int edad = Scanner.nextInt();
        Scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = Scanner.nextLine();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        Scanner.close();
    }
}