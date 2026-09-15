package conditionalstatements;

import java.util.Scanner;

public class TestDemo31 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Bank Balance:");
		double d=sc.nextDouble();
		if(d>=1000) {
			System.out.println("Having Minimum balance !");
			System.out.println("No penality will be implemanted");
		}else{
			System.out.println("Balance is lower than minimum Balance");
			System.out.println("Penality will be implemented");

		}
		sc.close();
	}

}
