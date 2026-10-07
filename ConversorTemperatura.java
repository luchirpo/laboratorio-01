import java.util.Scanner;
public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.print("Grados celsious: ");
        int C = Scanner.nextInt();
        int F= (C *9/5)+32;

        System.out.println("los grados en Fahrenheit equivalen a: "+ F);

        Scanner.close();
    }
}