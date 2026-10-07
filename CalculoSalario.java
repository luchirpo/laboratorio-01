import java.util.Scanner;
public class CalculoSalario {
    
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombreTrabajador = Scanner.nextLine();
        
        System.out.print("Horas Trabajadas: ");
        int horastrabajadas = Scanner.nextInt();

        System.out.print("ValorXHora: ");
        double valorxhora= Scanner.nextDouble();

        double totalpago = horastrabajadas * valorxhora;

        System.out.println("nombe: "+nombreTrabajador);
        System.out.println("horas trabajadas: " + horastrabajadas);
        System.out.println("valor por hora: "+valorxhora);
        System.out.println("pago  total: "+ totalpago);

Scanner.close();
    }

}
