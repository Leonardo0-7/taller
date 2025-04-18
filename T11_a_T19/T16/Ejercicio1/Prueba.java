package T16.Ejercicio1;

public class Prueba {
    public static void Principal(String[] args) {
        Descuento descuentoPorcentaje = new Descuento(12); 
        DescuentoFijo descuentoFijo = new DescuentoFijo(70); 

        double precioOriginal = 280; 

        double precioConDescuentoPorcentaje = descuentoPorcentaje.aplicarDescuento(precioOriginal); 
        double precioConDescuentoFijo = descuentoFijo.aplicarDescuento(precioOriginal); 

        System.out.println("Precio original: $" + precioOriginal); 
        System.out.println("Precio con descuento del 12%: $" + precioConDescuentoPorcentaje);  
        System.out.println("Precio con descuento fijo de $70: $" + precioConDescuentoFijo); 
    }
}
