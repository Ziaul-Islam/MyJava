package myJava;

public class Cat extends Dog {

	private int food;

	public Cat(String name, int age, int food) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.food = food;
	}
	public Cat(String name, int age) {
		super(name, age);
		this.food = 50;
	}
	public Cat(String name) {
		super(name, 0);
		this.food = 40;
	}
	public Cat() {
		super("defaultname", 0);
		this.food = 00;
	}
	
	public void speak() {
		System.out.println("My name is "+this.getName()+" ,my age is "+this.getAge()+" ,I eat food type "+this.food+". Meow.");
		System.out.println("Meow ");
		super.speak();
	}
}
