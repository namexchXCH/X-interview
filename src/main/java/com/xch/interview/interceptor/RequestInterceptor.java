package com.xch.interview.interceptor;

import com.xch.interview.pojo.logUser;
import com.xch.interview.utils.tokenUtil;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: RequestInterceptor
 * @author: xiongconghui
 * @date: 2023-04-17 16:38
 **/
public class RequestInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (HttpMethod.OPTIONS.toString().equals(request.getMethod())){
            System.out.println("OPTIONS请求，放行");
            return true;
        }
        //设置contentType，解决中文乱码
        response.setContentType("text/html;charset=utf-8");

        String Authorization =null;
        Authorization = request.getHeader("Authoriz");
//        response.setStatus(2001);
        if (Authorization==null){
            return false;
        }

        logUser verify = tokenUtil.verify(Authorization);
        System.out.println(verify!=null);
//        response.setStatus(400);
        return verify!=null;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
