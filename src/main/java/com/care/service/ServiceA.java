package com.care.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.care.dao.TestDAO;

@Service
public class ServiceA implements TestService{
	@Autowired
	@Qualifier("testDAO")
	private TestDAO dao;
	
	@Override
	public void execute() {
		//dao = new TestDAO();
		System.out.println("dao : " + dao);
		dao.test();
	}
	
}
