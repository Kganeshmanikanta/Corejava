package constructor;

public class Constructor17 {

	String cycleName;
	String model;
	String brand;
	double price;
	String mileage;
	String color;
	int launchYear;
	int seatingCapacity;

	Constructor17() {
	}

	Constructor17(String cycleName) {
		this(cycleName, "Unknown");
	}

	Constructor17(String cycleName, String model) {
		this(cycleName, model, "Unknown");
	}

	Constructor17(String cycleName, String model, String brand) {
		this(cycleName, model, brand, 0.0);
	}

	Constructor17(String cycleName, String model, String brand, double price) {
		this(cycleName, model, brand, price,"Unknown");
	}

	Constructor17(String cycleName, String model, String brand, double price, String mileage) {
		this(cycleName, model, brand, price, mileage, "Unknown");
	}

	Constructor17(String cycleName, String model, String brand, double price, String mileage, String color) {
		this(cycleName, model, brand, price, mileage, color, 0);
	}

	Constructor17(String cycleName, String model, String brand, double price, String mileage, String color,
			int launchYear) {
		this(cycleName, model, brand, price, mileage, color, launchYear, 0);
	}

	Constructor17(String cycleName, String model, String brand, double price, String mileage, String color,
			int launchYear, int seatingCapacity) {

		this.cycleName = cycleName;
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.mileage = mileage;
		this.color = color;
		this.launchYear = launchYear;
		this.seatingCapacity = seatingCapacity;
	}

	public static void main(String[] args) {

		Constructor17 c1 = new Constructor17();

		Constructor17 c2 = new Constructor17("Hero Cycle");

		Constructor17 c3 = new Constructor17("Atlas Cycle", "Gold Line","Atlas",7000,"Infinite");

		Constructor17 c4 = new Constructor17("Hero Cycle", "Ranger", "Hero", 10000.0,"Infinite");

		Constructor17 c5 = new Constructor17("Hercules Cycle", "Roadeo", "Hercules", 12000.0,"Infinite", "Red&Gold", 2017, 5);

		c1.display();
		c2.display();
		c3.display();
		c4.display();
		c5.display();
	}

	void display() {

		System.out.println("Cycle Name:" + cycleName);
		System.out.println("Cycle Model:" + model);
		System.out.println("Cycle Brand:" + brand);
		System.out.println("Cycle Price:" + price);
		System.out.println("Cycle Mileage:" + mileage);
		System.out.println("Cycle Color:" + color);
		System.out.println("Cycle Launch Year:" + launchYear);
		System.out.println("Cycle Seating Capacity:" + seatingCapacity);

		System.out.println("****************************************************");
	}
}