package T17.Ejercicio1;

public class Prueba { 
    public static void Principal(String[] args) { 
        Figura circulo = new Circulo(12); 
        Figura rectangulo = new Rectangulo(8, 6);

        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
    }
}
