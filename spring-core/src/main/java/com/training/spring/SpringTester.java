package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTester {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Applicationcontext.xml");
		
		Person p = (Person)context.getBean("person");
		//Car c = (Car)context.getBean("car");
		Cat cat = (Cat)context.getBean("cat");
		Dog dog = (Dog)context.getBean("dog");

		
		System.out.println("First Name : "+p.getFirstName());
		System.out.println("Last Name : "+p.getLastName());
		System.out.println("Age : "+p.getAge());
		
		/*System.out.println("Makers Name: "+c.getMake());
		System.out.println("Model: "+c.getModel());
		System.out.println("Year : "+c.getYear());*/
		
		System.out.println(cat.getAnimalInfo());
		System.out.println(dog.getAnimalInfo());
		System.out.println(p.getAnimalInfo());
		
	//	System.out.println("The Animal details are: "+p.getAnimalInfo());
		


		
	}

}
