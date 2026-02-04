package P_Parcial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
// Atributos
    private Date fechaPedido;
    private String codigo;
    private Cliente cliente;
    private List<Item> listaItems;
    private double precioTotal;

// Constructor
    public Pedido(Date fechaPedido, String codigo, Cliente cliente) {
        this.fechaPedido = fechaPedido;
        this.codigo = codigo;
        this.cliente = cliente;
        this.listaItems = new ArrayList<>();
        this.precioTotal = 0;
    }

// Metodos
    public void agregarItemAPedido(Item item){
        this.listaItems.add(item);
        System.out.println("El item fue agregado al pedido de codigo: " + codigo);
    }

    public double CalcularImporteTotal(List<Item> listaItems){
        for (int i = 0; i < listaItems.size(); i++) {
            Item item = listaItems.get(i);
            precioTotal += item.calcularImporteParcial();
        }
        return precioTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Item> getListaItems() {
        return listaItems;
    }

}
