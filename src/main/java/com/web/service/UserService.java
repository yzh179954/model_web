/**
 * 
 */
package com.web.service;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.bean.User;
//import com.web.dao.UserDao;
import com.web.dao.UserMapper;

/**
 * @author zhihuayang E-mail:425273175@qq.com
 * @date 创建时间：2016年4月25日 下午4:48:42
 * @version 1.0
 * @parameter
 * @return
 */

@Service
public class UserService {

	 @Autowired
	 private UserMapper userMapper;

	public User getUserById(Integer id) {
		User user = new User();
		user.setId(1);
		user.setPassword("ssssssssss");
		user.setUsername("yzh");
//		return user;
		return userMapper.selectByPrimaryKey(id);
	}

}
