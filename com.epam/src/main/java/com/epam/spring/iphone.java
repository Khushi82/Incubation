package com.epam.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class iphone implements Mobile{

	@Autowired
	private Camera camera;
	
	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	@Override
	public void mobileName() {
		System.out.println("You are having iPhone"+camera.getBackCamera());		
	}

}
