package co.edu.uniquindio.solid.trabajo;

public class HeladoConDescuento implements DescuentoHelado {
    private double descuento;

    public HeladoConDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - descuento;
    }
}
