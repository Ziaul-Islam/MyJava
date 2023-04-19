package myJava;

public class Dog {
	//Blueprint of object
	//Private mean the attribute is only accessible within class
	private String name;
	private int age;
	//public accessible 
	public String bread;
	
	//constructor 
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void speak() {
		System.out.println("I am "+ this.name +" and I am "+this.age +" years old. bahu! bahu!");
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public  int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
}
