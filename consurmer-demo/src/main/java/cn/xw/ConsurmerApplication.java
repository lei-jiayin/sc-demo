package cn.xw;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xw
 * @date 2019/5/23 11:22
 */
//@SpringBootApplication
//@EnableDiscoveryClient
//熔断器
//@EnableCircuitBreaker

@EnableFeignClients  //开启feign的注解
@SpringCloudApplication
public class ConsurmerApplication {
    public static void main(String[] args){
        SpringApplication.run(ConsurmerApplication.class);
    }

//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }
}
