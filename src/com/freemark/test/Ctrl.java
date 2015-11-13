package com.freemark.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Ctrl {
	
	
	public Ctrl(){
		System.out.println(this.getClass().getName()+" instance!");
	}
	
	@RequestMapping("test")
	@ResponseBody
	public String test(){
		
		return "Hello,Spring MVC";
	}
	
	@RequestMapping("login")
	public String iminateLogin(HttpServletRequest request){
		HttpSession session = request.getSession();
		session.setAttribute("isLogin", "3333");
		return "index";
	}
}
