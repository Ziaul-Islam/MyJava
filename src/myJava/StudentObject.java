package myJava;

public class StudentObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student joe = new Student("joe");
		Student tim = new Student("joe");
		Student bill = new Student("bill");
		
		System.out.println(tim == tim);
		System.out.println(tim == joe);
		System.out.println(tim.equals(joe));
		System.out.println(tim.compareTo(joe));
		System.out.println(tim.compareTo(bill));
		//Print object 
		System.out.println(tim); // auto call tostring 
		System.out.println(tim.toString());
		
	}

}
