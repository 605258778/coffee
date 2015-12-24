package com.freemark.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
	
//	@RequestMapping("login")
//	public String iminateLogin(HttpServletRequest request){
//		HttpSession session = request.getSession();
//		session.setAttribute("isLogin", "3333");
//		return "view/index";
//	}
	@RequestMapping(value = "/login.do")
	public String loginOut(HttpServletRequest request,
			HttpServletResponse response){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		session.setAttribute("isLogin", "3333");
		if(username!=null&&password!=null){
			return "view/index";
		}else{
			return "view/index";
		}
	}
}
