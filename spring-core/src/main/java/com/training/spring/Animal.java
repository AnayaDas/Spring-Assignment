package com.training.spring;

public class Animal {
	private String name;
	private int age;
	private String color;
	
	public Animal(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public Animal() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public String getAnimalInfo() {
		return this.name+" is "+this.age+" years old "+this.color+" color ";
	}

}
