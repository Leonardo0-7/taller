package T13.Ejercicio4;

abstract class ClaseAbs {
    public void metodoConcreto() {
        System.out.println("Metodo concreto de la clase abstracta");
    }

    
    public default void metodoPredeterminado() {
        System.out.println("Metodo predeterminado de la clase abstracta");
    }
}

public class PruebaClasesAbstractas {
    public static void Principal(String[] args) {
        ClaseAbs objeto = new ClaseAbs() {
            @Override
            public void metodoConcreto() {
                System.out.println("Metodo concreto sobrescrito");
            }
        };
        objeto.metodoConcreto();
        objeto.metodoPredeterminado(); 
    }
}
