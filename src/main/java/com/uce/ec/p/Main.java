package com.uce.ec.p;

import java.util.List;

import com.uce.ec.p.logica.VentaService;
import com.uce.ec.p.model.Cliente;
import com.uce.ec.p.model.Producto;
import com.uce.ec.p.model.TipoCliente;
import com.uce.ec.p.model.Ventas;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;

public class Main implements QuarkusApplication {

    @Inject
    private VentaService ventaService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) {
        System.out.println(":::::::::::::::::::Tarea 4 :::::::::::::::::::");
        Cliente cl1 = new Cliente("Johan", TipoCliente.REGULAR);
        Cliente cl2 = new Cliente("Ernesto", TipoCliente.VIP);

        Ventas vt1 = new Ventas(cl1, new Producto("Monster Ultra", 3.00), new Producto("Monster", 3.00));
        Ventas vt2 = new Ventas(cl2, new Producto("Television", 150.00), new Producto("Jugo de naranja", 1.00));
        Ventas vt3 = new Ventas(cl1, new Producto("Malvadisco Cafe", 1.00), new Producto("Monster Ultra", 3.00));
        Ventas vt4 = new Ventas(cl2, new Producto("Sporade Uva", 1.00), new Producto("Papas ", 1.60));
        List<Ventas> ventas = List.of(vt1, vt2, vt3, vt4);
        ventas.forEach(m -> ventaService.realizar(m));
        System.out.printf("%-10s | %-10s | %-20s | %-10s%n", "Tipo", "Monto", "Descuento", "Total");
        System.out.println("----------------------------------------------------------");
        ventas.forEach(m -> System.out.printf("%-10s | %-10.2f | %-20.2f | %-10.2f%n",
                m.getCliente().getTipo().toString(), m.getSubtotal(), m.getDescuento(), m.getTotal()));
        return 0;
    }

}
