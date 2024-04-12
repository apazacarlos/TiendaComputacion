package com.tienda.facturacion;

public enum TipoFactura {
    CONS_FINAL(true, false),
    PREMIUM(true, true),
    CORPORATIVE(true, false);

    private final boolean iva;
    private final boolean discount;

    TipoFactura(boolean iva, boolean discount) {
        this.iva = iva;
        this.discount = discount;
    }

    public boolean isIva() {
        return iva;
    }

    public boolean isDiscount() {
        return discount;
    }
}
