package T15.Ejercicio3.B;

public class ServicioValidacion { 

    public boolean validarContraseña(Usuario cliente) { 
        String contraseña = cliente.getContraseña();
        return contraseña.length() >= 6 && contraseña.matches(".*\\d.*") && contraseña.matches(".*[a-zA-Z].*");
    }
}

