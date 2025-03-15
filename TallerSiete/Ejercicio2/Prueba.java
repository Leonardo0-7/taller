package TallerSiete.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Rodolfo", 25, 5000, 4000);
        gerente.mostrarDetalles(); 

        Empleado vendedor = new Vendedor("Palmer", 20, 447000, 45500);
        vendedor.mostrarDetalles(); 
    }
}
