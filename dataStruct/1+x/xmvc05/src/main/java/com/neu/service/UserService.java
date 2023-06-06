package com.neu.service;

import java.util.List;

import com.neu.pojo.User;

/**
 * 用户管理逻辑类
 * @author Admin
 *
 */
public interface UserService {
	
	/**
	 * 根据用户名，获得一个用户
	 * @param userName 用户名
	 * @return 一个用户
	 */
	public User getUser(String userName);
	
	/**
	 * 根据用户名，获得一个用户
	 * @param userName 用户名
	 * @return 一个用户
	 */
	public User getSingleUser(String id);
	
	/**
	 * 根据用户名和密码判断用户是否登录
	 * @param userName 用户名
	 * @param password 密码
	 * @return true或false
	 */
	public boolean isLogin(User user);
	
	/**
	 * 所有用户信息
	 * @return 所有用户
	 */
	public List<User> getUsers(User user);
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public int addUser(User user);

	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	public int updateUser(User user);
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public int delUser(String id);
}
