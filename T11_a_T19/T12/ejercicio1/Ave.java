package T12.ejercicio1;

public class Ave implements Volador, Cantante {
    @Override
    public void volar() {
        System.out.println("El gorrion planea rapido.");
    }

    @Override
    public void cantar() {
        System.out.println("El gorrion trina suavemente.");
    }
}
