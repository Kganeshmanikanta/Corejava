package constructor;

import java.util.Scanner;

public class Constructor18 {
	String mobileModel;
	int quantity;
	double price;
	double cost;
	double deliveryCharge;
	double finalBill;

	Constructor18() {
		this(0.0);

	}

	Constructor18(double price) {
		this(price, 0);

	}

	Constructor18(double price, int quantity) {
		this(price, quantity, 0.0);

	}

	Constructor18(double price, int quantity, double deliveryCharge) {
		this.cost = price * quantity;
		this.finalBill=cost+deliveryCharge;
	
	}
	

	public static void main(String[] args) {
		Constructor18 c1 = new Constructor18();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile model:");
		c1.mobileModel = sc.nextLine();
		System.out.println("Enter mobile quantity:");
		c1.quantity = sc.nextInt();
		System.out.println("Enter mobile Price:");
	    c1.price = sc.nextDouble();
		System.out.println("Enter mobile Delivery Charges:");
		c1.deliveryCharge = sc.nextDouble();
		Constructor18 c2 = new Constructor18(c1.price,c1.quantity,c1.deliveryCharge);
		c2.display();


		sc.close();

	}

	 void display() {
		System.out.println(cost);
		System.out.println(finalBill);



	}

}
