package com.github.rafael.rfp.domain.tax;

import com.github.rafael.rfp.GenerateDate;
import com.github.rafael.rfp.domain.InterfaceOrderData;
import com.github.rafael.rfp.domain.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tax implements InterfaceOrderData {
    @Override
    public List<Order> get() {
        return new ArrayList<Order>(){{
            add( new Order("Alan", GenerateDate.execute(), 150.00) );
            add( new Order("Ana Carla", GenerateDate.execute(), 300.60) );
        }};
    }
}
