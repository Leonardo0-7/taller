package TallerCuatro2.Ejercicio1;


public class Prueba {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Olga Salgao", 52700);

        
        System.out.println("Nombre: " + empleado1.nombre);

       
        System.out.println("Salario: " + empleado1.getSalario());

        
        empleado1.setSalario(6000);
        System.out.println("Nuevo Salario: " + empleado1.getSalario());

        
        empleado1.setSalario(-3000);
        System.out.println("Salario después de intento erroneo: " + empleado1.getSalario());
    }
}
