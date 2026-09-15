package conditionalstatements;

import java.util.Scanner;

public class TestDemo40 {

	public static void main(String[] args) {
		int carPrice=20000000;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Budget:");
		double b=sc.nextDouble();
		System.out.println("Loan Status:");
		boolean ls=sc.nextBoolean();
		if(b>=carPrice||ls) {
			System.out.println("You can buy the Car!!");
		}else{
			System.out.println("No you Can't buy the Car!");
			

		}
		sc.close();

	}

}
