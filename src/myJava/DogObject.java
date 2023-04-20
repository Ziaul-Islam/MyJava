package myJava;

public class DogObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog tim = new Dog("tim", 9);
		tim.speak();
		Dog bob = new Dog("bob", 4);
		bob.speak();
		Dog jack = new Dog("jack", 1);
		jack.speak();
		
		tim.setAge(3);
		tim.speak();
		System.out.println(Dog.count);
		//both are same static function
		Dog.display();
		tim.display();
		

	}

}

