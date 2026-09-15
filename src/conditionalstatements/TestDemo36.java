package conditionalstatements;

import java.util.Scanner;

public class TestDemo36 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your ATM Card Status:");
		boolean b=sc.nextBoolean();
		if(b) {
			System.out.println("Card Active");
		}else{
			System.out.println("Card Blocked ");
			System.out.println("To unblock go to bank!");

		}
		sc.close();
	}

}
