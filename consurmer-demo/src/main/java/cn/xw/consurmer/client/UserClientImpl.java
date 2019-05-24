package cn.xw.consurmer.client;

import cn.xw.consurmer.pojo.User;
import org.springframework.stereotype.Component;

/**
 * feign
 * @author xw
 * @date 2019/5/24 14:54
 */
@Component
public class UserClientImpl implements UserClient {
    @Override
    public User queryById(Integer id) {
        User user = new User();
        user.setUserName("未知用户！");
        return user;
    }
}
