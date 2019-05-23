package cn.xw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author xw
 * @date 2019/5/23 11:22
 */
@SpringBootApplication
public class ConsurmerApplication {
    public static void main(String[] args){
        SpringApplication.run(ConsurmerApplication.class);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
