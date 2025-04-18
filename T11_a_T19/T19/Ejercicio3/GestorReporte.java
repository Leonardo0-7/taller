package T19.Ejercicio4;

public class GestorReporte { 
    private GeneradorReporte generadorReporte; 

    public GestorReporte(GeneradorReporte generadorReporte) { 
        this.generadorReporte = generadorReporte;
    }

    public void generar(String contenido) { 
        generadorReporte.generarReporte(contenido); 
    }
}