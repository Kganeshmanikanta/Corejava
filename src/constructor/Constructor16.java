package constructor;

public class Constructor16 {

	String aeroplaneName;
	String model;
	String brand;
	double price;
	double mileage;
	String color;
	int launchYear;
	int seatingCapacity;

	Constructor16() {
	}

	Constructor16(String aeroplaneName) {
		this(aeroplaneName, "Unknown");
	}

	Constructor16(String aeroplaneName, String model) {
		this(aeroplaneName, model, "Unknown");
	}

	Constructor16(String aeroplaneName, String model, String brand) {
		this(aeroplaneName, model, brand, 0.0);
	}

	Constructor16(String aeroplaneName, String model, String brand, double price) {
		this(aeroplaneName, model, brand, price, 0.0);
	}

	Constructor16(String aeroplaneName, String model, String brand, double price, double mileage) {
		this(aeroplaneName, model, brand, price, mileage, "Unknown");
	}

	Constructor16(String aeroplaneName, String model, String brand, double price, double mileage, String color) {
		this(aeroplaneName, model, brand, price, mileage, color, 0);
	}

	Constructor16(String aeroplaneName, String model, String brand, double price, double mileage, String color,
			int launchYear) {
		this(aeroplaneName, model, brand, price, mileage, color, launchYear, 0);
	}

	Constructor16(String aeroplaneName, String model, String brand, double price, double mileage, String color,
			int launchYear, int seatingCapacity) {

		this.aeroplaneName = aeroplaneName;
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.mileage = mileage;
		this.color = color;
		this.launchYear = launchYear;
		this.seatingCapacity = seatingCapacity;
	}

	public static void main(String[] args) {

		Constructor16 c1 = new Constructor16();

		Constructor16 c2 = new Constructor16("777x");

		Constructor16 c3 = new Constructor16("A350", "A350-900");

		Constructor16 c4 = new Constructor16("A360", "3600", "AirBus", 36000000000.0);

		Constructor16 c5 = new Constructor16("DreamLiner", "789-9", "Boeing", 2500000000.0, 12.0, "White", 2024, 330);

		c1.display();
		c2.display();
		c3.display();
		c4.display();
		c5.display();
	}

	void display() {

		System.out.println("Aeroplane Name:" + aeroplaneName);
		System.out.println("Aeroplane Model:" + model);
		System.out.println("Aeroplane Brand:" + brand);
		System.out.println("Aeroplane Price:" + price);
		System.out.println("Aeroplane Mileage:" + mileage);
		System.out.println("Aeroplane Color:" + color);
		System.out.println("Aeroplane Launch Year:" + launchYear);
		System.out.println("Aeroplane Seating Capacity:" + seatingCapacity);

		System.out.println("****************************************************");
	}
}