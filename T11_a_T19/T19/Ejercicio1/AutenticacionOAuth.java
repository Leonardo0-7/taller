package T19.Ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {

    @Override
    public boolean autenticar(String cliente, String contraseña) {
        
        if ("usuarioOAuth".equals(cliente) && "contraseñaOAuth".equals(contraseña)) {
            return true; 
        }
        return false; 
    }
}

