package C_6.Practica.P_Parcial;

public class Item {
    private int cantUnidades;
    Articulo articulo ;
    public double calcularImporteParcial(){
        return articulo.getPrecio()*cantUnidades;

    }
}
