package ru.learnUp.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Slf4j
public class A implements InitializingBean {
	private final B b;

	public A(B b) {
		this.b = b;
		log.info("Object \"A\" was created");
	}

	public void useBFunction() {   //вызываем функции из класса B
		b.print();
	}

	//метод, который будет вызван сразу после конструктора
	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("InitMethod used");
	}
}
