package com.epam.incubation;

import java.util.ArrayList;
import java.util.Collections;

class Student
{
	String name;
	int rollNo;
	public Student(String name,int rollNo) {
		this.name=name;
		this.rollNo = rollNo;
	}
	
	
}
 class SortByRoll implements java.util.Comparator<Student>
 {
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.rollNo - o2.rollNo;
	}
	 
 }
 
 class SortByName implements java.util.Comparator<Student>
 {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}
	 
 }



public class Comparator {
	
	public static void main(String[] args) {
		
		ArrayList<Student> ar= new ArrayList<>();
		ar.add(new Student("John",1));
		ar.add(new Student("tyrion", 2));
		
		System.out.println("Sorting by name");
		Collections.sort(ar, new SortByName());
		for (Student student : ar) {
			System.out.println(student.rollNo+" "+student.name);
		}
		
		
	}
	
	
}
