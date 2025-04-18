package T14.Ejercicio4;

public class Prueba { 
    public static void Principal(String[] args) { 
        Vehiculo miCoche = new Coche(); 
        Vehiculo miBicicleta = new Bicicleta(); 

        miCoche.avanzar();
        miBicicleta.avanzar(); 
    }
}
