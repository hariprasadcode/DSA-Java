package Com;

import java.util.Arrays;

public class AccesingElementInArrayUsingIndex {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,34,67,9,0,1,60,70,80,90,};
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				a[i]=120;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
