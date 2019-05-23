package cn.xw.user.controller;

import cn.xw.user.pojo.User;
import cn.xw.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户服务控制层
 * @author xw
 * @date 2019/5/23 11:01
 */
@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User hello(@PathVariable("id")Integer id){
//        System.out.println("hello method is running");
        log.debug("hello method is running");
        return userService.queryById(id);
    }
}
