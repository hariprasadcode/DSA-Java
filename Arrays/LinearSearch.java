package Com;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a= {10,30,50,38,78,90,54,80,456,87,};
		int i=0;
		int j=a.length-1;
		int count=0;
		int ele=90;
		for(int x :a) {
			if(x==ele) {
			count++;
			}
		}
		System.out.println(count);
	}

}
