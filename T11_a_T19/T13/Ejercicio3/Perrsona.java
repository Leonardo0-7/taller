package T13.Ejercicio4;

interface Hablador {
    void hablar(); // Mtodo abstracto
}

public class Perrsona implements Hablador {
    
    public void hablar() {
    System.out.println("Hablando");
    }

    // Constructor
    public Perrsona() {
        System.out.println("Se ha creado una instancia de Perrsona");
    }

    public static void Principal(String[] args) {
        Perrsona persona = new Perrsona();
        persona.hablar();
    }
}

