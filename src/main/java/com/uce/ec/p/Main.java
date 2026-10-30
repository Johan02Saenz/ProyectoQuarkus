package com.uce.ec.p;

import com.uce.ec.p.logica.TransferenciaService;
import com.uce.ec.p.model.Cuenta;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;

public class Main implements QuarkusApplication {

    @Inject
    private TransferenciaService transferenciaService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        Cuenta origen = new Cuenta(22096767, "Johan", 100, "johan@gmail.com");
        Cuenta destino = new Cuenta(22096222, "Ernesto", 10, "ernesto@gmail.com");

        transferenciaService.execute(origen, 5, destino);
        return 0;
    }
}
