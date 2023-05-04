package ru.learnUp.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.learnUp.events.MyEventPublisher;

public class Test implements ApplicationContextAware {

	private ApplicationContext context;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        A a = (A)context.getBean("a");
		a.useBFunction();

		//Для Event
		MyEventPublisher publisher = context.getBean(MyEventPublisher.class);
		publisher.publishEvent("Good event");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}
}