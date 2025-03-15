package TallerOcho.Ejercicio3;

// Clase de prueba para las clases Empleado y Gerente
public class Prueba {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Dani Cataño", 5878900);
        empleado1.mostrarDetalles();

        
        Gerente gerente1 = new Gerente("Gabi Morales", 884000, "Sistemas");
        gerente1.mostrarDetalles();
    }
}
