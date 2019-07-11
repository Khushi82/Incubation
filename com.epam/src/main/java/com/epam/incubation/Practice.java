package com.epam.incubation;

import java.util.function.BiFunction;

public class Practice {

	
	static int add(int a , int b)
	{
		return a+b;
		
	}
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> a= Practice::add;
		int r = a.apply(2, 22);
		
	}
	
}
