package com;

public class CommonFactor {
public static void main(String[] args) {
	int a=12;
	int b=34;
	for(int i=1;i<=b;i++) {
		if(a%i==0 && b%i==0) {
			System.out.println(i);
		}
	}
}
}
