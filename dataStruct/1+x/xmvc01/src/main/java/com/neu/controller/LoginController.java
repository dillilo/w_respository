package com.neu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neu.pojo.User;
import com.neu.service.UserService;

/**
 * 登录功能Controller
 * @author 汪剑杭
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
	
	/**
	 * 登录验证
	 * @param user 用户信息
	 * @param request
	 * @return
	 * @throws IOException 
	 * @throws ServletException 
	 */
	@RequestMapping("/login")
	public void getLogin(User user,HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
		//代码编写处
		if(userService.isLogin(user)) {
			request.setAttribute("user", user);
		    request.getRequestDispatcher("/users/index").forward(request, response);
		    return;
		}
		request.setAttribute("login_msg", "账号或密码错误");
    	request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
    	return;
	}

}
