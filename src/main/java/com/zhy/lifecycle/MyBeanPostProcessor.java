package com.zhy.lifecycle;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.zhy.Person;
//@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.err.println(beanName+"========MyBeanPostProcessor.postProcessBeforeInitialization====");
		if(bean instanceof Person){
			Person p = (Person)bean;
			p.setAddress("xxxx");
			System.err.println(p+"========MyBeanPostProcessor.postProcessBeforeInitialization====");
		}
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

}
