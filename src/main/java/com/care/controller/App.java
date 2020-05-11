package com.care.controller;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class App implements ApplicationContextAware{
	public static ApplicationContext ac;
	public App() {
		System.out.println("app 생성자");
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("apllication 실행됩니다.");
		ac = applicationContext;
	}
	
}
