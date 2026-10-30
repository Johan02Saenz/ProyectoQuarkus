package com.uce.ec.p.logica;

import com.uce.ec.p.Interceptor.Notificacion;
import com.uce.ec.p.model.Cuenta;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TransferenciaService {

    @Notificacion 
    public void execute(Cuenta origen, double monto, Cuenta destino) {
        origen.setSaldo(origen.getSaldo() - monto);
        destino.setSaldo(destino.getSaldo() + monto);
    }

}
