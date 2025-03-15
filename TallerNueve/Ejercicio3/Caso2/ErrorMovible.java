package TallerNueve.Ejercicio3.Caso2;

// Clase incorrecta que implementa una interfaz sin logica relevante
class Casa implements Movible {
    @Override
    public void moverse() {
        //una casa no se mueve
        System.out.println("Las casas no se mueven.");
    }
}