package cn.xw.consurmer.client;

import cn.xw.consurmer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//开启feign中的熔断配置
@FeignClient(value = "user-service",fallback = UserClientImpl.class)
public interface UserClient {

    @GetMapping("/user/{id}")
    User queryById(@PathVariable("id") Integer id);
}
