package TallerSeis.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
       
        Coche coche1 = new Coche("Ferrari", "F40");
        Coche coche2 = new Coche("Porche", "Taycan");
        Coche coche3 = new Coche("nissan", "gtr");
         
        coche1.mostrarDetalles();
        coche2.mostrarDetalles();
        coche3.mostrarDetalles();

        Coche.mostrarContadorCoches();
    }
}

