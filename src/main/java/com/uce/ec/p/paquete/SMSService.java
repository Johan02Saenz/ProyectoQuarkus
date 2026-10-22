package com.uce.ec.p.paquete;

import com.uce.ec.p.interfaz.Notificacion;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
@Named("sms")
public class SMSService implements Notificacion {

    @Override
    public void enviar(String destino, String msj) {
        System.out.println("Enviar SMS a" + destino);
        System.out.println("Mensaje:" + msj);
        System.out.println("SMS enviado con exito. \n Fin del envio del SMS");
    }
}
