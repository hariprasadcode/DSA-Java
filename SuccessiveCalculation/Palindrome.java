package com;

public class Palindrome {
public static void main(String[] args) {
	int n=121;
	int copy=n;
	int num=0;
	while(n!=0) {
		int r=n%10;
		n=n/10;
		
		num=num*10;
		num=num+r;
	}
	System.out.println(num);
	if(copy==num) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not Palindrome");
	}
}
}
