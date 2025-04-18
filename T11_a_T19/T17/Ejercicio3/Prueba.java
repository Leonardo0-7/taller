package T17.Ejercicio3;

public class Prueba { 
    public static void Principal(String[] args) {
        Transporte bicicleta = new Bicicleta();
        Transporte coche = new Coche();

        bicicleta.avanzar(); 
        coche.avanzar(); 
    }
}
