package com.uce.ec.p.paquete;

import com.uce.ec.p.interfaz.Notificacion;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton  // Se delega el control al contenedor ArC
@Named("mail")
public class MailService implements Notificacion {

    @Override
    public void enviar(String destino, String msj) {
        System.out.println("Enviar correo a" + destino);
        System.out.println("Mensaje:" + msj);
        System.out.println("Correo enviado con exito. \n Fin del envio del correo");
    }

}
