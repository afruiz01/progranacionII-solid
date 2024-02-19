package co.edu.uniquindio.solid.trabajo;

public class Helado {
    private String sabor;
    private double precio;

    public Helado(String sabor, double precio) {
        this.sabor = sabor;
        this.precio = precio;
    }

    public String getSabor() {
        return sabor;
    }

    public double getPrecio() {
        return precio;
    }
}


