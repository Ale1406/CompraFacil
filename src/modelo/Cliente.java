package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private int nroTelefono;
    private String domicilio;

    private List<Pedido> listeDePedidos;

    // METODOS

    // CONSTRUCTOR

    public Cliente(String nombre, int nroTelefono, String domicilio, List<Pedido> listeDePedidos) {
        this.nombre = nombre;
        this.nroTelefono = nroTelefono;
        this.domicilio = domicilio;
        this.listeDePedidos = new ArrayList<>();
    }

    // Getters & setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(int nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public List<Pedido> getListeDePedidos() {
        return listeDePedidos;
    }

    public void setListeDePedidos(List<Pedido> listeDePedidos) {
        this.listeDePedidos = listeDePedidos;
    }
}
