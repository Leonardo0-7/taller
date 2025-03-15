package TallerTres;

// Clase Producto con modificador de acceso de paquete (default)
class Producto {
    String nombre;
    double precio;
    int stock;

    // Constructor con acceso de paquete
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Metodo para mostrar la información del producto
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Precio: " + precio + ", Stock: " + stock);
    }
}

// Clase de prueba dentro del mismo paquete
class TestProducto {
    public static void main(String[] args) {
        Producto p = new Producto("Computadora", 4000000.00, 50 );
        p.mostrarInfo(); // Acceso permitido dentro del mismo paquete
    }
}
