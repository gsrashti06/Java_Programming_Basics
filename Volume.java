//10
import java.util.Scanner;
public class Volume {

		// TODO Auto-generated method stub


		public static double sphereVolume(double radius) { 
		return (4.0/3.0)* Math.PI * Math.pow (radius,3); 
		}
		public static void main(String[] args) {
		Scanner sc=new Scanner (System.in); 
		double radius=0.0, volume=0.0; 

		System.out.println("Enter Radius:");
		radius=sc.nextInt();
		System.out.printf("Volume = %.3f", sphereVolume(radius));

	}

}
