package myJava;

public interface Vehicle {
	//Interface you cannot create object.
	
	final int gears = 5;
	
	void speedUp(int a);
	void slowDown(int a);
	void gearUp();
	void gearDown();
}
