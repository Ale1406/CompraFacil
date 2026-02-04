package P_Parcial;

public class Item {
// Atributos
    private int cantUnidades;
    Articulo articulo ;

// Constructor
    public Item(int cantUnidades, Articulo articulo) {
        this.cantUnidades = cantUnidades;
        this.articulo = articulo;
    }

// Metodos
    public double calcularImporteParcial(){
        return articulo.getPrecio() * cantUnidades;
    }

    public int getCantUnidades() {
        return cantUnidades;
    }

    public Articulo getArticulo() {
        return articulo;
    }
}
