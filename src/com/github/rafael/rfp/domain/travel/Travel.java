package com.github.rafael.rfp.domain.travel;

import com.github.rafael.rfp.GenerateDate;
import com.github.rafael.rfp.domain.InterfaceOrderData;
import com.github.rafael.rfp.domain.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Travel implements InterfaceOrderData {

    @Override
    public List<Order> get() {
        return new ArrayList<Order>(){{
            add( new Order("Felipe", GenerateDate.execute(), 150.00) );
            add( new Order("Fabio", GenerateDate.execute(), 300.60) );
            add( new Order("Fabrício", GenerateDate.execute(), 87.19) );
        }};
    }
}
