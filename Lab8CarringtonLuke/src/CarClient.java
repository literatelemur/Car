
public class CarClient {

	public static void main(String[] args) {
		Car porsche = new Car("Porsche", "Cayman S", "black", 63800);
		Car nissan = new Car("Nissan", "Leaf", "blue", 29010);
		
		porsche.displayCarInfo();
		nissan.displayCarInfo();
		
		porsche.paint("purple");
		nissan.paint("green");
		
		porsche.travel(12000);
		nissan.travel(8000);
		
		porsche.setPrice(50000);
		nissan.setPrice(24500);
		
		porsche.displayCarInfo();
		nissan.displayCarInfo();

	}

}
