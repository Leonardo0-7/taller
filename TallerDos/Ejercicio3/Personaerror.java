package TallerDos.Ejercicio3;

class Persona {
    private String nombre;

    // Metodo estático con un uso incorrecto de this
    public static void mostrarNombre() {
        System.out.println(this.nombre); // Error, No se puede usar this en un metodo estatico
    }
}