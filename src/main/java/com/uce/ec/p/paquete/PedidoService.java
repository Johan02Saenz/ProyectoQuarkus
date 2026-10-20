package com.uce.ec.p.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton 
//@RequestScoped // para WebApp
//@ApplicationScoped // Se delega el control al contenedor ArC
public class PedidoService {

    @Inject
    private MailService mailService;

    public void realizar(Pedido pedido) {

        System.out.println("Realizando pedido....");
        System.out.println("Pedido realizado para el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());
        System.out.println("Pedido realizado con exito. \n ::::::::::::::::::::::::::::: ");
        String asunto = "Confirmacion de pedido";
        String cuerpo = "Estimado " + pedido.getCliente() + ", su pedido de " + pedido.getProducto()
                + " por un total de $" + pedido.getTotal() + " ha sido realizado con exito.";

        this.mailService.enviar(pedido.getCorreo(), asunto, cuerpo);
    }

}
