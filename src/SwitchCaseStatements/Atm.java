package SwitchCaseStatements;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double balance=0.0;
		String yn="";
		do {
			System.out.println("******ATM******");
			System.out.println("1->Check Balance");
			System.out.println("2->Deposit");
			System.out.println("3->Withdraw");
			System.out.println("4-> Exit");
			
			System.out.println("Enter Your Choice:");
			int c=sc.nextInt();
			switch(c) {
			case 1->{
				System.out.println("Your Balance is:"+balance);
			}
			case 2->{
				System.out.println("Enter Deposit Amount:");
				double dep=sc.nextDouble();
				balance+=dep;
				System.out.println("Money Deposited!!");
			
			}
			case 3->{
				System.out.println("Enter Withdrawl Amount:");
				double withdraw=sc.nextDouble();
				if(withdraw>balance) {
					System.out.println("Insufficent Balance!!");
				}else {
					balance-=withdraw;
				}
				
			}
			
			
			case 4->{
				System.out.println("Thank you!!");
				yn="n";
			}
			
			}
			if(!yn.equalsIgnoreCase("n")) {
				System.out.println("To continue Click y-yes");
				System.out.println("To Exit Click n-no");
				yn=sc.next();
				
			}

		}while(yn.equalsIgnoreCase("y"));
		System.out.println("Thanks!!");


		sc.close();

	}

}
