package myJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashAndMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map is the key value pair called as dictionaries or hash table 
		//No order
		
		//Map<String, Integer> m = new HashMap<String, Integer>();
		Map m = new HashMap();
		
		m.put("tim", 5);
		m.put("joe", "x");
		m.put(11, 999);
		m.put(11, 1000);
		
		//System.out.println(m);
		//System.out.println(m.get("tim"));
		
		//System.out.println(m.containsValue(5));
		//System.out.println(m.containsKey(5));
		
		//Here the map order matter 
		Map tm = new TreeMap();
		tm.put("x", 1);
		tm.put("Joe", "Sop");
		tm.put("a", 3);
		
		//System.out.println(tm);
		//System.out.println(m.get("tim"));
		
		
		Map lm = new LinkedHashMap();
		lm.put("x", 1);
		lm.put("Joe", "Sop");
		lm.put("a", 3);
				
		//System.out.println(lm);
		
		Map tempMap = new HashMap();
		String str = "hello my name zia and i am super cool";
				
		for(char ch:str.toCharArray()) {
			if(tempMap.containsKey(ch)) {
				tempMap.put(ch, ((int)tempMap.get(ch) + 1));
			}
			else 
				tempMap.put(ch, 1);
		}
		tempMap.remove(' ');
		//System.out.println(tempMap);
		
		//Sorting
		
		int[] x = {-99,5,3,7,2,1,6,9,0,-1};
		Arrays.sort(x, 1, 7);
		
		for(int i:x) {
			System.out.print(i +",");
		}
	}

}
