package com;

public class FindiFactor {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		for(int i=1; i<=a;i++) {
			if(b%a==0) {
				System.out.println(i);
			}
		}
	}
}
