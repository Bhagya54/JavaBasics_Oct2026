package day11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
/*
 * 1. ArrayList is a class which implements List interface
 * 2. Storing multiple values
 * 3. CRUD
 * 			>Creation - add(value) 
 * 			>Retrival - get(index)
 * 			>Update - set(index,value)
 *          >Delete	- remove
 *  4. Duplicate values can be added
 *  5. Index starts from zero    
 *  6. Following the insertion order    
 */
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(45);
		al.add(32);
		al.add(78);
		al.add(90);
		al.add(32);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println(al);
		
		al.set(2, 100);
		
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);
		
		for(int local:al) {
			System.out.println(local);
		}
		
	}
	
}
