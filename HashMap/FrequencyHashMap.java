package com;
/*Write a program to print  occarance of a numbers in an array*/
import java.util.*;
public class FrequencyHashMap {
	public static void main(String[] args) {
		
		HashMap<Integer ,Integer > h=new HashMap();
		
		int[] a= {10,20,30,10,10,20,30,40,50,10,20,30,40,50,10,10};
		
		for(int i  :a) {
			
			if(h.containsKey(i)) {
				int count=h.get(i);
				count++;
				h.put(i, count);
			}
			else {
				h.put(i, 1);
			}
		}
		System.out.println(h);
		
	}

}
