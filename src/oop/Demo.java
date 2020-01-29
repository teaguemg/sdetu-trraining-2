package oop;

class Person {
	
	String name;
	String email;
	String phone; 
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
		
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
	
	
}
public class Demo {

	public static void main(String[] args) {
		//instantiating an object 
		Person person1 = new Person();
		//defining some properties
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "5138687866";
		//abstraction--  Pulling only the data we need from a class (in this case pulling from class Person)
		person1.walk();
		person1.eat();
		person1.sleep();
		
		
		
		
		
		/*
		// Person 
		
		//Attributes, Variables, adjectives, descriptors 
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "5138687866";
		
		
		//Action, Activity, behavior 
		//System.out.println(name + "is walking");
		//System.out.println(name + "is eating");
		walking(name);
		System.out.println(name + " is eating");
		
		//What if we wanted to do this for another person? 
		String name2 = "Sarah";
		String email2 = "Sarah@testemail.com";
		String phone2 = "5138675309";
		
		
		//Action, Activity, behavior 
		System.out.println(name2 + " is walking");
		System.out.println(name2 + " is eating");
		
		//What about binding attributes and properties together

	}
//enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");
		*/
	}
	
}
