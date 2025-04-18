package T19.Ejercicio1;

public class GestorAutenticacion { 
    private ServicioAutenticacion servicioAutenticacion; 

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) { 
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public boolean autenticarUsuario(String cliente, String contraseña) { 
        return servicioAutenticacion.autenticar(cliente, contraseña); 
    }
}
