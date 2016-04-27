package com.web.service;
/**
 * 
 *//*
package com.web.dao;

import java.io.Serializable;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

*//**
 * @author  zhihuayang E-mail:425273175@qq.com 
 * @date 创建时间：2016年4月22日 下午2:39:01
 * @version 1.0 
 * @parameter  
 * @return  
*//*

public class MybatisDao extends SqlSessionDaoSupport {
	
	*//**
	 * 保存
	 * @param key
	 * @param object
	 *//*
	public void save(String key,Object object){
		getSqlSession().insert(key,object);
	}
	
	*//**
	 * 通过id删除
	 * @param key
	 * @param id
	 *//*
	public void delete(String key,Serializable id){
		getSqlSession().delete(key,id);
	}
	
	*//**
	 * 通过一个参数获取对象
	 * @param key
	 * @param params
	 * @return
	 *//*
	public <T> T get(String key,Object params){
		return (T)getSqlSession().selectOne(key,params);
	}
	
	*//**
	 * 通过对象key获取列表
	 * @param key
	 * @return
	 *//*
	public <T> List<T> getList(String key){
		return getSqlSession().selectList(key);
	}
	
	
	
	

}
*/