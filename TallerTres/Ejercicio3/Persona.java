package TallerTres.Ejercicio3;

// Clase Persona con atributos private y de paquete (default)
class Persona {
    private String nombre; // Solo accesible dentro de la clase
    int edad; // Acceso de paquete

    // Constructor
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getter y setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
