package myJava;

//import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SetList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A hash set is a collection of a unique element
		Set<Integer> t = new HashSet<Integer>();
		t.add(5);
		t.add(7);
		t.add(3);
		t.add(5);
		t.add(9);
		t.add(-8);
		t.remove(9);

		if (t.contains(9)) {
			System.out.println("9 exist");
		} else {
			System.out.println("9 do not exist");
		}
		System.out.println("Size = " + t.size());
		System.out.println(t);

		// Tree set is a hash set in an order
		Set<Integer> tree = new TreeSet<Integer>();
		tree.add(6);
		tree.add(2);
		tree.add(9);
		tree.add(5);
		tree.add(5);
		tree.add(-1);

		System.out.println(tree);

	}

}
