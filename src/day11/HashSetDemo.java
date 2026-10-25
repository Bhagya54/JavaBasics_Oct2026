package day11;

import java.util.HashSet;
import java.util.Set;

//ctrl+shift+o
/*
 * HashSet will not allow duplicate values
 * Use a hashing mechanism 
 * Does not follow the insertion order
 * 
 */
public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> ll = new HashSet<Integer>();
		ll.add(23);
		ll.add(26);
		ll.add(67);
		ll.add(23);
		ll.add(79);
		System.out.println(ll);
		
//		for(int index=0;i<ll.size();i++) {
//			System.out.println(ll.get);
//		}
		
		//Enhanced for loop
		for(int value:ll) {
			System.out.println(value);
		}
		
		Set<String> s1 = new HashSet<String>();
		s1.add("hello");
		s1.add("hi");
		s1.add("hi");
		s1.add("selenium");
		s1.add("java");
		
		for(String teju:s1) {
			System.out.println(teju);
		}
		
		ll.remove(23);
		System.out.println(ll);
		
		
	}

}
