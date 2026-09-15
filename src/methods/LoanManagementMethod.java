package methods;

import java.util.Scanner;

public class LoanManagementMethod {
	String customerName;
	int loanAmount;
	double interestRate;
	int timeInYears;

	double calculateInterest(int amount, double interestRate, int timeInYears) {
		double rate = (amount * interestRate * timeInYears) / 100;
		return rate;

	}

	double calculateTotalAmount(double rate) {
		double total = loanAmount + rate;
		return total;
	}

	float calculateMonthlyEmi(double total, int timeInYears) {
		float emi = (float) (total / (timeInYears * 12));
		return emi;
	}

	void displayLoanSummary(String customerName, double totalLoan, double emi) {
		System.out.println("Customer Name:" + customerName);
		System.out.println("Customer Total Loan Amount:" + totalLoan);
		System.out.println("Customer's monthly EMI:" + emi);

	}

	public static void main(String[] args) {
		LoanManagementMethod c1 = new LoanManagementMethod();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		c1.customerName = sc.nextLine();

		System.out.println("Enter Your Loan Amount:");
		c1.loanAmount = sc.nextInt();

		System.out.println("Enter Interest Rate:");
		c1.interestRate = sc.nextDouble();

		System.out.println("Enter Time In Years:");
		c1.timeInYears = sc.nextInt();
		sc.nextLine();
		
		System.out.println("*******************************");
		double rate = c1.calculateInterest(c1.loanAmount, c1.interestRate, c1.timeInYears);

		System.out.println("Calculated Interest from the Amount:" + rate);
		double total = c1.calculateTotalAmount(rate);
		System.out.println("Calculated TotalAmount:" + total);
		float emi = c1.calculateMonthlyEmi(total, c1.timeInYears);
		System.out.printf("EMI Needed to Monthly:" + "%.2f%n", emi);
		System.out.println("**********Customer Details**********");
		c1.displayLoanSummary(c1.customerName, total, emi);
		System.out.println("***************************************");
		
		LoanManagementMethod c2 = new LoanManagementMethod();

		System.out.println("Enter Your Name:");
		
		c2.customerName = sc.nextLine();
		

		System.out.println("Enter Your Loan Amount:");
		c2.loanAmount = sc.nextInt();

		System.out.println("Enter Interest Rate:");
		c2.interestRate = sc.nextDouble();

		System.out.println("Enter Time In Years:");
		c2.timeInYears = sc.nextInt();
		System.out.println("*******************************");
		double rate1 = c2.calculateInterest(c2.loanAmount, c2.interestRate, c2.timeInYears);

		System.out.println("Calculated Interest from the Amount:" + rate1);
		double total1 = c2.calculateTotalAmount(rate1);
		System.out.println("Calculated TotalAmount:" + total1);
		float emi1 = c2.calculateMonthlyEmi(total1, c2.timeInYears);
		System.out.printf("EMI Needed to Monthly:" + "%.2f%n", emi1);
		System.out.println("**********Customer Details**********");
		c2.displayLoanSummary(c2.customerName, total1, emi1);


		sc.close();

	}

}
