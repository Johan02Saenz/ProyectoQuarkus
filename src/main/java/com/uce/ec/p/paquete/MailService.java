package com.uce.ec.p.paquete;

import com.uce.ec.p.interfaz.Notificacion;

import jakarta.inject.Named;
import jakarta.inject.Singleton;
//Ambitos y contextos
//@ApplicationScoped // su ambito es durante toda la aplicacion, una sola instacia compartida
//@RequestScoped //Su ambito es en app web durante el request(peticion http)
@Singleton // Se delega el control al contenedor ArC, igual que AppplicationScope
//@SessionScoped // Su ambito es en app web durante la seccion del usuario, instancia compartida por todos durante la seccion
//@Dependent //Su ambito es durante la inyeccion de dependencia, una por cada inyeccion 
@Named("mail")
public class MailService implements Notificacion {

    private Integer cant=0;
    private String name;
    
    @Override
    public void enviar(String destino, String msj) {
        System.out.println("Enviar correo a " + destino);
        System.out.println("Mensaje:" + msj);
        System.out.println("Correo enviado con exito. \n Fin del envio del correo");
        System.out.println("-------------------------------------------");
    }

    public Integer getCant() {
        return cant;
    }

    public void setCant(Integer cant) {
        this.cant = cant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
