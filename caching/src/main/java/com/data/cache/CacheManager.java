package com.data.cache;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CacheManager {

	private Cache cache;
	Properties prop = null;
	InputStream input = null;
	
	public CacheManager(Cache cache) throws IOException {
		this.cache = cache;
		init();
	}

	private void init() throws IOException{
	prop = new Properties();
	input = getClass().getClassLoader().getResourceAsStream("roi.properties");
	prop.load(input);
		for (Object key : prop.keySet()) {
			cache.put((String)key, prop.getProperty((String) key));
		}
	}
}
