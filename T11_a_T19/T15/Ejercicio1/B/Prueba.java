package T15.Ejercicio1.B;

public class Prueba { 
    public static void Principal(String[] args) { 
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", "44444444"); 
        GeneradorReporte generador = new GeneradorReporte(); 
        PersistenciaLibro persistencia = new PersistenciaLibro(); 

        generador.generarReporte(libro); 
        persistencia.guardar(libro); 
    }
}

