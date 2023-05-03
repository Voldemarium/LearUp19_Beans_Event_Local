package ru.learnUp.beans;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class B {

	private final String tag;
	private int version;

	public B(String tag) {
		this.tag = tag;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public void print() {
        log.info("Hello " + tag + " " + version);
	}
}
