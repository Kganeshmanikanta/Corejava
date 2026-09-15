package conditionalstatements;

import java.util.Scanner;

public class TestDemo22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Transaction amount:");
		long amount=sc.nextLong();
		if(amount<100000) {
			System.out.println("It's a normal Transaction");
			System.out.println("You can do it by online!");
		}else {
			System.out.println("It's a Big Transaction");
			System.out.println("You can't do it by online!");
			System.out.println("Go to Bank!");
		}
		sc.close();
	}

}
