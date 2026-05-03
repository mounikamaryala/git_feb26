package Assignments;


class Vehicle{
	String brand;
	int speed;
	static String Company ="AutoWorld Ltd";
	String engineType = "Engine type";
	
	Vehicle(String brand, int speed){
		this.brand = brand;
		this.speed = speed;
	}
	
	void display() {
		System.out.println("Brand :"+this.brand);
		System.out.println("Speed :"+ this.speed);
	}
	void run() {
		System.out.println("Vehicle is running");
		
	}
	final void engineType() {
		System.out.println("Engine type :"+ engineType);
	}
	
	void stringManipulation() {
		String reversed = new StringBuilder(brand).reverse().toString();
		System.out.println("Reversed: "+ reversed);
		String replace = this.brand.replaceAll("y", "*");
		 replace = replace.replaceAll("u", "*");
		 replace = replace.replaceAll("a", "*");
		 replace = replace.replaceAll("i", "*");
		 System.out.println("Replaced :"+ replace);
		 System.out.println("Equals " + this.brand+" :"+ brand.contains(brand));
		
	}
}

class Car extends Vehicle {
    String fuelType;

    
    Car(String brand,int speed, String fuelType){
    	super(brand,speed);
    	this.fuelType = fuelType;
    }
	void display() {
		super.display();
		System.out.println("FuelType :"+this.fuelType);
	}
	@Override
	void run() {
		super.run();
		System.out.println("Car is running smoothly");
	}
	
	/*@Override
	void engineType() {
		System.out.println("Car engine");
	}*/
	
	static void displayCompany() {
		
		System.out.println("Company : " + Company);
	}
}

public class Vehicle_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Hyundai",120,"Petrol");
		car.display();
		car.run();
		car.displayCompany();
		car.stringManipulation();
     
	}

}
