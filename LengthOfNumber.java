package com;

public class LengthOfNumber {
  public static void main(String[] args) {
	int num=98136471;
	int count=0;
	int sum=0;
	while(num!=0) {
		int r=num%10;
		num=num/10;
		count++;
		sum=sum+r;
	}
	System.out.println("length :"+count);
	System.out.println("sum :"+sum);
}
}
