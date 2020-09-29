package rpc_comsumer.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import rpc_inteface.demo.bean.Order;
import rpc_inteface.demo.service.OrderService;
import rpc_inteface.demo.service.UserService;

import java.util.Date;

@Component
@DubboService
public class OrderServiceImpl implements OrderService {

    @DubboReference
    private UserService userService;

    @Override
    public Order getOrderInfo(String user_id) {
        String address=userService.getUserInfo(user_id).getAddress();
        Order order=new Order(rand.getOrderId(),user_id,"由"+user_id+"生成的订单test",new Date(),address);
        return order;
    }

    public void show(){
        Order order=this.getOrderInfo("123");
        System.out.println(order);
    }
}
