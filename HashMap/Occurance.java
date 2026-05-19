package com.dcl.requirement;
import java.util.*;
public class Occurance {
	public static void main(String[] args) {
		int[] a= {4,4,4,4,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,6,6,6,6,6,6};
		HashMap<Integer,Integer> h=new HashMap<>();
		for(int x:a) {
			if(h.containsKey(x)) {
				int y=h.get(x);
				y++;
				h.put(x, y);
			}
			else {
				h.put(x,1);
				
			}
			
		}
		System.out.println(h);
		
	}

}
