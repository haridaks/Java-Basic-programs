package javapackage;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		// 
		HashMap<String,Integer> map = new HashMap<>();
		map.put("CNG", 80);
		map.put("Petrol", 110);
		map.put("Diesel", 90);
		
		System.out.println(map);
		
		for (Entry<String, Integer> e:map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}

}
