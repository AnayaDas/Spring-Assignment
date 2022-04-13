package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	//private Car car;
	@Autowired
	private Animal animal;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	public String getCarDetails() {
		return car.getCarDetails();
		
	}*/
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public String getAnimalInfo() {
		return firstName+" "+lastName+" is "+age+" years old and have a pet named "+animal.getName()+"\n"+animal.getAnimalInfo();
	}
	

}
