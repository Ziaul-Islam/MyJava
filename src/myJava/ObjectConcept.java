package myJava;

public class ObjectConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHello("Zia");

		System.out.println("Add : " + add(2, 3));
	}

	public static void sayHello(String str) {
		System.out.println("Hello! " + str);
	}

	public static int add(int a, int b) {
		int c = 0;
		c = a + b;
		return c;
	}
}
