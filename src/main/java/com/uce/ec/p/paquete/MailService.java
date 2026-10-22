package com.uce.ec.p.paquete;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped  //Se delega el control al contenedor ArC
@Unremovable 
public class MailService {
    public void enviar(String correo, String asunto, String cuerpo) {
        System.out.println("Enviando correo a: " + correo);
        System.out.println("Asunto: " + asunto);
        System.out.println("Cuerpo: " + cuerpo);
        System.out.println("Correo enviado con exito");
    }

}
