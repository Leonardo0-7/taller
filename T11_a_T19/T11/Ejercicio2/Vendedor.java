package T11.Ejercicio2;

public class Vendedor extends Empleado {
    private double salarioBase;
    private double comision;

    public Vendedor(String alias, int anios, double salarioBase, double comision) {
        super(alias, anios);
        this.salarioBase = salarioBase;
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comision;
    }
}
