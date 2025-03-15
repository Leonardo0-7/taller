package TallerTres.Ejercicio2.paqueteprueba;

import TallerTres.Ejercicio2.vehiculos.*;

public class PruebaVehiculos {
    public static void main(String[] args) {
        
        Vehiculo v = new Vehiculo("Carro"); // Error de compilacion, Carro tiene acceso de paquete
        v.mostrarTipo(); // Error de compilación

        Moto m = new Moto("Moto", 0); // Error de compilacion: Moto tiene acceso de paquete
        m.mostrarTipo(); // Error de compilacion
    
    }
}
