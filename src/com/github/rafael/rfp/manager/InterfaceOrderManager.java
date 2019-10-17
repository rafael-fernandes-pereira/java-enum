package com.github.rafael.rfp.manager;

import com.github.rafael.rfp.domain.Order;
import com.github.rafael.rfp.domain.OrderType;

import java.util.List;
import java.util.Map;

public interface InterfaceOrderManager {
    List<Order> getListOrderByType(OrderTypeDto type);
    Map<OrderTypeDto, Integer> getSizeOfType();
}
