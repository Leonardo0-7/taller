package TallerOcho.Ejercicio2;

// Clase de prueba para las clases Persona y Estudiante
public class Prueba {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Fabian", 42);
        persona1.mostrarInformacion();

        Estudiante estudiante1 = new Estudiante("Matias", 54, "POE434");
        estudiante1.mostrarInformacion();
    }
}

