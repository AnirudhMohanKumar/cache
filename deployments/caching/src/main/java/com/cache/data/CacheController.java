package com.cache.data;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CacheController {

	@Autowired
	private Unwrap unwrap;
	@Autowired
	private CacheManager cacheManager;
	
	@RequestMapping(value = "/")
	public String welcome() throws Exception{

		return "index";
	}
	
	@RequestMapping(value = "/test")
	public String test(@RequestParam("sTypeAbbr") String sTypeAbbr, Model model) throws Exception{

		String result = unwrap.unWrapStreetType(sTypeAbbr);
		model.addAttribute("result", result);
		return "test";
	}
	
	@RequestMapping(value = "/reload")
	public String test() throws IOException {

		cacheManager.init();
		return "index";
	}
}
