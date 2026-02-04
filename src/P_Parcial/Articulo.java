package P_Parcial;

public class Articulo {
 // Atributos
    private String nombre;
    private double precio;
    private int stock;

// Constructor
     public Articulo(String nombre, double precio, int stock) {
         this.nombre = nombre;
         this.precio = precio;
         this.stock = stock;
     }

 // Metodos
    public void restarStock(int cantidad){

        if (stock>= cantidad){  //hayStock boolean
            stock -= cantidad;
        }else{
            System.out.println("No hay stock suficiente. Intente con un stock menor o reponga stock.");
        }
    }

     public double getPrecio() {
         return precio;
     }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

}
