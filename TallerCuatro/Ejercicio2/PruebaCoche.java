package TallerCuatro.Ejercicio2;

public class PruebaCoche {
    public static void main(String[] args) {
        
        Coche coche1 = new Coche();
        System.out.println(coche1); 

        Coche coche2 = new Coche("Ferrari", "F40", 100);
        System.out.println(coche2);
        
         // Intento de acceso directo a las propiedades (esto causaría error)
        System.out.println(coche2.marca);  // ERROR
        System.out.println(coche2.modelo); // ERROR
        System.out.println(coche2.velocidadMaxima); // ERROR
        
        // Usar los métodos get y set para acceder a las propiedades
        coche2.setMarca("Ferrari");
        coche2.setModelo("F40");
        coche2.setVelocidadMaxima(170);

        // Mostrar los detalles modificados del coche
        System.out.println(coche2);

        //Probar el método acelerar
        coche2.acelerar(10);
        System.out.println("Después de acelerar: " + coche2);

        coche2.acelerar(70); 
    }
}