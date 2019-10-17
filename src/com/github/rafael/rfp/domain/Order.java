package com.github.rafael.rfp.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {

    private String requester;
    private Date dueDate;
    private Double value;

    public Order(String requester, Date dueDate, Double value) {
        this.requester = requester;
        this.dueDate = dueDate;
        this.value = value;
    }

    public String getRequester() {
        return requester;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Double getValue() {
        return value;
    }

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String toString() {
        return  "{" +
                "\"requester\":\"" + requester + "\"" +
                ", \"dueDate\":\"" + sdf.format(dueDate) + "\"" +
                ", \"value\":" + value +
                "}";
    }
}
