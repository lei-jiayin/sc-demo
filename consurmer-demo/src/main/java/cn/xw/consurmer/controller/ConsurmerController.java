package cn.xw.consurmer.controller;

import cn.xw.consurmer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author xw
 * @date 2019/5/23 11:27
 */
@RestController
@RequestMapping("consurmer")
public class ConsurmerController {

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private DiscoveryClient discoveryClient;
    //开启负载均衡
//    @Autowired
//    private RibbonLoadBalancerClient client;

    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Integer id){
        //动态拉取服务地址
        //获取该服务下的所有实例
        //List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
//        ServiceInstance instance = client.choose("user-service");//负载均衡
        //通过实例获取端口号和地址
       // ServiceInstance instance = instances.get(0);//需要负载均衡
        // 随机、轮询、hash

//        String url = "http://"+instance.getHost()+":"+instance.getPort()+"/user/" + id;
        String url = "http://user-service/user/" + id;
        User user = restTemplate.getForObject(url, User.class);
        return user;
    }
}
