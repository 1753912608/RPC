package rpc_inteface.demo.service;

import rpc_inteface.demo.bean.User;

import java.util.List;

public interface UserService {
    /**
     * 根据用户uuid获取用户信息
     * @param user_id
     * @return
     */
    User getUserInfo(String user_id);


    /**
     * 初始化自定义用户的信息数据
     * @return
     */
    List<User>CreateUserList();
}
