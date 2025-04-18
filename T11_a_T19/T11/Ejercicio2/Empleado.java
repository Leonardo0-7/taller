package T11.Ejercicio2;


public abstract class Empleado {
    private String alias;
    private int anios;

    public Empleado(String alias, int anios) {
        this.alias = alias;
        this.anios = anios;
    }

    public abstract double calcularSalario();

    public void mostrarDetalles() {
        System.out.println("Alias: " + alias);
        System.out.println("Anios: " + anios);
        System.out.println("Pago mensual: $" + calcularSalario());
    }
}
