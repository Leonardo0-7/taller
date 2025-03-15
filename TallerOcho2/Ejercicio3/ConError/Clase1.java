package TallerOcho2.Ejercicio3.ConError;

public class Clase1 {
    public void metodoA() {
        System.out.println("Método de Clase1");
    }
}

public class Clase2{
    public void metodo2() {
        super.metodoA(); 
    }

    public static void main(String[] args) {
        Clase2 clase2 = new Clase2();
        clase2.metodo2();
    }
}
