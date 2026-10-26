package com.uce.ec.p.model;

import java.util.Arrays;
import java.util.List;

public class Ventas {
    private Cliente cliente;
    private List<Producto> productos;
    private double subtotal;
    private double descuento;
    private double total;

    public Ventas() {
    }

    public Ventas(Cliente cliente,  Producto... productos) {
        this.cliente = cliente;
        this.productos = Arrays.asList(productos);
        this.subtotal = obtSubTotal();

    }

    private double obtSubTotal() {
        double sub = this.productos.stream().mapToDouble(Producto::getPrecio).sum();
        return sub;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
