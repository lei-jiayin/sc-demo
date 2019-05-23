package cn.xw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * user-service 服务启动器
 * @author xw
 * @date 2019/5/23 10:37
 */
@SpringBootApplication
@MapperScan("cn.xw.user.mapper")
public class UserApplication {
    public static void main(String[] args){
        SpringApplication.run(UserApplication.class);
    }
}
