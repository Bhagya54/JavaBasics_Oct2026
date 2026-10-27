package day12;

import java.util.HashMap;
import java.util.Set;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		String str="automation and manual";
		/*
		 * j - 1
		 * a - 2
		 * v - 1
		 */
		HashMap<Character,Integer> hm = new HashMap<>();
		
		
		for(int i=0;i<str.length();i++) {//5<10
			char c=str.charAt(i);//a
			
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
			
		}
		
		Set<Character> allKeys=hm.keySet();
		for(Character key:allKeys) {
			
			System.out.println("Key:" + key + " value: " + hm.get(key));
		}

	}

}
