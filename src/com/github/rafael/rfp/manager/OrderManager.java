package com.github.rafael.rfp.manager;

import com.github.rafael.rfp.domain.Order;
import com.github.rafael.rfp.domain.OrderType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderManager implements InterfaceOrderManager {

    public List<Order> getListOrderByType(OrderTypeDto type) {

        OrderType orderType = OrderTypeDto.get(type);

        return orderType.getInterfaceOrderData().get();
    }

    @Override
    public Map<OrderTypeDto, Integer> getSizeOfType() {

        HashMap<OrderTypeDto, Integer> map = new HashMap<OrderTypeDto, Integer>();

        for (OrderTypeDto dto: OrderTypeDto.values()){
            map.put(dto, getListOrderByType(dto).size());
        }

        return map;
    }
}
