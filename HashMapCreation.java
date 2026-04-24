package com;

//need to import
import java.util.*;
public class HashMapCreation {
	public static void main(String[] args) {
		//hashMap creation
		HashMap<Integer , String> h= new HashMap();
		
		//Inserting 
		h.put(1, "hari");
		h.put(2, "prasad");
		
		//printing the value
		System.out.println(h.get(1));
		System.out.println(h.get(2));
		
		//to see only the key
		System.out.println(h.keySet());
		
		
		//to see the value
		System.out.println(h.values());
		
		
		//to see complet hashmap
		System.out.println(h);
		
	}

}
