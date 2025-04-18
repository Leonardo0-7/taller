package T11.Ejercicio2;

public class Gerente extends Empleado {
    private double salarioBase;
    private double bono;

    public Gerente(String alias, int anios, double salarioBase, double bono) {
        super(alias, anios);
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}
