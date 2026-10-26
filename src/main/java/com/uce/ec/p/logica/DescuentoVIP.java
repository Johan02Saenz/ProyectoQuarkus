package com.uce.ec.p.logica;

import jakarta.inject.Singleton;

import com.uce.ec.p.interfaces.CalcularDescuento;

import jakarta.inject.Named;

@Singleton 
@Named ("vip")
public class DescuentoVIP implements CalcularDescuento {

    private final double descuento = 0.15;
    @Override
    public double obtDesc(double monto) {
        return monto *descuento;
    }

}
