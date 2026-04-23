package com;

public class HCF {
public static void main(String[] args) {
	int a=10;
	int b=20;
	int hcf=0;
	for(int i=1;i<=b;i++) {
		if(a%i==0 && b%i==0) {
			hcf=i;
		}
	}
	System.out.println(hcf);
}
}
