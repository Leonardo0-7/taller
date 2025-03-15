package TallerUno.Ejercicio3;

public class Estudiante {
    
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante() {
        this.nombre = "Desconocido"; 
        this.edad = 0;               
        this.curso = "Desconocido";      
    }
    
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;   
        this.edad = edad;        
        this.curso = "Desconocido";  
    }
 
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);   
        this.curso = curso;     
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + this.nombre);  
        System.out.println("Edad: " + this.edad);      
        System.out.println("Curso: " + this.curso);    
    }

    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarDetalles();

        Estudiante estudiante2 = new Estudiante("Ferlan", 18 );
        estudiante2.mostrarDetalles();
        
        Estudiante estudiante3 = new Estudiante("Eduardo", 22, "Educacion fisica");
        estudiante3.mostrarDetalles(); 
    }
}
