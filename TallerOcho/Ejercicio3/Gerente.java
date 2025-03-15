package TallerOcho.Ejercicio3;


public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); 
        this.departamento = departamento; 
    }

    // Método para mostrar los detalles del gerente
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}