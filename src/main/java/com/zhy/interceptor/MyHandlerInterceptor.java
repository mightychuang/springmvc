package com.zhy.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


/**
 * HandlerInterceptor 属于SpringMVC里的组件，
 * 所以即便在此处加了注解，只能被spring容器管理，并没加载到SpringMvc 容器里，也就起不到拦截器的作用
 * 需要在Spring MVC的配置文件里显示指定
 * 
 * @author zhy
 *
 */
//@Component
public class MyHandlerInterceptor implements HandlerInterceptor {
	
	

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println(request.getRequestURI());
//		response.getWriter().print("ZXXXIKKK");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
