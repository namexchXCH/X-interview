package com.xch.interview.config;


import com.xch.interview.interceptor.RequestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;



@EnableWebMvc
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /**
     *登录拦截
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new RequestInterceptor());

        /**
         *拦截所有请求
         */
        System.out.println("拦截请求");
        interceptorRegistration.addPathPatterns("/**");
        interceptorRegistration.excludePathPatterns("/**/*.html","/**/*.js","/**/*.css");

    }

    public void addCorsMappings(CorsRegistry registry) {

        //每次调用registry.addMappin可以添加一个跨域配置，需要多个配置可以多次调用registry.addMapping
        System.out.println("跨域");
       //  response.setHeader("Access-Control-Allow-Methods","*");
        registry.addMapping("/**")
                .allowedOriginPatterns("*") //放行哪些原始域
                .allowedMethods("*") //放行哪些请求方式
                .allowedHeaders("*") //放行哪些原始请求头部信息
                .exposedHeaders("*") //暴露哪些头部信息
                .allowCredentials(true) //是否发送 Cookie
                .maxAge(3600);
    }


}