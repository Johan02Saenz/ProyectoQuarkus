package com.uce.ec.p.paquete;

import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped  
public class FacturaService {
 public void generarFactura(Pedido pedido) {
        System.out.println("Factura::::::::::::::::::::::::::::::::::::::");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Productos:");
        pedido.getProductos().forEach(System.out::println);
        System.out.printf("Subtotal: $%.2f%n", pedido.getSubtotal());
        System.out.println("Aplica descuento: " + (pedido.isAplicaIva() ? "Sí" : "No"));
        System.out.printf("Total: $%.2f%n", pedido.getTotal());
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");

    }

}
