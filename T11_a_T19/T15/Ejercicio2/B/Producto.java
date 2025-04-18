package T15.Ejercicio2.B;

public 
class Producto { 
    private String alias; 
    private double precioBase;
    private double impuesto;

    public Producto(String alias, double precioBase, double impuesto) { 
        this.alias = alias;
        this.precioBase = precioBase;
        this.impuesto = impuesto;
    }

    public String getNombre() { 
        return alias;
    }

    public double getPrecioBase() { 
        return precioBase;
    }

    public double getImpuesto() { 
        return impuesto;
    }

    public double calPrecioFinal() {
        return precioBase + (precioBase * impuesto);
    }
}

