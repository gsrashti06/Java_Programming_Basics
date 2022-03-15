//11
public class Array_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={0,0,0,0,0,0,0,0,0,0};
		int bonus[];
		bonus=new int[15]; // declaring array bonus with 15 elements
		for(int i=0;i<15;i++)
		{ // adding 1 to each element
		bonus[i]+=1;
		}
		int bestScores[]={10,20,30,40,50}; // declaring the array bestScores of 5 elements
		for (int i=0;i<5;i++){
		System.out.printf("%d\t", bestScores[i]);

		}
	}

}
