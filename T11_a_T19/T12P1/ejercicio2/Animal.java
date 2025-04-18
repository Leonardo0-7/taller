package T12P1.ejercicio2;

public class Animal implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("::el_criaturaa_esta_volando.::");
    }

    @Override
    public void nadar() {
        System.out.println("::el_criaturaa_esta_nadando.::");
    }
}
