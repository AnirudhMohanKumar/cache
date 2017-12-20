package com.data.cache;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Cache{

	private Map<String,Object> dataMap;
	
	private Cache() throws IOException{
		dataMap = new ConcurrentHashMap<String,Object>();
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
