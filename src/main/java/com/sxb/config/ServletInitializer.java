package com.sxb.config;

import com.sxb.SpringBootStudyApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 打war包部署需要
 * @author 张元亮
 * @date 2020/5/12
 */
public class ServletInitializer extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //此处的Application.class为带有@SpringBootApplication注解的启动类
        return builder.sources(SpringBootStudyApplication.class);
    }

}
