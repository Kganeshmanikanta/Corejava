package conditionalstatements;

import java.util.Scanner;

public class TestDemo9 {
	public static void main(String[]args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter your Experience:");
		int ex=sc.nextInt();
		if(ex>3) {
			System.out.println("You are Eligible for this Role");
			System.out.println("You can apply");

		}else {
			System.out.println("Sorry you are not eligible for this role");
		}
		sc.close();
		
	}

}
