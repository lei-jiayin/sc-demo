package cn.xw.consurmer.pojo.controller;

import cn.xw.consurmer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xw
 * @date 2019/5/23 11:27
 */
@RestController
@RequestMapping("consurmer")
public class ConsurmerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Integer id){
        String url = "http://localhost:8081/user/" + id;
        User user = restTemplate.getForObject(url,User.class);
        return user;
    }
}
