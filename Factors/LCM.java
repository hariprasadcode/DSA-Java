package com;

public class LCM {
public static void main(String[] args) {
	int a=20;
	int b=59;
	int hcf=0;
	for(int i=1;i<=b;i++) {
		if(a%i==0 && b%i==0) {
			hcf=i;
		}
	}
	int lcm=a*b/hcf;
	System.out.println(lcm);
}
}
