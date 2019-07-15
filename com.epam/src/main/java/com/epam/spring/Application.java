package com.epam.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 class xmlBased {
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Mobile mob = (Mobile) context.getBean("samsung");
		System.out.println(mob.getClass());
		
	}

}
