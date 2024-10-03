package com.chanana.service;

import java.util.Comparator;

import com.chanana.entity.Student;

public class SortByName implements Comparator<Student> {
	
	@Override
	public int compare(Student obj1, Student obj2) {
		return obj1.getName().compareTo(obj2.getName());
	}
}
