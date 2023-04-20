package myJava;

public class OuterClass {
	public class innerClass{
		public void display() {
			System.out.println("This is a inner class");
		}
	}
	
	public void display() {
		System.out.println("This is a outer class");
	}
	
	public void inner() {
		innerClass in = new innerClass();
		in.display();
		this.display();
	}
	
	public void innerFunc(){
		class innerFunctionClass{
			public void display() {
				System.out.println("This is the class inside a function");
			}
		}
		innerFunctionClass innerObj = new innerFunctionClass();
		innerObj.display();
	}
}
