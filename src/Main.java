public class Main {
    public static void main(String[] args) {
        double precioOriginal = 200;
        Tienda tienda = new Tienda(precioOriginal);
        double precioFinal = tienda.calcularDescuento();
        System.out.println("Precio inicial vs final: "+precioOriginal+" - "+precioFinal);
    }
}