package caseStudy;

public class BankAccount {
	long accountNumber;
	String customerName;
	double balance;

	double deposit(double amount){
		return balance+=amount;
		
	}
	double withdraw(double drawnAmount) {
		return balance-=drawnAmount;
		
	}
	void transfer(BankAccount account,double amount){
		balance-=amount;
		account.balance+=amount;
	}
	double calculateInterest(int rate) {
		double interest=(balance*rate)/100;
		return interest;
	}
	
	public static void main(String[] args) {

		BankAccount b1=new BankAccount();
		System.out.println(b1.deposit(500000));
		System.out.println(b1.withdraw(2000));
		System.out.println(b1.calculateInterest(3));
		System.out.println("*******************************");
		BankAccount b2=new BankAccount();
		System.out.println(b2.deposit(700000));
	
		System.out.println(b2.withdraw(2000));
		System.out.println(b2.calculateInterest(6));
		
		System.out.println("*******************************");
		BankAccount b3=new BankAccount();
		b2.transfer(b3, 20000);
		System.out.println(b3.balance);
		System.out.println(b2.balance);

	}

}
