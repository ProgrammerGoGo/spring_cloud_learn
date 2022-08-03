package com.cuijian.order.service;

import com.cuijian.order.entity.Order;
import com.cuijian.order.entity.User;
import com.cuijian.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private RestTemplate restTemplate;

    public Order getById(Long id) {
        // 获取订单信息
        Order order = orderMapper.getById(id);
        // 远程调用获取用户信息
        String url = "http://localhost:8082/user/" + order.getUserId();
        User user = restTemplate.getForObject(url, User.class);

        order.setUser(user);
        return order;
    }
}
