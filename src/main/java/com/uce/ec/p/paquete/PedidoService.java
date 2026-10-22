package com.uce.ec.p.paquete;

import com.uce.ec.p.interfaz.Notificacion;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped // Se delega el control al contenedor ArC
public class PedidoService {

    @Inject
    @Named("mail")
    private Notificacion notificacionCorreo;
    @Inject
    @Named("sms")
    private Notificacion notificacionSMS;

    public void realizar(Pedido pedido) {
        System.out.println("Realizando pedido....");
        System.out.println("Pedido realizado para el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());
        System.out.println("Telefono: " + pedido.getTelefono());
        System.out.println("Pedido realizado con exito. \n ::::::::::::::::::::::::::::: ");
        String cuerpo = "Estimado " + pedido.getCliente() + ", su pedido de " + pedido.getProducto()
                + " por un total de $" + pedido.getTotal() + " ha sido realizado con exito.";

        // Notificacion por correo
        this.notificacionCorreo.enviar(pedido.getCorreo(), cuerpo);
        // Notificacion por sms
        this.notificacionSMS.enviar(pedido.getTelefono(), cuerpo);
    }

}
