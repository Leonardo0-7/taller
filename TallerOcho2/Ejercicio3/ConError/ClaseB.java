package TallerOcho2.Ejercicio3.ConError;

public class ClaseA {
    public void metodoA() {
        System.out.println("Método de ClaseA");
    }
}

public class ClaseB {
    public void metodoB() {
        super.metodoA(); 
    }

    public static void main(String[] args) {
        ClaseB claseB = new ClaseB();
        claseB.metodoB();
    }
}
