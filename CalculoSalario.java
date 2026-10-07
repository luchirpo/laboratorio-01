public class CalculoSalario {
    
    public static void main(String[] args) {
        
        String nombreTrabajador ="Luis castellanos";
        int horastrabajadas = 8;
        double valorxhora= 50000.0;
        final double APORTE = 0.04;

        double totalpago = horastrabajadas * valorxhora;
        double valoraporte= totalpago*APORTE;

        System.out.println("nombe: "+nombreTrabajador);
        System.out.println("horas trabajadas: " + horastrabajadas);
        System.out.println("valor por hora: "+valorxhora);
        System.out.println("pago  total: "+ totalpago);
        System.out.println("Aporte(4%): " +valoraporte);

        int unidades = 4;
double precio = 25000.0;
double descuento = 0.20;

double subtotal = unidades * precio;
double valorDescuento = subtotal * descuento;
double total = subtotal - valorDescuento;

System.out.println(valorDescuento);
System.out.println(total);




    }

}
