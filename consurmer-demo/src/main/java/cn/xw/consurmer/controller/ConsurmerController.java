package cn.xw.consurmer.controller;

import cn.xw.consurmer.client.UserClient;
import cn.xw.consurmer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author xw
 * @date 2019/5/23 11:27
 */
@RestController
@RequestMapping("consurmer")
//@DefaultProperties(defaultFallback = "defaultFallback")//通用降级
public class ConsurmerController {

    //在使用feign后可以不用注入
//    @Autowired
//    private RestTemplate restTemplate;


    //使用feign后
    @Autowired
    private UserClient userClient;

    /**
     * 体验新的 feign 框架
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public User findById(@PathVariable("id") Integer id){
        User user = userClient.queryById(id);
        return user;
    }


    /*----------------------------------熔断示例-------------------------------------------*/
//    @GetMapping("{id}")
    //@HystrixCommand(fallbackMethod = "queryByIdFallback")//失败熔断指令 开启降级
    /*@HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })*///寻找默认回滚方法
//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//触发熔断的最小请求次数 20
//            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//休眠时长 5000
//            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")//触发熔断的失败请求最小占比，默认50%
//    })
//    public String queryById(@PathVariable("id") Integer id){
//        if (id % 2 == 0){
//            throw new RuntimeException("");
//        }
//        String url = "http://user-service/user/" + id;
//        String user = restTemplate.getForObject(url, String.class);
//        return user;
//    }

    public String queryByIdFallback(Integer id){
        return "不好意思，服务器太拥挤了！";
    }

    public String defaultFallback(){
        return "不好意思，服务器太拥挤了！";
    }
    /*-------------------------------------------------------------------------------------*/



//    @Autowired
//    private DiscoveryClient discoveryClient;
    //开启负载均衡
//    @Autowired
//    private RibbonLoadBalancerClient client;

    /*@GetMapping("{id}")
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
    }*/
}
