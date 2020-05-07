package com.care.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.care.test.Test;

//@Service		// 서비스단
//@Repository	// dao단
//@Component		// 단순 객체 생성할 때
public class TestClass {
	@Autowired private Test t;
	public TestClass() {
		System.out.println("TestClass 생성자입니다.");
	}
	
	public void print() {
		t.test();
		System.out.println("TestClass.print() 메소드입니다.");
	}
}
