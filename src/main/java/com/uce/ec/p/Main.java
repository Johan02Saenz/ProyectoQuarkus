package com.uce.ec.p;

import com.uce.ec.p.paquete.Compra;
import com.uce.ec.p.paquete.CompraService;
import com.uce.ec.p.paquete.Pedido;
import com.uce.ec.p.paquete.PedidoService;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private PedidoService pedidoService;
    @Inject
    private CompraService compraService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) {
        System.out.println("---------------------------\nIniciando la app Quarkus\n---------------------------");
        Pedido pedido = new Pedido("Alexis Tituaña", "PC", 1000, "Alex@gmail.com", "0123456789");
        pedidoService.realizar(pedido);

        Compra compra = new Compra("Johan Saenz", "Monster", 3, "Johan@gmail.com", "9876543210");
        this.compraService.realizar(compra);

        pedidoService.realizar(pedido);
        return 0;
    }
}
