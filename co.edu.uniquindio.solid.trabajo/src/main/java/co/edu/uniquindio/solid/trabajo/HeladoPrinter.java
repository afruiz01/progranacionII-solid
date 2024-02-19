package co.edu.uniquindio.solid.trabajo;

public class HeladoPrinter {
    public void imprimirHelado(Helado helado) {
        System.out.println("Helado: " + helado.getSabor() + ", Precio: " + helado.getPrecio());
    }
}

