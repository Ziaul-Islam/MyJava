package myJava;

public class CarObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ford = new Car();
		ford.display();
		ford.gearUp();
		ford.speedUp(20);
		ford.display();
		ford.gearUp();
		ford.speedUp(20);
		ford.gearUp();
		ford.speedUp(20);
		ford.display();
		ford.gearDown();
		ford.gearDown();
		ford.slowDown(40);
		ford.display();
	}

}
