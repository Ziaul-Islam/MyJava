package myJava;

public class CatObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat tim = new Cat("tim", 2, 18);
		tim.speak();
		Cat mic = new Cat("mic", 3);
		mic.speak();
		Cat joe = new Cat("joe");
		joe.speak();
		Cat def = new Cat();
		def.speak();
	}

}
