package com.care.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.care.test02.Test02;

/**
 * Handles requests for the application home page.
 */
//@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private TestClass testClass;
	@Autowired
	private Test02 test02;
	
	public HomeController() {
		System.out.println("homecontroller 생성자 실행입니다.");
		
		/*
		String config = "classpath:config/context-config002.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		test02 = ctx.getBean("test02", Test02.class);
		test02.test02();
		*/
		System.out.println("생성자 확인 : " + testClass);
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("/경로에서 확인 : " + testClass);
		System.out.println("test02 : " + test02);
		test02.test02();
		testClass.print();
		
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
