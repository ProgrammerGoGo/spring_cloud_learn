package com.cuijian.order.entity;

import lombok.Data;

@Data
public class Order {

    private long id;
    private long userId;
    private String name;
    private long price;
    private int num;
    private User user;

}
