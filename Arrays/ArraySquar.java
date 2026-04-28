
import java.util.*;
public class ArraySquar {


	public static void main(String[] args) {
		int[] a= {20,40,50,60,70};
		for(int i=0;i<=a.length-1;i++) {
			a[i]=a[i]*a[i];
			
		}
		System.out.println(Arrays.toString(a));
	}
}
