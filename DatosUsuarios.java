import java.util.Scanner;
public class DatosUsuarios {

    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);

        System.out.print("nombre: ");
        String nombre= Scanner.nextLine();

        System.out.print("Ciudad: ");
        String Ciudad= Scanner.nextLine();

        System.out.print("Edad: ");
        int Edad= Scanner.nextInt();

        System.out.print("cursos Terminados: ");
        int Cursos= Scanner.nextInt();


        System.out.println("--------------------------------" );
        System.out.println("Nombre: " +nombre );
        System.out.println("ciudad: " +Ciudad );
        System.out.println("Edad: " +Edad );
        System.out.println("Cursos terminados: " +Cursos);

        Scanner.close();




    }
}