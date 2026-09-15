package methods;
import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

public class BankingMethod {
	
	static BigDecimal balance=new BigDecimal("9899989987678998765678.9876");
	void displayAccountNumber(BigInteger accountNumber) {
		System.out.println("Accout no:"+accountNumber);
	}
	void displayAccountHolder(String name) {
		System.out.println("Account Holder Name:"+name);
	}
	void displayBalance(BigDecimal balance) {
		System.out.println("Account Balance:"+balance);
	}
	void depositMoney( BigDecimal amount) {
		balance=balance.add(amount);
		System.out.println("Account Balance:"+balance);
	}
	void withdrawMoney(BigDecimal amount) {
		balance=balance.subtract(amount);
		System.out.println("Withdrawn Amount:"+amount);
		System.out.println("Account Balance:"+balance);
		
		
	}
	void checkMinimumBalance(BigDecimal min) {
		if(balance.compareTo(min)<0) {
			System.out.println("Balance is more than minimum balance");
		}else {
			System.out.println("Balance is less than minimum balance");
		}
	}
	void checkWithdrawalLimit( BigDecimal amount) {
		if(amount.compareTo(balance)>0) {
			System.out.println("Amount is high can't withdraw");
		}else {
			System.out.println("Withdraw will be possible");
		}
	}
	void calculateInterest(BigDecimal amount,BigDecimal rate) {
		BigDecimal a=amount.multiply(rate);
		System.out.println("Interest will be:" +a);
	}
	void displayTransaction(String type,BigDecimal amount) {
		System.out.println("Type  of trancation is :"+type);
		System.out.println("amount:"+amount);
	}
	void displayBankDetails(BigInteger acc,String name,BigDecimal balance) {
		System.out.println("Bank Account No:"+acc);
		System.out.println("Accoun Holder Name:"+name);
		System.out.println("Bank Balance:"+balance);
	}

	public static void main(String[] args) {
		BankingMethod b=new BankingMethod();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter BankAccount No:");
		BigInteger accountNumber=sc.nextBigInteger();
		sc.nextLine();
		System.out.println("Enter BankAccount Holder Name:");
		String name=sc.nextLine();
		b.displayAccountNumber(accountNumber);
		b.displayAccountHolder(name);
		
		System.out.println("Enter Deposit Amount:");
		BigDecimal amount1=sc.nextBigDecimal();
		b.depositMoney(amount1);
		
		System.out.println("Enter Withdraw Amount:");
		BigDecimal amount2=sc.nextBigDecimal();
		b.withdrawMoney(amount2);
		
		System.out.println("Trancation Type:");
		String type=sc.next();
		b.displayTransaction(type,amount2 );
		
		
		b.displayBankDetails(accountNumber, name, balance);
		
		System.out.println("For Loan Enter Amount:");
		BigDecimal amount3=sc.nextBigDecimal();
		System.out.println("now Enter Rate of interset");
		BigDecimal rate=sc.nextBigDecimal();
		
		b.calculateInterest(amount3, rate);
		 
		System.out.println("Checking WithDrawing limit");
		b.checkWithdrawalLimit(amount2);
		System.out.println("Cheking minium Balance");
		b.checkMinimumBalance(amount2);
		System.out.println("Your BankBalance Is:-");
		b.displayBalance(balance);
		System.out.println("Thankyou!!!");
		
		sc.close();
		
		

		

		
		

	}

}
