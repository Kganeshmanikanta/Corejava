package conditionalstatements;

import java.util.Scanner;

public class TestDemo35 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Ticket Price:");
		double d=sc.nextDouble();
		if(d>=15000) {
			System.out.println("Premium Ticket!");
		}else{
			System.out.println("Normal ticket ");
			

		}
		sc.close();

	}

}
