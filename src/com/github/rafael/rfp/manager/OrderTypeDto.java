package com.github.rafael.rfp.manager;

import com.github.rafael.rfp.domain.OrderType;

public enum OrderTypeDto {

    TRAVEL ,
    PURCHASE ,
    PAYMENT ,
    TAX ;

    public static OrderType get(OrderTypeDto dto){
        return OrderType.valueOf(dto.name());
    }

}
