package com.lsw.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author 装傻
 * @create 2023-03-08 23:43
 */
@SpringBootApplication
@MapperScan("com.lsw.auth.mapper")
public class  ServiceAuthApplication {
    public static void main(String[] args) {
          SpringApplication.run(ServiceAuthApplication.class, args);
     }
}
