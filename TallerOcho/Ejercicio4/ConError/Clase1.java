package TallerOcho.Ejercicio4.ConError;

class Clase1 {
    public void metodoA() {
        System.out.println("Método de Clase1");
    }
}

class Clase2 {
    public void metodoB() {
        System.out.println("Método de Clase2");
    }
}


class Clase3 extends Clase1, Clase2 {
    public void metodoC() {
        System.out.println("Método de Clase3");
    }
}