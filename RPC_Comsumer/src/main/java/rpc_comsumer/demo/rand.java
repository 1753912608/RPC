package rpc_comsumer.demo;

import java.util.Random;

public class rand {
    public static String getOrderId(){
        StringBuffer buffer=new StringBuffer("");
        buffer.append("订单test");
        Random random=new Random();
        for(int i=0;i<10;i++){
            buffer.append(random.nextInt(10));
        }
        return buffer.toString();
    }
}
