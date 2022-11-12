
public class Car {
	private String make, model, color;
	private double price, mileage;
	
	
	public Car() {
		mileage = 0;
		make = "Buick";
		model = "Enclave";
		color = "pink";
		price = 13.50;
	}
	
	public Car(String make, String model, String color, double price) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.price = price;
		mileage = 0;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	public void paint(String c) {
		color = c;
	}
	public void displayCarInfo() {
		System.out.println("This car is a " + color + " " + make + " " + model + " with " + mileage + " miles set at a price of $" + price);
	}
	public void travel(double distance) {
		System.out.println("The car is taveling " + distance + " miles");
		mileage = mileage + distance;
	}
	
}
