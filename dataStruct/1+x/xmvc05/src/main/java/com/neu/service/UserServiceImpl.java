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

	public boolean isLogin(User user) {
		boolean flag=false;
		User u=userMapper.findUserByName(user.getUserName());
		if(u!=null) {
			if(user.getPassword().equals(u.getPassword())) {
				flag=true;
			}
		}
		return flag;
	}

	public List<User> getUsers(User user) {
		
		return userMapper.findAll(user);
	}

	@Override
	public int addUser(User user) {
		// TODO 自动生成的方法存根
		return userMapper.insert(user);
	}

	@Override
	public int updateUser(User user) {
		// 代码编写处
		
		
		return 0; //请自行修改代码
	}

	@Override
	public int delUser(String id) {
		// 代码编写处
		
		
		return 0;//请自行修改代码
	}

	@Override
	public User getSingleUser(String id) {
		// TODO 自动生成的方法存根
		return userMapper.findUserById(id);
	}

}
