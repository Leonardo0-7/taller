package T11.Ejercicio3.A;

abstract class ClaseAbstracta {
    public void metodoConcreto() {
        System.out.println("Método concreto de la clase abstracta");
    }

    public abstract void metodoAbstracto();
}

public class Prueba {
    public static void Principal(String[] args) {
        
        ClaseAbstracta objeto = new ClaseAbstracta();
    }
}

