package com.uce.ec.p.paquete;

import com.uce.ec.p.interfaz.Notificacion;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class CompraService {
    @Inject
    @Named("mail")
    private Notificacion notificacionCorreo;

    public void realizar(Compra compra) {
        System.out.println("Realizando Compra....");
        System.out.println("Pedido realizado para el cliente: " + compra.getCliente());
        System.out.println("Producto: " + compra.getProducto());
        System.out.println("Total: " + compra.getTotal());
        System.out.println("Correo: " + compra.getCorreo());
        System.out.println("Telefono: " + compra.getTelefono());
        System.out.println("Pedido realizado con exito. \n ::::::::::::::::::::::::::::: ");
        String cuerpo = "Estimado " + compra.getCliente() + ", su pedido de " + compra.getProducto()
                + " por un total de $" + compra.getTotal() + " ha sido realizado con exito.";

        // Notificacion por correo
        this.notificacionCorreo.enviar(compra.getCorreo(), cuerpo);
        this.notificacionCorreo.setCant(this.notificacionCorreo.getCant() + 1);
        System.out.println("Cantidad de correos enviados: " + this.notificacionCorreo.getCant());
        System.out.println("Nombre:" + this.notificacionCorreo.getName());
    }
}
