package com.chanana.service;
import java.util.Comparator;
import com.chanana.entity.Student;

public class SortByAge implements Comparator<Student>{

	@Override
	public int compare(Student obj1, Student obj2) {
		return obj1.getAge() - obj2.getAge();
	}
}


