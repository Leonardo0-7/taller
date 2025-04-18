package T15.Ejercicio3.B;

public class ServicioAutenticacion { 

    public boolean autenticar(Usuario cliente, String nombreUsuario, String contraseña) {  
        return cliente.getNombreUsuario().equals(nombreUsuario) && cliente.getContraseña().equals(contraseña);
    }
}

