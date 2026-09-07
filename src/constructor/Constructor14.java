package constructor;

public class Constructor14 {
	String bikeName;
	String model;
	double price;
	double milege;
	String color;
	int launchYear;

	Constructor14() {

	}

	Constructor14(String bikeName) {
		this(bikeName, "Unknown");

	}

	Constructor14(String bikeName, String model) {
		this(bikeName, model, 0.0);

	}

	Constructor14(String bikeName, String model, double price) {
		this(bikeName, model, price, 0.0);

	}

	Constructor14(String bikeName, String model, double price, double milege) {
		this(bikeName, model, price, milege, "Unknown");

	}

	Constructor14(String bikeName, String model, double price, double milege, String color) {
		this(bikeName, model, price, milege, color, 0);

	}

	Constructor14(String bikeName, String model, double price, double milege, String color, int launchYear) {
		this.bikeName = bikeName;
		this.model = model;
		this.price = price;
		this.milege = milege;
		this.color = color;
		this.launchYear = launchYear;

	}

	public static void main(String[] args) {
		Constructor14 b1 = new Constructor14();
		Constructor14 b2 = new Constructor14("RX-100!", "98-cc", 900000.0, 40, "Black", 1997);

		b1.display();
		b2.display();

	}

	void display() {
		System.out.println("Bike Name:" + bikeName);
		System.out.println("Bike Model:" + model);
		System.out.println("Bike price:" + price);
		System.out.println("Bike milege:" + milege);
		System.out.println("Bike Color:" + color);
		System.out.println("Bike Launch Year:" + launchYear);
		System.out.println("**********************************");

	}

}
