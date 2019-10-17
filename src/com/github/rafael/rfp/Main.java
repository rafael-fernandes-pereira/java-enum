package com.github.rafael.rfp;

import com.github.rafael.rfp.manager.InterfaceOrderManager;
import com.github.rafael.rfp.manager.OrderManager;
import com.github.rafael.rfp.manager.OrderTypeDto;

public class Main {

    public static void main(String[] args) {

        InterfaceOrderManager manager = new OrderManager();

        System.out.println(manager.getListOrderByType(OrderTypeDto.PAYMENT));

        System.out.println(manager.getSizeOfType());

    }
}
