package com.chanana.service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.chanana.entity.Student;
import com.chanana.entity.Employee;

public class SortingDemo {

	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<>();
		
		arr.add(new Student(22, "Abhay", "Working Out"));
		arr.add(new Student(21, "Keshav", "Going Out"));
		arr.add(new Student(20, "Rohan", "Making Out"));
		arr.add(new Student(22, "A", "Crying Out"));
		
		System.out.println("Before Sorting: ");
		System.out.println(arr);
		
//		Collections.sort(arr);
//		
//		System.out.println("After Sorting using age and if age is same then through name: ");
//		System.out.println(arr);
		
		System.out.println("Sorted By Age: ");
		Collections.sort(arr, new SortByAge());
		System.out.println(arr);
		
		System.out.println("Sorted By Name: ");
		Collections.sort(arr, new SortByName());
		System.out.println(arr);
		
		
		// Using anonymous inner class
		System.out.println("Sorted By Hobby");
//		Collections.sort(arr,  new Comparator<Student>() {
//			@Override
//			public int compare(Student obj1, Student obj2) {
//				return obj1.getHobby().compareTo(obj2.getHobby());
//			}
//		}
//		);
		
//		System.out.println(arr);
		
		
		// Using Lambda Expressions
		Collections.sort(arr, (obj1, obj2)-> obj1.getHobby().compareTo(obj2.getHobby()));
		System.out.println(arr);
		
	}

}
