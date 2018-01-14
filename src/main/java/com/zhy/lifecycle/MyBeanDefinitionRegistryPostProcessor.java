package com.zhy.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

import com.zhy.entity.Person;
//@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.err.println(beanFactory.toString()+"=====MyBeanDefinitionRegistryPostProcessor.postProcessBeanFactory==");
	}

	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.err.println(registry.toString()+"=====MyBeanDefinitionRegistryPostProcessor.postProcessBeanDefinitionRegistry==");
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(Person.class);
		builder.addPropertyValue("name", "张三");
		builder.addPropertyValue("address","wedw");
		registry.registerBeanDefinition("张",builder.getBeanDefinition());
	}

}
