package constructor;

import java.math.BigInteger;

public class Constructors12 {
	String name;
	BigInteger customerId;
	long phoneNumber;
	String email;
	double walletBalance;
	boolean premiumMember;

	Constructors12() {

	}

	Constructors12(String name) {
		this(name, new BigInteger("0"));

	}

	Constructors12(String name, BigInteger customerId) {
		this(name, customerId, 0);
	}

	Constructors12(String name, BigInteger customerId, long phoneNumber) {
		this(name, customerId, phoneNumber, "Unknown");
	}

	Constructors12(String name, BigInteger customerId, long phoneNumber, String email) {
		this(name, customerId, phoneNumber, email, 0.0);
	}

	Constructors12(String name, BigInteger customerId, long phoneNumber, String email, double walletBalance) {
		this(name, customerId, phoneNumber, email, walletBalance, false);
	}

	Constructors12(String name, BigInteger customerId, long phoneNumber, String email, double walletBalance,
			boolean premiumMember) {
		this.name = name;
		this.customerId = customerId;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.walletBalance = walletBalance;
		this.premiumMember = premiumMember;
	}

	public static void main(String[] args) {
		Constructors12 c1 = new Constructors12();
		Constructors12 c2 = new Constructors12("Tom", new BigInteger("654321234"), 987654789506L);
		Constructors12 c3 = new Constructors12("jerry", new BigInteger("654567654"), 8765434567L, "jerry@4323email.com",
				0.0, true);

		c1.display();
		c2.display();
		c3.display();

	}

	void display() {
		System.out.println("Customer Name:" + name);
		System.out.println("Customer Id:" + customerId);
		System.out.println("Customer Phone Number:" + phoneNumber);
		System.out.println("Customer email:" + email);
		System.out.println("Customer Wallet Balance:" + walletBalance);
		System.out.println("Customer PremiumMember?:" + premiumMember);
		System.out.println("*********************************************");

	}

}
