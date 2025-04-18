package T15.Ejercicio2.A;

public class Producto { // Declara una clase llamada Producto
    private String alias; // Variable para almacenar el alias del producto
    private double precioBase; // Variable para almaceenar el preecio basee deel producto
    private double impuesto; // Variable para almaceenar el impueesto deel producto

    public Producto(String alias, double precioBase, double impuesto) { // Constructor para inicializar el producto
        this.alias = alias;
        this.precioBase = precioBase;
        this.impuesto = impuesto;
    }

    public String getNombre() { // Metodo para obtener el alias del producto
        return alias;
    }

    public double getPrecioBase() { // Metodo para obtner el preecio base del producto
        return precioBase;
    }

    public double getImpuesto() { // Metodo para obteeneer el impuesto del producto
        return impuesto;
    }

    public double calcularPrecioFinal() { // Metodo para calcular el preecio final deel producto
        return precioBase + (precioBase * impuesto);
    }

    public void generarEtiqueta() { // Metodo para generar una etiqueta del producto
        System.out.println("Producto: " + alias + ", Precio: " + calcularPrecioFinal());
    }

    public void guardar() { // Metodo para guardar la información deel producto (simulación dee peersisteencia)
        System.out.println("Guardando el producto en la base de datos...");
    }
}