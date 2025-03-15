package TallerCuatro2.Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        Utilidades utilidades = new Utilidades(); 

        double suma = utilidades.sumar(8, 5);
        System.out.println("Suma de 8 y 5: " + suma); 

        double resta = utilidades.restar(23, 14);
        System.out.println("Resta de 23 y 14: " + resta);

        double multiplicacion = utilidades.multiplicar(22, 2);
        System.out.println("Multiplicacion de 22 y 2: " + multiplicacion); 

        double division = utilidades.dividir(96, 3);
        System.out.println("Division de 96 y 3: " + division);

        double divisionPorCero = utilidades.dividir(3, 0);
        System.out.println("Division de 3 y 0: " + divisionPorCero); 
    }
}