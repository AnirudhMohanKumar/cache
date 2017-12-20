package com.data.cache;

import org.springframework.beans.factory.annotation.Autowired;

public class UnwrapStreetType {
	
	@Autowired
	private Cache cache;
	
	public String UnWrap(String sTypeAbbr) throws Exception{
		sTypeAbbr = sTypeAbbr.toUpperCase();
		if(cache.containsKey(sTypeAbbr)==false){
			throw new Exception("Invalid Street Type");
		}
		String value = (String) cache.get(sTypeAbbr);
		if(value==null){
			throw new Exception("Internal Error");
		}
		
		return value;
	}
}
