package com.neu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neu.pojo.User;
import com.neu.service.UserService;

/**
 * 登录功能Controller
 * @author Admin
 *
 */
@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String  getIndex() {
		return "login";
	}
	
	@RequestMapping("/login")
	public String getLogin(User user,HttpServletRequest request) {
		boolean flag=userService.isLogin(user);
		String path="";
		if(flag) {
			//添加session
			HttpSession session=request.getSession();
			session.setAttribute("user", user.getUserName());
			path="redirect:/users/index";
		}else {
			path="redirect:/index";
		}
		return path;
	}

}
