package com.uce.ec.p.model;

public class Cuenta {
    private int numero;
    private String cliente;
    private double saldo;
    private String correo;

    public Cuenta() {

    }

    public Cuenta(int numero, String cliente, double saldo, String correo) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.correo = correo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
