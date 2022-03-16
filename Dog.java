abstract class Animal
{
	abstract void display();
	void getColor()
	{
		System.out.println("BLUE");
	}
}
public class Dog extends Animal {
     void display() {
    	 System.out.println("HELLO");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Dog s = new Dog();
          s.getColor();
          s.display();
	}

}
