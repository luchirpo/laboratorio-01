import java.util.Scanner;

public class EntradaNumeros {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Edad: ");
int edad = Scanner.nextInt();

System.out.print("Cantidad: ");
int cantidad = Scanner.nextInt();

System.out.print("Precio: ");
double precio = Scanner.nextDouble();


System.out.println(edad);
System.out.println(cantidad);
System.out.println(precio);

Scanner.close();

    }
}