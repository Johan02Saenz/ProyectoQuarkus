package com.uce.ec.p.logica;

import java.util.UUID;

import com.uce.ec.p.model.Ventas;

import jakarta.enterprise.context.Dependent;

@Dependent
public class Auditoria {
    

    public void realizar(Ventas venta) {
        var id =UUID.randomUUID().toString();
        System.out.println("----------------------------------------------");
        System.out.println("-> Auditoria:" +id);
        System.out.println("    Cliente: " + venta.getCliente().getNombre());
        System.out.println("    Tipo: " + venta.getCliente().getTipo().toString());
        System.out.println("    Productos: ");
        venta.getProductos().forEach(m -> System.out.println("     - " + m.toString()));
        System.out.println("    Subtotal: " + venta.getSubtotal());
        System.out.println("    Descuento: " + venta.getDescuento());
        System.out.println("    Total: " + venta.getTotal());
        System.out.println("----------------------------------------------");
    }
}
