package cn.xw.user.service;

import cn.xw.user.mapper.UserMapper;
import cn.xw.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务层
 * @author xw
 * @date 2019/5/23 10:58
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 通过主键查询用户信息
     * @param id
     * @return
     */
    public User queryById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
}
