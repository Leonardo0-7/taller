package TallerCinco.Ejercicio3.Segundaopcion;
public class Prueba {
    public static void main(String[] args) {
        // Crear una instancia de Banco
        Banco banco = new Banco(10000.0);

        // Mostrar el saldo inicial
        banco.mostrarSaldo();

        // Depositar dinero
        banco.depositar(9000.0);
        banco.mostrarSaldo();

        // Intentar retirar dinero
        banco.retirar(4500.0);
        banco.mostrarSaldo();

        // Intentar retirar más dinero del disponible (debería lanzar una excepción)
        try {
            banco.retirar(20000.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Intentar establecer un saldo negativo (debería lanzar una excepción)
        try {
            banco.setSaldo(-5000.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
