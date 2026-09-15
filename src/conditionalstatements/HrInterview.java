package conditionalstatements;

import java.util.Scanner;

public class HrInterview {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell Me Your Name:");
		String name = sc.nextLine();
		System.out.println("What's your age:");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("Tell Me your Acedamic Percentages:");
			System.out.println("In 10th:");
			float ssc = sc.nextFloat();
			if (ssc >= 75) {
				System.out.println("In Intermediat:");
				float inter = sc.nextFloat();
				if (inter >= 75) {
					System.out.println("In Btech:");
					float btech = sc.nextFloat();
					if (btech >= 75) {
						System.out.println("How Much Experience Do you have?");
						int ex = sc.nextInt();
						if (ex == 0) {
							sc.nextLine();
							System.out.println("Are youFresher?");
							String f = sc.nextLine();

							if (f.equalsIgnoreCase("yes")) {
								System.out.println("How much are you Expecting for this Role?");
								double cp = sc.nextDouble();
								sc.nextLine();
								System.out.println("Are You Willing to Relocate?(yes/no)");
								String rl1 = sc.nextLine();
								System.out.println("We will Get back To you!!");
							} else {

								System.out.println("How much career Gap do you have?");
								int c = sc.nextInt();

								if (c > 2) {
									System.out.println(
											"Sorry we are not considering candidates with " + c + " career gap!");
								} else {
									sc.nextLine();

									System.out.println("Any reasons for the career gap?");
									String cg = sc.nextLine();
									System.out.println("How much are you Expecting for this Role?");
									double cp = sc.nextDouble();
									sc.nextLine();
									System.out.println("Are You Willing to Relocate?(yes/no)");
									String rl1 = sc.nextLine();
									System.out.println("Ok we will get back to you!!");
								}

							}
						} else {
							sc.nextLine();
							System.out.println("Which company did work in " + ex + " years");
							String s = sc.nextLine();

							System.out.println("What is your previous package");
							double pac = sc.nextDouble();

							System.out.println("How much are you Expecting for this Role?");
							double cp = sc.nextDouble();
							sc.nextLine();
							System.out.println("Are You Willing to Relocate?(yes/no)");
							String rl = sc.nextLine();
							if (rl.equalsIgnoreCase("yes")) {
								System.out.println("Does company need's to provide your travel Expences");
								String te = sc.nextLine();
								System.out.println("Ok We Will Get Back To you Shortly!");
							} else {
								System.out.println("Ok We will Get Back to you");
							}
						}
					} else {
						System.out.println("You Must Need 75% or Above 75% ");
						System.out.println("You have " + btech + "% You are not eligible");
					}
				} else {
					System.out.println("You Must Need 75% or Above 75% ");
					System.out.println("You have " + inter + "% You are not eligible");
				}
			} else {
				System.out.println("You Must Need 75% or Above 75% ");
				System.out.println("You have " + ssc + "% You are not eligible");
			}

		} else {
			System.out.println("Sorry " + name + " Your are not eligible");
			System.out.println("You are underage for this Role!");
		}
		sc.close();

	}

}
