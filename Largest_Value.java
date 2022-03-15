//9
import java.util.Scanner;
public class Largest_Value {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int counter=0;
		int number = 0;
		int largest=0;
		int n;
		System.out.println("Enter the size of the array:");
		n=s.nextInt();
		int ar[]=new int[10];
		System.out.println("Enter the elements");
		for(int i=0;i<10;i++) {
			ar[i]=s.nextInt();
		}
		largest=ar[0];
		for(int i=0;i<10;i++) {
			if(ar[i]>largest) {
				largest=ar[i];	
			}
		}
		System.out.println("Largest Integer is : "+largest);
		}
}
