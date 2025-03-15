package TallerDiez.Ejercicio3;

interface Hablador {
    void hablar(); // Método abstracto
}

public class Persona implements Hablador {
    
    public void hablar() {
    System.out.println("Hablando");
    }

    // Constructor
    public Persona() {
        System.out.println("Se ha creado una instancia de Persona");
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.hablar();
    }
}

