public class CalculoCompra {

    public static void main(String[] args) {
        double precio = 250000.0;
        int cantidad = 4;
        double porcentajeDescuento = 0.15;

        double subtotal = precio * cantidad;
        double descuento = subtotal * porcentajeDescuento;
        double total = subtotal - descuento;

        System.out.println("Precio unitario: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total: $" + total);
    }
}
