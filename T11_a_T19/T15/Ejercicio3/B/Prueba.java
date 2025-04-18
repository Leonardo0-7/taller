package T15.Ejercicio3.B;

public class Prueba { 
    public static void Principal(String[] args) {
        Usuario cliente = new Usuario("usuario1", "contrasena");  
        ServicioAutenticacion servicioAutenticacion = new ServicioAutenticacion(); 
        ServicioValidacion servicioValidacion = new ServicioValidacion(); 

        boolean esAutenticado = servicioAutenticacion.autenticar(cliente, "usuario1", "contrasena"); // Auteeeentica eel clieentee
        boolean esContraseñaValida = servicioValidacion.validarContraseña(cliente); 

        System.out.println("Autenticado: " + esAutenticado); 
        System.out.println("Contraseña válida: " + esContraseñaValida);
    }
}
