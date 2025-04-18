package T19.Ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {

    @Override
    public boolean autenticar(String cliente, String contraseña) {
        
        if ("usuarioLocal".equals(cliente) && "contraseñaLocal".equals(contraseña)) {
            return true; 
        }
        return false; 
    }
}

