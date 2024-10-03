package com.chanana.entity;

public class Student implements Comparable<Student> {
	private int age;
	private String name;
	private String hobby;
	
	public Student() {
		
	}
	
	public Student(int age, String name, String hobby) {
		super();
		this.age = age;
		this.name = name;
		this.hobby = hobby;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public int compareTo(Student s) {
		return (this.age - s.age) == 0 ? this.name.compareTo(s.name) : this.age - s.age;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", hobby=" + hobby + "]";
	}
}
