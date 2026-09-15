package conditionalstatements;

import java.util.Scanner;

public class TestVotingEligibility {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your age:");
		 int age=sc.nextInt();
		 if(age>=18) {
			 System.out.println("You are Eligible For Voting");
		 }else {
			 System.out.println("Pillalu ra Meeru!!😏😏");
		 }
		sc.close();

	}

}
