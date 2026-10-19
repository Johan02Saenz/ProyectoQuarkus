package com.uce.ec.p.service;

import java.util.Arrays;
import java.util.List;

import com.uce.ec.p.model.Pedido;

public class PedidoService {
    public void realizarPedido(String... p) {
        List<String> productos = Arrays.asList(p);
        System.out.println("Productos seleccionados:");
        productos.forEach(System.out::println);
        System.out.println("Se procedera a generar su factura");

        FacturaService facturaService = new FacturaService();
        facturaService.generarFactura(new Pedido("Johan", productos, 8.10, true));

        facturaService = null;

    }
}
