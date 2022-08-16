package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.member.MemberDao;
import com.service.member.MemberService;


@Controller
public class HelloController {
	
	@Autowired
	private MemberService memberService;

	@RequestMapping(value = "/hello") 
	public String helleWorld() {
		return "/index";
		
	} 
	
	@ResponseBody
	@RequestMapping(value = "/test/member") 
	public MemberDao testMember() {
		MemberDao value = memberService.findById(1L);
		return value;
		
	} 
	
	//1. git 재연동
	//4. JPA 이론 공부 # 
	
	//1. AOP 개념공부
	//2. CREATE, UPDATE Wrapping
}
