/**
 * 
 */
package com.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.bean.User;
//import com.web.bean.User;
import com.web.service.UserService;

/**
 * @author  zhihuayang E-mail:425273175@qq.com 
 * @date 创建时间：2016年4月22日 下午4:20:52
 * @version 1.0 
 * @parameter  
 * @return  
*/
@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private UserService userService;
	
	private static final Logger log=Logger.getLogger(TestController.class);
	
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public User test1() throws Exception{
		log.info("server staring....");
//		return "sssssss";
		return userService.getUserById(1);
	}

}
