package com;
import java.util.*;
public class HashMapPrefixSum {

	public static void main(String[] args) {
		
		int[] a= {10,20,30,40,50,60,70,80,90};
		
		HashMap<Integer,Integer> h=new HashMap<>();
		
		h.put(0, 0);
		int sum=0;
		int i=1;
		for(int x :a) {
			sum=sum+x;
			h.put(i,sum);
			i++;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(h);
		
	}
}
