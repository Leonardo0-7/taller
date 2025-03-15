package TallerUno.EjercicioFinal;

public class Estudiante {
    private String nombre; 
    private int edad;      
    private String curso; 

    // Constructor por defecto 
    public Estudiante() {
        this.nombre = "Desconocido"; 
        this.edad = 0;               
        this.curso = "Desconocido";     
    }

    // Constructor que acepta nombre y edad como parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre; 
        this.edad = edad;    
        this.curso = "Desconocido"; 
    }

    // Constructor que acepta todos los parametros y utiliza this() para llamar a otro constructor
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso; 
    }

    // Metodo toString() para mostrar los detalles del estudiante
    @Override
    public String toString() {
        return "Estudiante (Nombre =" + nombre + ", Edad =" + edad + ", Curso =" + curso + ")";
    }
}
