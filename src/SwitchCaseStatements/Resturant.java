package SwitchCaseStatements;

import java.util.Scanner;

public class Resturant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pcount = 0;
		boolean pizza = false;
		int bcount = 0;
		boolean burger = false;

		int brcount = 0;
		boolean briyani = false;

		int ncount = 0;
		boolean noodles = false;

		int fcount = 0;
		boolean friedRice = false;

		double bill = 0.0;
		String yn = "";
		do {
			System.out.println("**********MENU**********");
			System.out.println("1 -> Pizza ->₹200");
			System.out.println("2 -> Burger ->₹120");
			System.out.println("3 -> Briyani ->₹180");
			System.out.println("4 -> Noodles ->₹100");
			System.out.println("5 -> Fried Rice ->₹100");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1 -> {
				System.out.println("PIZZA");
				System.out.println("Enter Quantity:");
				int q = sc.nextInt();
				bill += q * 200;
				pcount += q;
				pizza = true;
			}
			case 2 -> {
				System.out.println("BURGER");
				System.out.println("Enter Quantity:");
				int q = sc.nextInt();
				bill += q * 120;
				bcount += q;
				burger = true;
			}
			case 3 -> {
				System.out.println("BRIYANI");
				System.out.println("Enter Quantity:");
				int q = sc.nextInt();
				bill += q * 180;
				brcount += q;
				briyani = true;

			}
			case 4 -> {
				System.out.println("NOODLES");
				System.out.println("Enter Quantity:");
				int q = sc.nextInt();
				bill += q * 100;
				ncount += q;
				noodles = true;
			}
			case 5 -> {
				System.out.println("FRIED RICE");
				System.out.println("Enter Quantity:");
				int q = sc.nextInt();
				bill += q * 100;
				fcount += q;
				friedRice = true;
			}
			default -> {
				System.out.println("Selected Item is Not Available!");
			}

			}
			System.out.println("Want to Order Again!");
			System.out.println("Click :Y-yes or N-no");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));
		if (pizza) {
			System.out.println("PIZZA - x" + pcount + " -₹" + (pcount * 200));

		}
		if (burger) {
			System.out.println("Burger - x" + bcount + " -₹" + (bcount * 120));

		}
		if (briyani) {
			System.out.println("Briyani - x" + brcount + " -₹" + (brcount * 180));

		}
		if (noodles) {
			System.out.println("Noodles - x" + ncount + " -₹" + (ncount * 100));

		}
		if (friedRice) {
			System.out.println("Fried Rice - x" + fcount + " -₹" + (fcount * 100));

		}
	
		System.out.println("***************************");
		System.out.println("Total Bill:" + bill);
		sc.close();

	}

}
