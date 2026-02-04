package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDate fechaPedido;
    private String pedidoId;
    private Cliente clienteAsociado;

    private List<Item> listaDeItems;

    private  Double montoTotal;

    //=============METODOS===================

    //CONSTRUCTOR
    public Pedido(LocalDate fechaPedido, String pedidoId, Cliente clienteAsociado, List<Item> listaDeItems) {
        this.fechaPedido = fechaPedido;
        this.pedidoId = pedidoId;
        this.clienteAsociado = clienteAsociado;
        this.listaDeItems = new ArrayList<>();
    }

    public void agregarItemAPedido(){

    }

    public Double calcularMontoTotal(){

        return null;
    }


}
