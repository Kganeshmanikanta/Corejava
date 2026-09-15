package conditionalstatements;

import java.util.Scanner;

public class TestDemo43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age:");
		int age = sc.nextInt();
		if(age<0) {
			System.out.println("Invalid Age");
		}else {
			if (age >= 18) {
				System.out.println("You Eligible for Voting!");
				System.out.println("Enter Your VoterId:");
				int vi = sc.nextInt();
				System.out.println("Select Your Candidate:");
				System.out.println("Jagan -1");
				System.out.println("CBN -2");
				System.out.println("PK -3");
				System.out.println("Lokesh -4");
				System.out.println("Nota-5");
				int c = sc.nextInt();
				if(c<0||c>5) {
					System.out.println("Invalid Candidate!");
				}else {
					if (c == 1) {
						System.out.println("Thanks For Voting!");
						System.out.println("You Voted For Jagan");
					} else if (c == 2) {
						System.out.println("Thanks For Voting!");

						System.out.println("You Voted For CBN");

					} else if (c == 3) {
						System.out.println("Thanks For Voting!");

						System.out.println("You Voted For PK");

					} else if (c == 4) {
						System.out.println("Thanks For Voting!");

						System.out.println("You Voted For Lokesh");

					}else {
						System.out.println("Thanks For Voting!");
						System.out.println("You Voted For Nota");
					}
				}

			} else {
				System.out.println("You are Not Eligible for Voting!!");
			}

		}
		System.out.println("");
		sc.close();

	}

}
