package TallerSeis.Ejercicio2;


public class Prueba {
    public static void main(String[] args) {
        double suma = Matematicas.sumar(3, 4);
        System.out.println("Suma de 3 y 4: " + suma);

        double resta = Matematicas.restar(4, 4);
        System.out.println("Resta de 4 y 4: " + resta); 

        double multiplicacion = Matematicas.multiplicar(1, 1);
        System.out.println("Multiplicación de 1 y 1: " + multiplicacion); 

        double division = Matematicas.dividir(80, 2);
        System.out.println("División de 80 y 2: " + division); 

        double divisionPorCero = Matematicas.dividir(7, 0);
        System.out.println("División de 7 y 0: " + divisionPorCero);
    }
}
