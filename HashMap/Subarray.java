/*write a program to print true if subarray  sum==k else false */
package com;

import java.util.*;
public class Subarray {

	public static void main(String[] args) {
		int[] a= {10,40,-10,80,-10,20,60,20,10};
		
		HashMap<Integer ,Integer> h=new HashMap<>();
		int i=1;
		int sum=0;
		int k=80;
		for(int x :a) {
			sum=sum+x;
			if(h.containsValue(sum-k)) {
				System.out.println("true");
				return;
			}
			else {
				h.put(i,sum);
				i++;
			}
		}
		System.out.println("False");
	}
}
