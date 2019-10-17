package com.github.rafael.rfp.domain.purchase;

import com.github.rafael.rfp.GenerateDate;
import com.github.rafael.rfp.domain.InterfaceOrderData;
import com.github.rafael.rfp.domain.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Purchase implements InterfaceOrderData {

    @Override
    public List<Order> get() {
        return new ArrayList<Order>(){{
            add( new Order("Juliana", GenerateDate.execute(), 312.99) );
            add( new Order("Elisa", GenerateDate.execute(), 300.60) );
            add( new Order("Erica", GenerateDate.execute(), 98.19) );
            add( new Order("Junior", GenerateDate.execute(), 1456.81) );
        }};
    }
}
