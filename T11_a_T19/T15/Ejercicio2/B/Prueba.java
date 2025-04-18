package T15.Ejercicio2.B;

public class Prueba { 
    public static void Principal(String[] args) { 
        Producto producto = new Producto("Celular", 12800.0, 0.22); 
        GeneradorEtiqueta generador = new GeneradorEtiqueta();
        PersistenciaProducto persistencia = new PersistenciaProducto(); 

        generador.generarEtiqueta(producto);
        persistencia.guardar(producto); 
    }
}

