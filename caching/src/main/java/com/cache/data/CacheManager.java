package com.cache.data;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class CacheManager {

	Properties prop = null;
	InputStream input = null;
	
	@PostConstruct
	public void init() throws IOException{
	prop = new Properties();
	input = getClass().getClassLoader().getResourceAsStream("roi.properties");
	prop.load(input);
	Cache cache = Cache.getInstance(); 
	cache.put("stype", prop);
	input.close();
	}
}
