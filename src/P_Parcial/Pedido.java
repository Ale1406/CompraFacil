package C_6.Practica.P_Parcial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Pedido {
    Date fechaPedido;
    String codigo;
    Cliente cliente;
    List<Item> listItems;
    public void agregarAPedidoItem(Item item){
        this.listItems.add(item);
    }
    public double CalcularImporteTotal(List<Item> listItems){

    }

    public Pedido(Cliente cliente, String codigo, Date fechaPedido) {
        this.cliente = cliente;
        this.codigo = codigo;
        this.fechaPedido = fechaPedido;
        this.listItems= new ArrayList<>();
    }
}
