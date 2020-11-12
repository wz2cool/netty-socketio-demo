package com.github.wz2cool.nettysocketiodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class NettySocketioDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NettySocketioDemoApplication.class, args);
    }

}
