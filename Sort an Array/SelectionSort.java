import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a= {50,40,30,20,10};
		
		int i,j;
		for(i=0;i<=a.length-1;i++) {
			a[i]=a[i]*a[i];
		
		
		for(i=0;i<=a.length-1;i++) {
			
			for(j=i+1;j<=a.length-1;j++) {
				if(a[i]>a[j]) {
					
					a[i]=a[i]*a[i];
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				
				}
			}
		}
		}
		System.out.println(Arrays.toString(a));
		
	}
}
