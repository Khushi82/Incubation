package com.epam.incubation;

import java.text.Format;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseString {
	public static void main(String[] args) {

		String str = "reverse";
		char[] arr = new char[20];
		arr = str.toCharArray();
		ArrayList<Character> list = new ArrayList<>();
		for (Character character : arr) {
			list.add(character);
		}
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list.toString());

	}

}
