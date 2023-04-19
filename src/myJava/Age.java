package myJava;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter your age : ");

		try (Scanner sc = new Scanner(System.in)) {
			String age = sc.nextLine();
			int ageNum = Integer.parseInt(age);

			if (ageNum >= 18) {
				System.out.println("You are an Adult");
				System.out.println("Enter your favorate food : ");
				String food = sc.nextLine();
				if (food.equalsIgnoreCase("pizza")) {
					System.out.println("I like pizza too");
				} else {
					System.out.println("Not mine");
				}
			} else if (ageNum >= 13) {
				System.out.println("You are a Teenager");
			} else {
				System.out.println("You are a Kid");
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}