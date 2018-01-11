package com.example.Filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
/**
 * 跨域访问过滤器组件
 * 2017-11-06 15:12
 * @author yue
 * @version 1.0
 */
@Component //WEB组件注解
public class CorsFilter implements Filter {
	/*
	 * 过滤器过滤方法
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {  
        HttpServletResponse response = (HttpServletResponse) res;  
        //允许向所有域发送响应消息
        response.setHeader("Access-Control-Allow-Origin", "*");  
        //允许使用GET与POST方式发送响应消息
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");   
        //响应消息有效时间为3600秒
        response.setHeader("Access-Control-Max-Age", "3600");
        //响应消息头中允许携带Origin,X-Requested-With,Content-Type,Accept值
        response.setHeader("Access-Control-Allow-Headers", "Origin,X-Requested-With,Content-Type,Accept");  
        //请求响应穿过次过滤器
        chain.doFilter(req, res);  
    }  
    /*
     * 过滤器初始化方法
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     * @param FilterConfig
     */
    public void init(FilterConfig filterConfig) {
    	
    }
    /*
     * 过滤器销毁方法
     * @see javax.servlet.Filter#destroy()
     */
    public void destroy() {
    	
    }  
}  
