package com.neu.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.neu.pojo.User;
import com.neu.service.UserService;


@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 获得所有用户列表
	 * @param request
	 * @param user
	 * @return
	 */
	@RequestMapping("/index")
	public ModelAndView  index(HttpServletRequest request,User user) {
		ModelAndView mv=new ModelAndView();
		HttpSession session=request.getSession();
		if(session.getAttribute("user")==null) {
			mv.setViewName("redirect:index");
			return mv;
		}
		
		mv.addObject("userList", userService.getUsers(user));
		mv.setViewName("/users");
		return mv;
	}
	
	
	
	/**
	 * 获得更新页面
	 * @return
	 */
	@RequestMapping("/editPage")
	public ModelAndView editPage(User user) {
		ModelAndView mv=new ModelAndView();
		
		User u=userService.getSingleUser(user.getId());
		mv.addObject("u", u);
		mv.setViewName("updateUser");
		
		return mv;
	}
	
	/**
	 * 用户更新
	 * @param user
	 * @return
	 */
	@RequestMapping("/update")
	public String updateUser(User user) {
		
		int count=userService.updateUser(user);
	
		return "redirect:/users/index";
	}
	
	//代码编写处
	
}
