package com.epam.incubation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.*; 

public class Streams {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Set s =list.stream().map(x-> x*x).collect(Collectors.toSet());
		System.out.println(s.size());
		List l= list.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(l);

	}
}
