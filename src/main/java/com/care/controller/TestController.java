package com.care.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.service.ServiceA;
import com.care.service.ServiceB;
import com.care.service.TestService;

@Controller
public class TestController {
	ApplicationContext ac = App.ac;
	//@Autowired
	private TestService ser;
	//@Autowired private ServiceA a;
	//@Autowired private ServiceB b;

	@RequestMapping("test")
	public void test() {
		//ser = new ServiceA();
		System.out.println("ac : " + ac);
		ser = ac.getBean("serviceA", ServiceA.class);
		ser.execute();
		//a.execute();
	}
	
	@RequestMapping("test02")
	public void test02() {
		ser = ac.getBean("serviceB", ServiceB.class);
		ser.execute();
		//b.execute();
	}

}
