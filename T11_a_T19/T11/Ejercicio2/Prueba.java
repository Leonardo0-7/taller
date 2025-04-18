package T11.Ejercicio2;

public class Prueba {
    public static void Principal(String[] args) {
        Empleado jefazo = new Gerente("Valentina", 28, 4200, 2800);
        jefazo.mostrarDetalles(); 

        Empleado vendedor = new Vendedor("Santiago", 42, 4120, 1600);
        vendedor.mostrarDetalles(); 
    }
}
