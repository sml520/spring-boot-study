package com.sxb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;


/**
 * @author 张元亮
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.sxb.dao"})
@ServletComponentScan(basePackages="com.sxb")
@EnableAsync
public class SpringBootStudyApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootStudyApplication.class, args);
        context.addApplicationListener(applicationEvent -> {

        });

	}

}
