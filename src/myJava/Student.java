package myJava;

public class Student implements Comparable<Student> {
	
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public boolean equals(Student other){
		if (this.name == other.name){
			return true;
		}
		else {
			return false;
		}
	}
	
	public int compareTo(Student other) {
		return this.name.compareTo(other.name);
	}
	
	public String toString() {
		return "I am object of Student Class and my name is "+ this.name;
	}

}
