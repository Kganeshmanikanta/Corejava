package constructor;

public class Constructor8 {
	String productName;
	long productId;
	double price;
	int quantity;
	boolean available;

	Constructor8() {

	}

	Constructor8(String productName) {
		this(productName, 0);

	}

	Constructor8(String productName, long productId) {
		this(productName, productId, 0.0);

	}

	Constructor8(String productName, long productId, double price) {
		this(productName, productId, price, 0);

	}

	Constructor8(String productName, long productId, double price, int quantity) {
		this(productName, productId, price, quantity, false);

	}

	Constructor8(String productName, long productId, double price, int quantity, boolean available) {
		this.productName = productName;
		this.productId = productId;
		this.price = price;
		this.quantity = quantity;
		this.available = available;

	}

	public static void main(String[] args) {
		Constructor8 p1 = new Constructor8();
		Constructor8 p2 = new Constructor8("Sancks");
		Constructor8 p3 = new Constructor8("Vegitables", 987656789L);
		Constructor8 p4 = new Constructor8("Jeans", 9878909, 599, 4);
		Constructor8 p5 = new Constructor8("shirts", 98767899, 699, 7);
		Constructor8 p6 = new Constructor8("toys", 98778L, 899);
		Constructor8 p7 = new Constructor8("Protein Powder", 599, 1888, 5, true);
		p7.display();
		p6.display();
		p2.display();

	}

	void display() {
		System.out.println("Product Name:" + productName);
		System.out.println("Product Id:" + productId);
		System.out.println("Product price:" + price);
		System.out.println("Product quantity:" + quantity);
		System.out.println("Product avaiablity:" + available);
		System.out.println("*****************************************");

	}

}
