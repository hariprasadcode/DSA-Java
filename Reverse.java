package com;

public class Reverse {
public static void main(String[] args) {
	int n=123456;
	int num=0;
	int copy=n;
	while(n!=0) {
		int r=n%10;
		n=n/10;
		num=num*10;
		num=num+r;
	}
	System.out.println(num);
	System.out.println(copy);
	
}
}
