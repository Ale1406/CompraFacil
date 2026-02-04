package C_6.Practica.P_Parcial;

 class Articulo {
    String nombre;
    double precio;
    int stock;


    public void restarStock(int cantidad){
        if (stock>= cantidad){//hayStock boolean
            stock -= cantidad;
        }else{
            System.out.println("No hay stock suficiente");
        }
    }

     public Articulo(String nombre, double precio, int stock) {
         this.nombre = nombre;
         this.precio = precio;
         this.stock = stock;
     }

     public double getPrecio() {
         return precio;
     }
 }
