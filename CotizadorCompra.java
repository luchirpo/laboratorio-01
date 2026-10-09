import java.util.Scanner;   
public class CotizadorCompra {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);

        System.out.print("Nombre: ");
        String NombreCliente =Scanner.nextLine();

        System.out.print("Producto: ");
        String NombreProducto= Scanner.nextLine();

        System.out.print("Precio X Unidad: ");
        double PrecioUnitario= Scanner.nextDouble();

        System.out.print("Cantidad: ");
        int Cantidad = Scanner.nextInt();

        System.out.print("Descuento: ");
        int PorcentajeDescuento = Scanner.nextInt();

        System.out.print("Impuesto: ");
        int PorcentajeImpuesto = Scanner.nextInt();

        System.out.print("Costo envio: ");
        int CostoEnvio= Scanner.nextInt();
        Scanner.nextLine();

        System.out.print("Nombre del vendedor: ");
        String NombreVendedor= Scanner.nextLine();

        System.out.print("Codigo cotizacion: ");
        String CodigoCotizacion= Scanner.nextLine();

        double subtotal= PrecioUnitario *Cantidad;
        double valorDescuento= subtotal* (PorcentajeDescuento/100.0);
        double BaseDescuento= subtotal-valorDescuento;
        double ValorImpuesto= BaseDescuento * (PorcentajeImpuesto/100.0);
        double Total= BaseDescuento+ValorImpuesto;
        double Envio= Total* (CostoEnvio/100.);
        double Totalfinal= Total+Envio;
        

        System.out.println("cliente: "+NombreCliente);
        System.out.println("Producto: "+ NombreProducto);
        System.out.println("Precio: "+ PrecioUnitario);
        System.out.println("Cantidad: "+Cantidad);
        System.out.println("Subtotal: "+ subtotal);
        System.out.println("Descuento: "+ valorDescuento);
        System.out.println("Base: "+ BaseDescuento);
        System.out.println("Impuesto: "+ValorImpuesto);
        System.out.println("Total: "+Total);
        System.out.println("Costo envio: "+ Envio);
        System.out.println("Nombre Vendedor: "+ NombreVendedor);
        System.out.println("Total mas envio: "+ Totalfinal);
        System.out.println("Codigo: "+CodigoCotizacion);


        Scanner.close();



    }
}