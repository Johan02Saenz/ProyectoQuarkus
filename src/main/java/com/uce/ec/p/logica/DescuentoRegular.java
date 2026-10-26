package com.uce.ec.p.logica;

import com.uce.ec.p.interfaces.CalcularDescuento;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton 
@Named("regular")
public class DescuentoRegular implements CalcularDescuento {
    private final double descuento = 0.05;
    private int cant=0;
    @Override
    public double obtDesc(double monto) {
        return monto * descuento;
    }

}
