package constructor;

public class Constructor15 {

	String carName;
	String model;
	String brand;
	double price;
	double mileage;
	String color;
	int launchYear;
	int seatingCapacity;

	Constructor15() {
	}

	Constructor15(String carName) {
		this(carName, "Unknown");
	}

	Constructor15(String carName, String model) {
		this(carName, model, "Unknown");
	}

	Constructor15(String carName, String model, String brand) {
		this(carName, model, brand, 0.0);
	}

	Constructor15(String carName, String model, String brand, double price) {
		this(carName, model, brand, price, 0.0);
	}

	Constructor15(String carName, String model, String brand, double price, double mileage) {
		this(carName, model, brand, price, mileage, "Unknown");
	}

	Constructor15(String carName, String model, String brand, double price, double mileage, String color) {
		this(carName, model, brand, price, mileage, color, 0);
	}

	Constructor15(String carName, String model, String brand, double price, double mileage, String color,
			int launchYear) {
		this(carName, model, brand, price, mileage, color, launchYear, 0);
	}

	Constructor15(String carName, String model, String brand, double price, double mileage, String color,
			int launchYear, int seatingCapacity) {

		this.carName = carName;
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.mileage = mileage;
		this.color = color;
		this.launchYear = launchYear;
		this.seatingCapacity = seatingCapacity;
	}

	public static void main(String[] args) {

		Constructor15 c1 = new Constructor15();

		Constructor15 c2 = new Constructor15("Swift");

		Constructor15 c3 = new Constructor15("Creta", "SX");

		Constructor15 c4 = new Constructor15("Nexon", "XZ+", "Tata", 1200000.0);

		Constructor15 c5 = new Constructor15("Fortuner", "4x4", "Toyota", 4500000.0, 14.0, "Black", 2024, 7);

		c1.display();
		c2.display();
		c3.display();
		c4.display();
		c5.display();
	}

	void display() {

		System.out.println("Car Name:" + carName);
		System.out.println("Car Model:" + model);
		System.out.println("Car Brand:" + brand);
		System.out.println("Car Price:" + price);
		System.out.println("Car Mileage:" + mileage);
		System.out.println("Car Color:" + color);
		System.out.println("Car Launch Year:" + launchYear);
		System.out.println("Car Seating Capacity:" + seatingCapacity);
		System.out.println("****************************************************");
	}
}