package P_Parcial;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
// Atributos
    private String nombre, domicilio;
    private int telefono;
    private List<Pedido> listaPedidos;

// Constructor
    public Cliente(String nombre, String domicilio, int telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.listaPedidos = new ArrayList<>();
    }

    // Metodos
    public String getNombre() {
        return nombre;
    }

    public void agregarPedidoACliente (Pedido pedido) {
        if (this.nombre.equals(pedido.getCliente().getNombre())){
            listaPedidos.add(pedido);
            System.out.println("El pedido " + pedido.getCodigo() + " fue agregado al historial del cliente " + nombre);
        }
        else {
            System.out.println("El pedido " + pedido.getCodigo() + " no corresponde al cliente " + nombre);
        }
    }

    public void listarPedidosCliente(){

        if (listaPedidos.size() == 0){
            System.out.println("El cliente " + this.nombre + " no tiene pedidos.");
        }
        else{
            int cont = 0;
            for (int i = 0; i < listaPedidos.size(); i++) {
                cont++;
                System.out.println(listaPedidos.get(i).getCodigo());
            }
            System.out.println("Cantidad de pedidos del cliente " + nombre + ": " + cont);
        }

    }


}
