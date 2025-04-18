package T19.Ejercicio1;

public class Prueba { 
    public static void Principal(String[] args) { 
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal(); 
        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth(); 

        GestorAutenticacion gestorLocal = new GestorAutenticacion(autenticacionLocal); 
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(autenticacionOAuth); 

        System.out.println("Autenticacion Local: " + gestorLocal.autenticarUsuario("usuarioLocal", "contraseñaLocal")); // Prueeeeba dee auteenticación local
        System.out.println("Autenticacion OAuth: " + gestorOAuth.autenticarUsuario("usuarioOAuth", "contraseñaOAuth")); // Prueeeeba dee auteenticación OAuth
    }
}

