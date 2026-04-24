package com;

import java.util.*;
public class FindKey {
	public static void main(String[] args) {
		
		HashMap<Integer , String> h = new HashMap();
		
		h.put(1, "virat");
		h.put(2, "rohit");
		h.put(3, "dhoni");
		h.put(4, "pandya");
		
		/*if(h.containsKey(1)) {
			System.out.println("present");
		}*/
		
		System.out.println(h.containsKey(1));
		
		
		/*Itterating the hasmmap usinh loop*/
		
		for(Integer i:h.keySet()) {
			System.out.println(i);
			System.out.println(h.get(i));
		}
		
	}

}
