package rpc_comsumer.demo.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import rpc_inteface.demo.bean.Order;
import rpc_inteface.demo.service.OrderService;


@Controller
public class OrderController {

    @DubboReference
    OrderService orderService;

    @ResponseBody
    @RequestMapping("/getOrderList")
    public Order getOrderInfo(){
        return orderService.getOrderInfo("123");
    }
}
