package com.way.hjbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 主启动类只为特别的你
 */
@SpringBootApplication
@MapperScan(basePackages = "com.way.hjbook.mapper")
@ComponentScan(basePackages = {"com.way.hjbook","org.n3r.idworker"})
public class HjbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(HjbookApplication.class, args);
    }

}
