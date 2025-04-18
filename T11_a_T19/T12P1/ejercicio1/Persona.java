package T12P1.ejercicio1;

public class Persona implements Hablador, Trabajador {
    @Override
    public void hablar() {
        System.out.println("::la_persona_esta_hablando.::");
    }

    @Override
    public void currar() {
        System.out.println("::la_persona_esta_trabajando.::");
    }
}
