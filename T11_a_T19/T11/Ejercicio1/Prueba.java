package T11.Ejercicio1;


public class Prueba {
    public static void Principal(String[] args) {
      
        Figura circulo = new Circulo(12);
        circulo.mostrarArea(); 

        Figura rectangulo = new Rectangulo(4, 7);
        rectangulo.mostrarArea(); 
    }
}
