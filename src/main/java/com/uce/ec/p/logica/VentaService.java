package com.uce.ec.p.logica;

import com.uce.ec.p.interfaces.CalcularDescuento;
import com.uce.ec.p.model.TipoCliente;
import com.uce.ec.p.model.Ventas;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class VentaService {

    @Inject
    private Auditoria auditoria;

    private final CalcularDescuento descuentoRegular;
    private final CalcularDescuento descuentoVIP;

    @Inject
    public VentaService(@Named("regular") CalcularDescuento descuentoRegular,@Named("vip") CalcularDescuento descuentoVIP) {
        this.descuentoRegular = descuentoRegular;
        this.descuentoVIP = descuentoVIP;
    }

    public void realizar(Ventas venta) {
        var tipo = venta.getCliente().getTipo();
        double descuento = TipoCliente.REGULAR.equals(tipo) ? descuentoRegular.obtDesc(venta.getSubtotal())
                : descuentoVIP.obtDesc(venta.getSubtotal());
        venta.setDescuento(descuento);
        venta.setTotal(venta.getSubtotal() - descuento);
        auditoria.realizar(venta);
    }

}
