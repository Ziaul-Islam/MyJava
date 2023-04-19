package myJava;
import java.util.LinkedList;
import java.util.ArrayList;

public class LinkList {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> t = new LinkedList<Integer>();
		
		t.add(1);
		t.add(9);
		t.addFirst(0);
		
		System.out.println(t);
		
		System.out.println(t.contains(1));
		
		//Checking ArrayList when we don't know about the size of the array 
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 1; i < 10; i++) {
			arr.add(i);
		}
		
		System.out.println("Array List : "+ arr);
		
	}

}
