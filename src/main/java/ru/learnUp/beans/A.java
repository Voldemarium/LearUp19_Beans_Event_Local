package ru.learnUp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class A {
	//Аннотация Autowired попросила Spring в поле, которое она аннотирует, подставить значение.
	// Эта операция называется «инжектнуть» (inject)
	@Autowired
	private B b;

	public void setB(B b) {
		this.b = b;
	}

	public void useBFunction() {   //вызываем функции из класса B
		b.print();
	}
}
