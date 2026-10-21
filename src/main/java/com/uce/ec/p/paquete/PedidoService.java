package com.uce.ec.p.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

//@Singleton 
//@RequestScoped // para WebApp
@ApplicationScoped // Se delega el control al contenedor ArC
public class PedidoService {
   /*
     //Por atributo
     @Inject
     private MailService mailService;*/
  
    // Inyeccion de dependencia por setter
    private MailService mailService;
/*
    @Inject
    public void setMailService(MailService mailService) {
        System.out.println("Se esta inyectando la dependencia");
        this.mailService = mailService;
    }
    */

  // Inyeccion de depencias por constructor
    @Inject
    public PedidoService(MailService mailService) {
        System.out.println("Por constructor");
        this.mailService = mailService;
    }

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
