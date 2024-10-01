public class Tienda {

    public double precio;
    // Si prestamos atencion, este atributo no se emplea
    public double descuento;

    public Tienda(double precio){
        this.precio = precio;
    }

    public double calcularDescuento(){
        double precioFinal = this.precio;
        if(this.precio > 100){
            precioFinal = this.precio * 0.9;
        }
        return precioFinal;
    }

}
