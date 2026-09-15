package methods;

import java.util.Scanner;

public class Bank2 {
	static double balance;

	String accountHolderName(String name) {

		return "Account Holder Name:" + name;

	}

	int getAccountNumber(int acc) {
		return acc;
	}

	int getCustomerId(int id) {
		return id;
	}

	int getAge(int age) {
		return age;
	}

	String getAccountType(String type) {
		return type;
	}

	String getBranchName(String branch) {
		return branch;
	}

	String getBankName(String name) {
		return name;
	}

	long getPhoneNumber(long phone) {
		return phone;
	}

	String getEmail(String email) {
		return email;
	}

	String getCity(String city) {
		return city;
	}

	double getBalance(double balance) {
		return balance;
	}

	double getDeposit(double amount) {
		balance=balance+amount;
		return balance;
	}

	double getWithdrawal(double amount) {
		return balance - amount;
	}

	boolean isActive(boolean status) {
		return status;
	}

	String getMessage(String message) {
		return message;
	}

	public static void main(String[] args) {
		Bank2 b = new Bank2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String n = sc.nextLine();
		System.out.println(b.accountHolderName(n));

		System.out.println("Enter Your AccountNumber:");
		int ac = sc.nextInt();
		System.out.println("AccountNumber: " + b.getAccountNumber(ac));

		System.out.println("Enter Your CustomerId:");
		int c_id = sc.nextInt();
		System.out.println("CustomerId: " + b.getCustomerId(c_id));

		System.out.println("Enter Your Age:");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Age: " + b.getAge(age));

		System.out.println("Enter Your Account Type(Saving or 0-Balance):");
		String at = sc.nextLine();
		System.out.println("Account type: " + b.getAccountType(at));

		System.out.println("Enter Your BranchName:");
		String branch = sc.nextLine();
		System.out.println("Branch: " + b.getBranchName(branch));

		System.out.println("Enter Your BankName:");
		String bank = sc.nextLine();
		System.out.println("Bank Name: " + b.getBankName(bank));

		System.out.println("Enter Your PhoneNumber:");
		long ph = sc.nextLong();
		sc.nextLine();
		System.out.println("Phone Number: " + b.getPhoneNumber(ph));

		System.out.println("Enter Your E-mail:");
		String email = sc.nextLine();
		System.out.println("E-mail: " + b.getEmail(email));

		System.out.println("Enter Your City:");
		String city = sc.nextLine();
		System.out.println("City:" + b.getCity(city));
		System.out.println("Your bank balance is:" + b.getBalance(balance));
		System.out.println("Enter Deposit Money:");
		double dep = sc.nextDouble();
		System.out.println("Balance after Deposit:" + b.getDeposit(dep));
         
		System.out.println("Enter withdraw Money:");
		double wd = sc.nextDouble();
		System.out.println("Balance after withdraw:" + b.getWithdrawal(wd));

		System.out.println("Enter Account Status:");
		boolean as = sc.nextBoolean();
		sc.nextLine();
		System.out.println("Account Status:" + b.isActive(as));
		
		
		System.out.println("Enter End Message:");
		String em = sc.nextLine();
		System.out.println(b.getMessage(em));


		
		System.out.println("Main Method Ended");
		sc.close();

	}

}
