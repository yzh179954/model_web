/**
 * 
 */
package com.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	
	private static final Logger log=Logger.getLogger(TestController.class);
	
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public String test1(){
		return "test....";
	}

}
