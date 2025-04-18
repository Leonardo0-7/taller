package T19.Ejercicio4;

public class ReportePDF implements GeneradorReporte { 
    @Override
    public void generarReporte(String contenido) {
        System.out.println("Generando reporte en PDF con el contenido: " + contenido);
    }
}
