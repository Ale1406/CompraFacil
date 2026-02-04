package C_6.Practica.P_Parcial;

import java.util.ArrayList;
import java.util.List;

class Cliente {
    String nombre, domicilio;
    int telefono;
    List<Pedido> listaPedidos;

    public void agregarPedidoACliente (Pedido pedido) {
        // Lógica para agregar un pedido al cliente
    }

    public Cliente(String domicilio, String nombre, int telefono) {
        this.domicilio = domicilio;
        this.nombre = nombre;
        this.telefono = telefono;
        listaPedidos= new ArrayList<>();
    }
}
