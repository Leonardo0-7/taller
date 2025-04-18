package T12.ejercicio2;

public class Pez implements Nadador, Respirador {
    @Override
    public void nadar() {
        System.out.println("El salmon nada contra la corriente.");
    }

    @Override
    public void respirar() {
        System.out.println("El salmon absorbe oxigeno por las branquias.");
    }
}
