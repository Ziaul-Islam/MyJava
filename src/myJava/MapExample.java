package myJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char enterMore = 'N';
		String key;
		char ch;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		Map m = new HashMap();
		
		do {
			System.out.print("Enter the String for key : ");
			key = sc.nextLine();
			System.out.print("Enter the char to count for value : ");
			ch = sc.next().charAt(0);
			//clear the buffer
			sc.nextLine();
			
			for(int i = 0; i< key.length(); i++) {
				
				if (ch == key.charAt(i)) 
					count++;
				
			}
			
			m.put(key, count);
			count = 0;
			
			System.out.print("Enter N or Y to continue : ");
			enterMore = sc.next().charAt(0);
			//clear the buffer
			sc.nextLine();
			
		}while(Character.toUpperCase(enterMore) == 'Y');
		
		System.out.println(m);
		
		
	}

}