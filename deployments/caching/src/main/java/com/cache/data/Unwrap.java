package com.cache.data;

import java.util.Properties;

import org.springframework.stereotype.Component;

@Component
public class Unwrap {
	
	public String unWrapStreetType(String sTypeAbbr) throws Exception{
		
		sTypeAbbr = sTypeAbbr.toUpperCase();
		Cache cache = Cache.getInstance(); 
		Properties value = (Properties) cache.get("stype");
		if(value==null){
			throw new Exception("Internal Error");
		}
		
		if(value.containsKey(sTypeAbbr)==false){
			return "invalid";
		}
		
		return value.getProperty(sTypeAbbr);
	}
}
