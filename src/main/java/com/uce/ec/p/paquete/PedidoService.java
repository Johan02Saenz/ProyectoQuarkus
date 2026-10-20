package com.uce.ec.p.paquete;

import java.util.Arrays;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped // Se delega el control al contenedor ArC
public class PedidoService {

    @Inject
    private FacturaService facturaService;

    public void realizarPedido(String... p) {

        List<String> productos = Arrays.asList(p);
        System.out.println("Productos seleccionados:");
        productos.forEach(System.out::println);
        System.out.println("Se procedera a generar su factura");

        facturaService.generarFactura(new Pedido("Johan", productos, 8.10, true));

    }

}
