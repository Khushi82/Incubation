package com.epam.spring;

import org.springframework.stereotype.Component;

@Component
public class Nokia implements Mobile{

	@Override
	public void mobileName() {
		System.out.println("You are having Nokia");		
		
	}

}
