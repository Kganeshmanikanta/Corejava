package constructor;

public class Constructor10 {
	String brand;
	String model;
	int ram;
	long storage;
	double price;
	float screenSize;

	Constructor10() {

	}

	Constructor10(String brand) {
		this(brand, "Unknown");

	}

	Constructor10(String brand, String model) {
		this(brand, model, 0);

	}

	Constructor10(String brand, String model, int ram) {
		this(brand, model, ram, 0);

	}

	Constructor10(String brand, String model, int ram, long storage) {
		this(brand, model, ram, storage, 0.0);

	}

	Constructor10(String brand, String model, int ram, long storage, double price) {
		this(brand, model, ram, storage, price, 0.0f);

	}

	Constructor10(String brand, String model, int ram, long storage, double price, float screenSize) {
		this.brand = brand;
		this.model = model;
		this.ram = ram;
		this.storage = storage;
		this.price = price;
		this.screenSize = screenSize;

	}

	public static void main(String[] args) {
		Constructor10 m1 = new Constructor10();
		Constructor10 m2 = new Constructor10("Vivo", "Y-20", 4, 64, 12000, 6.7f);
		Constructor10 m3 = new Constructor10("Oppo", "A", 4, 64);

		m1.display();
		m2.display();
		m3.display();

	}

	void display() {
		System.out.println("Mobile brand:" + brand);
		System.out.println("Mobile model:" + model);
		System.out.println("Mobile ram:" + ram);
		System.out.println("Mobile storage(GB):" + storage);
		System.out.println("Mobile Price:" + price);
		System.out.println("Mobile Screen Size( in inches):" + screenSize);
		System.out.println("*************************************************8");

	}

}
