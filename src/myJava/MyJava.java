package myJava;

import java.util.Scanner;

public class MyJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println("Hello this is another beginning !");

		// Variable and Datatype

		int hello_world = 5;
		double num2 = 5.0;
		boolean b = false;
		char ch = 'A';
		String str = "My Name is ZIA";

		// System.out.println("Hello world is "+hello_world);
		// System.out.println("Double : "+num2);
		// System.out.println("Boolean :"+b);
		// System.out.println("Character :"+ch);
		// System.out.println("String :"+str);

		// Basic Operation

		// int x;
		// System.out.println("Interger : "+x);
		// x = 6;
		// System.out.println("Interger : "+num2);
		// Explicit conversion
		// num2 = (double)6/hello_world;

		// Scanner
		// System.out.print("Enter your Input : ");
		// Scanner sc = new Scanner(System.in);
		// String scanned = sc.next();
		// int scanNum = sc.nextInt();
		// boolean scanBoolean = sc.nextBoolean();
		// int convert = Integer.parseInt(scanned); // Run time error if not int

		// System.out.println("Input is : "+scanned);
		int k = 6;
		int l = 5;
		int m = 4;
		// > < == >= <= !=

		boolean compare = k > l && l > m;

		// System.out.println(compare);

		// String compare

		String str1 = "Hello";

		// System.out.print(str1.equals("hello"));

		// Conditional statement
		if (str.equals(str1)) {
			// System.out.print("First condition block");
		} else if (str1.equals("hello")) {
			// System.out.print("In else if condition");
		} else if (str1.equalsIgnoreCase("hello")) {
			// System.out.print("Ignore the case");
		} else {
			// System.out.print("Nothing matches");
		}

		// Array
		int[] ar = new int[10];

		int[] nums = { 3, 2, 5, 6 };

		String[] strArr = new String[5];
		strArr[0] = "Jim";
		strArr[1] = "Mike";
		strArr[2] = "Rob";
		strArr[3] = "Matt";
		strArr[4] = "Jack";

		// System.out.println(strArr[3]);

		// Loops
		for (int i = 0; i < strArr.length; i++) {
			// System.out.println(strArr[i]);
		}
		int j = 0;
		while (j < strArr.length) {
			// System.out.println(strArr[j]);
			j++;
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 5) {
				// System.out.println("Found 5 at index "+ i);
			}
		}

		// for each
		for (int element : nums) {
			// System.out.println(element);
		}

		// Runtime entering the array
		/*
		 * 
		 * String[] names = new String[5]; try(Scanner sc = new Scanner(System.in)) {
		 * for(int i = 0; i < names.length; i++) { System.out.print("Enter name "+ (i+1)
		 * +" :"); names[i] = sc.nextLine(); } } catch (NumberFormatException e) {
		 * e.printStackTrace(); } for(String element:names) {
		 * System.out.println(element); if(element.equals("jim")) break; }
		 */

		// While loop
		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("Type a number: "); int
		 * x = sc.nextInt();
		 * 
		 * while(x != 10) { System.out.println("Type 10 ...");
		 * System.out.print("Type a number: "); x = sc.nextInt(); }
		 * System.out.println("While loop ends!");
		 */

		// Do While
		int x = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Type 10 ...");
			System.out.print("Type a number: ");
			x = sc.nextInt();

		} while (x != 10);

		System.out.println("While Loop Ends!");

	}

}
