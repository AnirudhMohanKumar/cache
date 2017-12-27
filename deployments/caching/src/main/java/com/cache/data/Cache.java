package com.cache.data;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

@Component
public class Cache{

	private static Cache instance = new Cache();
	private Map<String,Object> dataMap;
	
	private Cache(){
		dataMap = new ConcurrentHashMap<String,Object>();
	} 
	
	public static Cache getInstance(){
	      return instance;
	   }
	
	public void put(String key,Object value){
	dataMap.put(key,value);
	}
	
	public Object get(String key){
	return dataMap.get(key);
	}
	
	public boolean containsKey(String key){
	return dataMap.containsKey(key);
	}

}
