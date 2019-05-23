package cn.xw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author xw
 * @date 2019/5/23 11:22
 */
//@SpringBootApplication
//@EnableDiscoveryClient
//熔断器
//@EnableCircuitBreaker

@SpringCloudApplication
public class ConsurmerApplication {
    public static void main(String[] args){
        SpringApplication.run(ConsurmerApplication.class);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
