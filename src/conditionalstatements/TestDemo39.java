package conditionalstatements;

import java.util.Scanner;

public class TestDemo39 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter amount:");
		int a=sc.nextInt();
		System.out.println("Are you Premium Member");
		boolean pm=sc.nextBoolean();
		if(a>=21&&pm) {
			System.out.println("Discount Availble!");
		}else{
			System.out.println("No Discount");
		}
		sc.close();


	}

}
