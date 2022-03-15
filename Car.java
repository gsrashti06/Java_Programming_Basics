
	public class Car {
	int Speed;
    double regularPrice;
	String color;
	public Car(int speed,double regularprice,String color) {
		this.Speed=speed;
		this.regularPrice=regularprice;
		this.color=color;
		}
	public double getSalesPrice() {
		return regularPrice;
	}
}
 class Truck extends Car{
    int weight;
	public Truck(int speed, double regularprice, String color,int weight) {
		super(speed, regularprice, color);
		this.weight=weight;
	}
	public double getSalesPrice() {
		return super.getSalesPrice()*(weight>2000 ? 0.10 : 0.20);
	}
}
 class Ford extends Car{
	int year;
	int manufacturerDiscount;
	public Ford(int speed,double regularprice,String color,int year,int manufacturerDiscount) {
		super(speed,regularprice,color);
		this.year=year;
		this.manufacturerDiscount=manufacturerDiscount;
	}
	public double getSalesPrice() {
		return super.getSalesPrice()- manufacturerDiscount;
	}
}

 class Sedan extends Car{
	int length;
	public Sedan(int speed,double regularprice,String color,int length) {
		super(speed,regularprice,color);
		this.length=length;
		}
	public double getSalesPrice() {
		return super.getSalesPrice()*(length>20 ?0.05 : 0.10);
	}
}

