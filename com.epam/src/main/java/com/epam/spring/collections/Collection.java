package com.epam.spring.collections;

import java.awt.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Collection {
	
	public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		  
		  ListExample list1= (ListExample) context.getBean("listexample");
		  List list = list1.getResult();
		  System.out.println(list);
		  
	}

}
