package com.github.rafael.rfp.domain;

import com.github.rafael.rfp.domain.payment.Payment;
import com.github.rafael.rfp.domain.purchase.Purchase;
import com.github.rafael.rfp.domain.tax.Tax;
import com.github.rafael.rfp.domain.travel.Travel;

public enum OrderType {

    TRAVEL ( "Viagem", new Travel() ),
    PURCHASE ( "Compras", new Purchase() ),
    PAYMENT ( "Pagamento", new Payment()),
    TAX ("Impostos", new Tax());

    private final String description;
    private final InterfaceOrderData interfaceOrderData;

    OrderType(String description, InterfaceOrderData interfaceOrderData){
        this.description = description;

        this.interfaceOrderData = interfaceOrderData;
    }

    public String getDescription() {
        return description;
    }

    public InterfaceOrderData getInterfaceOrderData() {
        return interfaceOrderData;
    }
}