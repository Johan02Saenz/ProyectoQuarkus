package com.uce.ec.p.service;

import com.uce.ec.p.model.Pedido;

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
