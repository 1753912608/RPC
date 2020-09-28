package rpc_inteface.demo.service;

import rpc_inteface.demo.bean.Order;


public interface OrderService {

    Order getOrderInfo(String user_id);
}
