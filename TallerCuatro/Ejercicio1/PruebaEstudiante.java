package TallerCuatro.Ejercicio1;

public class PruebaEstudiante {
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante();
        System.out.println(estudiante1); 
        
        Estudiante estudiante2 = new Estudiante("Doku", 21, 3.0);
        System.out.println(estudiante2); // Mostrar detalles del estudiante

        
        estudiante2.setNombre("Mikaela");
        estudiante2.setEdad(18);
        estudiante2.setNotaPromedio(4.1);

        
        System.out.println(estudiante2);
    }
}
