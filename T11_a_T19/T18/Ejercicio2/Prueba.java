package T18.Ejercicio2;

public class Prueba {
    public static void Principal(String[] args) {
        Cuenta cuenta = new Cuenta(42000);

        cuenta.transferir(4120, "CuentaDestino124");
        cuenta.retirar(2800);
        cuenta.pagarFactura(7000, "Factura44"); 

        System.out.println("Saldo final: $" + cuenta.getSaldo()); 
    }
}
