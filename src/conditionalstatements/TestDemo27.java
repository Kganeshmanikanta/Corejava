package conditionalstatements;

import java.util.Scanner;

public class TestDemo27 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Attendence Percentage:");
		float p=sc.nextFloat();
		if(p>75) {
			System.out.println("You are Eligible For Examinations");
		}else{
			System.out.println("You are not Eligible for Examinations!");
		}
		sc.close();
	}

}
