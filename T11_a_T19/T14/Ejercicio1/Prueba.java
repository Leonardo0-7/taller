package T14.Ejercicio1;

public class Prueba { 
    public static void Principal(String[] args) { 
        Figura figura1 = new Circulo(7); 
        Figura figura2 = new Rectangulo(12, 7);

        figura1.calcularArea();
        figura2.calcularArea(); 
    }
}