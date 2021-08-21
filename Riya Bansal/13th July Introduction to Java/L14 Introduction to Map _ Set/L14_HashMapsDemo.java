package Introduction_to_Programming_In_Java;

import java.util.ArrayList;
import java.util.HashMap;

public class L14_HashMapsDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		//put
		map.put("India", 126); 
		map.put("Sri Lanka", 96);
		map.put("Australia", 122);

		//print HashMap
		System.out.println(map);
		
		//You cannot store duplicate keys in Hashmap. 
		//However, if you try to store duplicate keys with another value, 
		//it will replace the previous value
		map.put("India", 129);
		
		System.out.println(map);
		
		//get
		System.out.println(map.get("India"));
		
		//containsKey
		System.out.println(map.containsKey("West Indies"));
		System.out.println(map.containsKey("Australia"));
		
		//remove
		System.out.println(map.remove("India"));
		System.out.println(map);
		
		//keys in Hashmaps
		
		ArrayList<String> list = new ArrayList<>(map.keySet());
		System.out.println(list);
		
		
	}

}
