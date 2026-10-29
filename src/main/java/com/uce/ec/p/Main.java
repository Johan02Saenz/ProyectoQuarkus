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
  
    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) {
        System.out.println("---------------------------\nIniciando la app Quarkus\n---------------------------");
        Pedido pedido = new Pedido("Johan Saenz", "Audifonos Soundcore q11i", 35, "johan@gmail.com", "0123456789");
        pedidoService.realizar(pedido, "");
        return 0;
    }
}
