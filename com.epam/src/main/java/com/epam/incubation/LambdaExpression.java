package com.epam.incubation;

import java.awt.List;
import java.util.ArrayList;

interface Calc {
	void calculator(List x);
}

interface Printer {
	void print(String s);
}

public class LambdaExpression {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		// int[] arrr= {1,2,3,4,5,6};
		list.add(5);
		list.add(4);
		list.add(8);
		list.forEach(n -> System.out.println(n));
		Printer p = (s) -> System.out.println("Your string is : " + s);
		p.print("Tom Cruise");

	}
}
