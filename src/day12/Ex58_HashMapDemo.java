package day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex58_HashMapDemo {
/*
 * HashMap is a class implements Map interface
 * store multiple elements
 * key and value pair
 * >we can have duplicate values
 * >we cannot have duplicate keys. It acts as an update operation
 * if we try to duplicate the key
 * CRUD
 * Creation - put
 * Retrieval - get(key)
 * Update - same key mapping to a different - duplicate key 
 * It does not follow order of insertion
 */
	public static void main(String[] args) {
		Map<Integer,String> hm = new HashMap<>();
		hm.put(1,"abc");
		hm.put(2,"xyz");
		hm.put(3,"abc");
		hm.put(12,"ghy");
		hm.put(4,"hjhk");
				
		System.out.println(hm);
		hm.put(1, "qwe");//updation
		System.out.println(hm);

		//keys and retrieve the value
		System.out.println(hm.get(2));
		
		hm.remove(3);
		System.out.println(hm);
		System.out.println(hm.get(3));
		
		//verify a key is present or not
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsValue("ghydfdsf"));
		
		//get all the keys
		Set<Integer> allKeys=hm.keySet();
		for(Integer key:allKeys) {
			//System.out.println(key);
			System.out.println("Key: " + key + " Value: " + hm.get(key));
		}
		
		
	}

}
