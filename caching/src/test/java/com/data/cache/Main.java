package com.data.cache;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {

		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-web-servlet.xml");
		UnwrapStreetType ust = ctx.getBean("unWrapStreetType", UnwrapStreetType.class);
		System.out.println(ust.UnWrap("ST"));
	}

}
