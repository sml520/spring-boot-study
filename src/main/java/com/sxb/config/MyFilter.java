package com.sxb.config;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 *
 * @author 张元亮
 * @date 2020/5/12
 */
@WebFilter(filterName = "myFilter", urlPatterns = "/*")
@Slf4j
public class MyFilter implements Filter{


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("filter 初始化...");
        System.out.println("filter 初始化...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        log.info("filter 请求处理之前...");
        System.out.println("filter 请求处理之前...");
        filterChain.doFilter(servletRequest, servletResponse);
        log.info("filter 请求处理之后...");
        System.out.println("filter 请求处理之后...");
    }

    @Override
    public void destroy() {
        log.info("filter 销毁...");
        System.out.println("filter  销毁...");
    }
}
