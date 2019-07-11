package com.epam.incubation;

import java.util.*;
import java.util.ArrayList;

public class Java8 {

	public static void main(String[] args) {
		forEachCall();
	}
	private static void forEachCall() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println("List through the forEach ::::");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("List through the iterator ::::");
		Iterator<String> i = list.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}
