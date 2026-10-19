package com.uce.ec.p;

import com.uce.ec.p.service.PedidoService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    public static void main(String[] args) {
        PedidoService pedidoService = new PedidoService();
        pedidoService.realizarPedido("Monster Energy Ultra","Monster Energy Ultra Paradise","Malvadiscos Cafe");
        System.out.println(":::::::::::::::::::::::::::\nTerminado\n:::::::::::::::::::::::::::");
        pedidoService = null;
    }
}
