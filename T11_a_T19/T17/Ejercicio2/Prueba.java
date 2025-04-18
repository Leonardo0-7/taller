package T17.Ejercicio2;

public class Prueba { 
    public static void Principal(String[] args) { 
        CuentaBancaria cuentaAhorros = new CuentaAhorros(1600, 0.07); 
        cuentaAhorros.depositar(1200); 
        cuentaAhorros.retirar(400); 

        ((CuentaAhorros) cuentaAhorros).aplicarInteres(); 

        System.out.println("Saldo final: " + cuentaAhorros.getSaldo()); 
    }
}
