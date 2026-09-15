package constructor;

import java.util.Scanner;

public class HostelBill {
	String roomType;
	int noOfDays;
	double roomPrice;
	double foodCharges;
	double totalRoomCost;
	double finalBill;

	HostelBill() {
		this("Unknown");
	}

	HostelBill(String roomType) {
		this(roomType, 0);

	}

	HostelBill(String roomType, int noOfDays) {
		this(roomType, noOfDays, 0.0);

	}

	HostelBill(String roomType, int noOfDays, double roomPrice) {
		this(roomType, noOfDays, roomPrice, 0.0);

	}

	HostelBill(String roomType, int noOfDays, double roomPrice, double foodCharges) {
		this.roomType = roomType;
		this.noOfDays = noOfDays;
		this.roomPrice = roomPrice;
		this.foodCharges = foodCharges;
		totalRoomCost = noOfDays * roomPrice;
		finalBill = totalRoomCost + foodCharges;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HostelBill h1 = new HostelBill();
		h1.display();
		System.out.println("Enter Room Type:");
		String n = sc.nextLine();
		System.out.println("Enter No Of Days:");
		int d = sc.nextInt();
		System.out.println("Enter Room Price:");
		double p = sc.nextDouble();
		System.out.println("Enter Food Charges:");
		double fp = sc.nextDouble();

		HostelBill h3 = new HostelBill(n, d, p, fp);
		h3.display();

		sc.close();

	}

	void display() {
		System.out.println("Room Type:" + roomType);
		System.out.println("Room Price:" + roomPrice);
		System.out.println("No Of Days Staying:" + noOfDays);
		System.out.println("Food Charges :" + foodCharges);
		System.out.println("Room Total Cost:" + totalRoomCost);
		System.out.println("Final Bill:" + finalBill);
		System.out.println("***********************************");

	}

}
