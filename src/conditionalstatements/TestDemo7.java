package conditionalstatements;

import java.util.Scanner;

public class TestDemo7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Speed Limit:");
		int limit=sc.nextInt();
		if(limit<=50) {
			System.out.println("Good Maintain this and Drive Safely ");
		}else {
			System.out.println("Drive Slowly ");
			System.out.println("You are not Salman khan");
		}
		sc.close();

	}

}
