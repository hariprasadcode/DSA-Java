package Com;

public class AccesingDataInArray {
	public static void main(String[] args) {
	
	int[] a= {10,20,30,40,50,60,70,80,90};
	int sum=0;
	for(int x:a) {
		sum=sum+x;
	}
	System.out.println(sum);
	}
}
