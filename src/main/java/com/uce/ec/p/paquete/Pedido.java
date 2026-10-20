package com.uce.ec.p.paquete;

import java.util.List;

public class Pedido {
    private String cliente;
    private List<String> productos;
    private double subtotal;
    private boolean aplicaDescuento;
    private double descuento;
    private double total;

    public Pedido() {
    }

    public Pedido(String cliente, List<String> productos, double subtotal, boolean aplicaIva) {
        this.cliente = cliente;
        this.productos = productos;
        this.subtotal = subtotal;
        this.aplicaDescuento = aplicaIva;
        descuento = aplicaIVA();
        this.total = total();
    }

    private final double aplicaIVA() {
        return aplicaDescuento ? 0.15 : 0.00;
    }

    private final double total() {
        return subtotal * (1 - descuento);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public boolean isAplicaIva() {
        return aplicaDescuento;
    }

    public void setAplicaIva(boolean aplicaIva) {
        this.aplicaDescuento = aplicaIva;
    }

    public double getIVA() {
        return descuento;
    }

    public void setIVA(float iVA) {
        descuento = iVA;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
