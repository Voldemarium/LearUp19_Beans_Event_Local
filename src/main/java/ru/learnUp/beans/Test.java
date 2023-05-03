package ru.learnUp.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test implements ApplicationContextAware {

	private ApplicationContext context;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        A a = (A)context.getBean("a");
		a.useBFunction();
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
		System.out.println("applicationContext: " + applicationContext);
	}
}