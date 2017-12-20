package com.data.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CacheController {

	@Autowired
	private UnwrapStreetType ust;
	
	@RequestMapping(value = "/test")
	public String test(@RequestParam("stype") String stype, Model model) throws Exception{

		String result = ust.UnWrap(stype);
		model.addAttribute("result", result);
		return "test";
	}
}
