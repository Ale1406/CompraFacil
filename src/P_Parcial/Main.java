package P_Parcial;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("Mouse Logitech", 100, 25);
        Articulo articulo2 = new Articulo("Teclado Logitech", 250, 6);
        Articulo articulo3 = new Articulo("Monitor Lenovo", 500, 7);
        Item item1 = new Item(2, articulo1);
        Item item2 = new Item(4, articulo3);
        Cliente cliente1 = new Cliente("Juan Perez", "Lima 557, CABA", 123456);
        Cliente cliente2 = new Cliente("Santiago","CABA", 789);
        Pedido pedido1 = new Pedido(new Date(),"#0001", cliente1);
        Pedido pedido2 = new Pedido(new Date(),"#0002", cliente1);
        Item item3 = new Item(3, articulo2);

        System.out.println("***************** Articulos en stock *****************");
        System.out.println("Articulo: " + articulo1.getNombre() + " - Cantidad de Stock: " + articulo1.getStock());
        System.out.println("Articulo: " + articulo2.getNombre() + " - Cantidad de Stock: " + articulo2.getStock());
        System.out.println("Articulo: " + articulo3.getNombre() + " - Cantidad de Stock: " + articulo3.getStock());

        System.out.println("\n***************** Armado de nuevo pedido *****************");
        System.out.println("Pedido codigo: " + pedido1.getCodigo());

        System.out.println("\n*** Agregado de Items a pedido ***");
        pedido1.agregarItemAPedido(item1);
        pedido1.agregarItemAPedido(item2);

        System.out.println("\n*** Desglose de precios ***");
        System.out.println("Precio del Item 1: $" + item1.calcularImporteParcial());
        System.out.println("Precio del Item 2: $" + item2.calcularImporteParcial());
        System.out.println("Precio total del pedido " + pedido1.getCodigo() + ": $" + pedido1.CalcularImporteTotal(pedido1.getListaItems()));

        System.out.println("\n*** Asignacion de pedido a Cliente ***");
        cliente1.agregarPedidoACliente(pedido1);
        cliente1.agregarPedidoACliente(pedido2);

        System.out.println("\n*** Actualizacion de Stock ***");
        articulo1.restarStock(item1.getCantUnidades());
        articulo3.restarStock(item2.getCantUnidades());
        System.out.println("Articulo: " + articulo1.getNombre() + " - Cantidad de Stock: " + articulo1.getStock());
        System.out.println("Articulo: " + articulo2.getNombre() + " - Cantidad de Stock: " + articulo2.getStock());
        System.out.println("Articulo: " + articulo3.getNombre() + " - Cantidad de Stock: " + articulo3.getStock());

        System.out.println("\n*** Listar pedidos de Cliente ***");
        cliente1.listarPedidosCliente();
        cliente2.listarPedidosCliente();

    }

}
