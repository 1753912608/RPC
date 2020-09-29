package rpc_provider.demo;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;
import rpc_inteface.demo.bean.User;
import rpc_inteface.demo.service.UserService;
import java.util.ArrayList;
import java.util.List;

@DubboService
@Component
public class UserServiceImpl implements UserService {
    @Override
    public User getUserInfo(String user_id) {
        List<User> userList=this.CreateUserList();
        for(User user:userList){
            if(user.getUser_id().equals(user_id)){
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> CreateUserList() {
        List<User>userList=new ArrayList<>();
        userList.add(new User("123","小明","男","中山北路"));
        userList.add(new User("234","小美","女","北京西路"));
        return userList;
    }
}
