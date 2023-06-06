package com.neu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neu.pojo.User;
import com.neu.service.UserService;
/**
 * 用户管理Controller
 * @author 汪剑杭
 *
 */
@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public ModelAndView  index(HttpServletRequest req) {
		//代码编写处
		User user = (User) req.getAttribute("user");
		ModelAndView modelAndView = new ModelAndView();
		if(user == null) {
			modelAndView.setViewName("redirect:/index");
			return modelAndView;
		}
		List<User> userlist = userService.getUsers();
		modelAndView.addObject("userList" , userlist);
		modelAndView.setViewName("users");
		return modelAndView;
	}
}
