public class FacturaSimple {
    
    public static void main(String[] args) {
        String NombreProducto = "cuaderno";
        double PrecioUnitario = 20000.0;
        int cantidad = 3;
        double descuento =0.10;
        double PorcentajeImpuesto= 0.02;

        double subtotal= PrecioUnitario *cantidad;
        double valorDescuento= subtotal *descuento;
        double TotalInicial= subtotal - valorDescuento;
        double valorImpuesto = TotalInicial * PorcentajeImpuesto;
        double totalFinal = TotalInicial + valorImpuesto;

        System.out.println("Producto: " +NombreProducto);
        System.out.println("subtotal: " + subtotal);
        System.out.println("Descuento: " +valorDescuento);
        System.out.println("Total: " +TotalInicial);
        System.out.println("Valor Impuesto (2%): " + valorImpuesto);
        System.out.println("Total después de impuestos: " + totalFinal);
    }
}
