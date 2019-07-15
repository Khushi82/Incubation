package com.epam.spring;

import org.springframework.stereotype.Component;

@Component
public class Samsung implements Mobile {

	@Override
	public void mobileName() {
		// TODO Auto-generated method stub
		System.out.println("You are having Samsung");		
	}
	

}
