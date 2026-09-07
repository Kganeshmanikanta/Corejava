package constructor;

import java.math.BigInteger;

public class Constructor7 {
	String holderName;
	BigInteger accountNumber;
	String accountType;
	double balance;
	boolean status;
	String branch;

	Constructor7() {
		System.out.println("No-Arg Constructor Called!!!!!");
	}

	Constructor7(String holderName) {
		this.holderName = holderName;
	}

	Constructor7(String holderName, BigInteger accountNumber) {
		this(holderName, accountNumber, "Unknown");

	}

	Constructor7(String holderName, BigInteger accountNumber, String accountType) {
		this(holderName, accountNumber, accountType, 0.0);

	}

	Constructor7(String holderName, BigInteger accountNumber, String accountType, double balance) {
		this(holderName, accountNumber, accountType, balance, false);

	}

	Constructor7(String holderName, BigInteger accountNumber, String accountType, double balance, boolean status) {
		this(holderName, accountNumber, accountType, balance, status, "Unknown");

	}

	Constructor7(String holderName, BigInteger accountNumber, String accountType, double balance, boolean status,
			String branch) {
		this.holderName = holderName;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
		this.status = status;
		this.branch = branch;

	}

	public static void main(String[] args) {
		Constructor7 c1 = new Constructor7();
		Constructor7 c2 = new Constructor7("Tommy");
		Constructor7 c3 = new Constructor7("Jerry", new BigInteger("98765432345678876"));
		Constructor7 c4 = new Constructor7("Spike", new BigInteger("98765432345678998"), "Savings");
		Constructor7 c5 = new Constructor7("Muscle", new BigInteger("98765432345679989"), "0 Balance", 98767.99);
		Constructor7 c6 = new Constructor7("Doom", new BigInteger("98765432345678989"), "0 Balance", 98767.99, true);
		Constructor7 c7 = new Constructor7("Ganesh", new BigInteger("98765432345670599"), "0 Balance", 789809.99, true,
				"V-Cube");

		c1.display();
		c2.display();
		c3.display();
		c4.display();
		c5.display();
		c6.display();
		c7.display();

	}

	void display() {
		System.out.println("Coustomer name:" + holderName);
		System.out.println("Coustomer AccountNumber:" + accountNumber);
		System.out.println("Coustomer Account Type:" + accountType);
		System.out.println("Coustomer Account Balance:" + balance);
		System.out.println("Coustomer Status:" + status);
		System.out.println("Coustomer Branch:" + branch);
		System.out.println("********************************************");

	}

}
