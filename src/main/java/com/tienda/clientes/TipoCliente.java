package com.tienda.clientes;

public enum TipoCliente {
    CONS_FINAL(false, false),
    PREMIUM(true, true),
    CORPORATIVE(false, false);

    private final boolean subscribed;
    private final boolean discount;

    TipoCliente(boolean subscribed, boolean discount) {
        this.subscribed = subscribed;
        this.discount = discount;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public boolean isDiscount() {
        return discount;
    }

}
