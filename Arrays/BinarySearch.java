package Com;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70,80,90,100};
		int i=0;
		int j=a.length-1;
		int mid;
		int x=100;
		int index=-1;
		String ans="found";
		while(i<=j) {
			mid=(i+j)/2;
			if(x==a[mid]) {
				index=mid;
				break;
			}
			if(x>a[mid]) {
				i=mid+1;
			}
			else {
				j=mid-1;
			}
			
			
		}
		
		System.out.println( index);
	}
	
	
}
