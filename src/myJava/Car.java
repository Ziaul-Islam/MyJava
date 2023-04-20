package myJava;

public class Car implements Vehicle {
	
	private int gear;
	private int speed;
	
	public void gearUp() {
		this.gear++;
		System.out.println("Gear changed to "+this.gear);
		
	}
	public void gearDown() {
		this.gear--;
		System.out.println("Gear changed to "+this.gear);
		
	}
	public void slowDown(int change) {
		this.speed -= change;
		System.out.println("Speed changed to "+this.speed);
	}
	public void speedUp(int change) {
		this.speed += change;
		System.out.println("Speed changed to "+this.speed);
	}
	public void display() {
		System.out.println("Car going on "+this.speed +"km/hr and I am in gear "+this.gear);
	}

}
