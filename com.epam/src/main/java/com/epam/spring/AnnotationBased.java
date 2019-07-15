package com.epam.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBased {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//Camera c = (Camera) context.getBean("camera");
		
		iphone ip=(iphone) context.getBean("iphone");
		ip.getCamera();
	}

}
