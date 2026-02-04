package modelo;

public class Articulo {

    private String nombre;
    private Double precio;

    private int stockDisponible;


    //METODOS


    public Articulo(String nombre, Double precio, int stockDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.stockDisponible = stockDisponible;
    }


    public void restarStock(){


    }
}
