package day11;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	/*
	 * LL store values in nodes
	 */

	public static void main(String[] args) {
		//LinkedList<Integer> ll = new LinkedList<Integer>();
		
		List<Integer> ll = new LinkedList<Integer>();
		ll.add(23);
		ll.add(26);
		ll.add(67);
		ll.add(23);
		ll.add(79);
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		ll.set(3,100);
		System.out.println(ll);
		
		ll.remove(3);
		System.out.println(ll);
	}

}
