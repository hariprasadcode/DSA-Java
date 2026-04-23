package com;

public class Armstrong {
	static int pow(int a , int b) {
		int p=1;
		for(int i=1;i<=b;i++) {
			p=p*a;
		}
		return p;
	}
	
	public static void main(String[] args) {
		int n=153;
		int copy=n;
		int num=0;
		int sum=0;
		int count=0;
		while(n!=0) {
			int r=n%10;
			n=n/10;
			
			num=num*10;
			num=num+r;
			count++;
			sum=sum+pow(r,count);
		}
		System.out.println(num);
		System.out.println(sum);
	}

}
