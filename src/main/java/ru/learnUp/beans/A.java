package ru.learnUp.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class A {
	private final B b;

	public A(B b) {
		this.b = b;
		log.info("Object \"A\" was created");
	}


	public void useBFunction() {   //вызываем функции из класса B
		b.print();
	}

	//метод, который будет вызван сразу после конструктора
	private void initMethod() {
		log.info("InitMethod used");
	}
}
