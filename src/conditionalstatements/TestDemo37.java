package conditionalstatements;

import java.util.Scanner;

public class TestDemo37 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("Enter your salary:");
		double sal=sc.nextDouble();
		if(age>=21&&sal>=30000) {
			System.out.println("Eligible for loan!");
		}else{
			System.out.println("Not Eligible for loan");
			

		}
		sc.close();

	}

}
