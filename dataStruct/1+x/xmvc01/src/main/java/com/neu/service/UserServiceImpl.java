package com.neu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.mapper.UserMapper;
import com.neu.pojo.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	public User getUser(String userName) {
		return userMapper.findUserByName(userName);
	}

	/**
	 * 登录验证方法的实现
	 */
	public boolean isLogin(User user) {
		if(user == null) return false;
		User tmp = getUser(user.getUserName());
		if(tmp == null) return false;
		if(!user.getPassword().equals(tmp.getPassword())) return false;
		return true; //请自行修改代码
	}

	public List<User> getUsers() {
		
		return userMapper.findAll();
	}

}
