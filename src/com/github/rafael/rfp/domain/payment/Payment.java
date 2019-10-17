package com.github.rafael.rfp.domain.payment;

import com.github.rafael.rfp.GenerateDate;
import com.github.rafael.rfp.domain.InterfaceOrderData;
import com.github.rafael.rfp.domain.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Payment implements InterfaceOrderData {
    @Override
    public List<Order> get() {
        return new ArrayList<Order>(){{
            add( new Order("Rafael", GenerateDate.execute(), 150.00) );
            add( new Order("Carlos", GenerateDate.execute(), 300.60) );
        }};
    }
}
