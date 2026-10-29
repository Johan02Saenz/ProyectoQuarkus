package com.uce.ec.p.paquete;

import java.time.LocalDateTime;

import jakarta.inject.Singleton;

@Singleton
public class AuditoriaService {

    public void guardarEnLaBAse(String cliente, double total, String correo) {

        System.out.printf(
                "-> Guardando en la  base de datos la auditoria:%n->Cliente: %s%n->Total: %.2f%n->Correo: %s%n",
                cliente, total, correo);

        System.out.println("Con fecha y hora:" + LocalDateTime.now().toString());

    }
}
