package com.zhy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextUtil implements ApplicationContextAware {
	
	private static ApplicationContext context;
	
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}
	
	public static <T> T  getBean(Class<T> clazz){
        return context.getBean(clazz);
    }

    public  static <T> T getBean(String name){
        return (T)context.getBean(name);
    }

}
