package SwitchCaseStatements;

import java.util.Scanner;

public class Market {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double vegtableBil = 0.0;
		double fruitsbill = 0.0;

		String yn = "";
		do {
			System.out.println("Welcom Please Select from below Category:");
			System.out.println("Vegitables");
			System.out.println("Fuits");
			String cat = sc.next();
			switch (cat.toLowerCase()) {
			case "vegitables" -> {
				String vyn = "";
				do {
					System.out.println("Available:");
					System.out.println("Tomamto");
					System.out.println("Potato");
					System.out.println("Onion");
					System.out.println("Bendakay");
					System.out.println("Dondakay");
					System.out.println("Enter you Choice:");
					String choice = sc.next();
					switch (choice.toLowerCase()) {
					case "tomato" -> {
						System.out.println("Tomatos");
						System.out.println("How many kgs?:");
						double kg = sc.nextDouble();
						vegtableBil += (kg * 65);
					}
					case "potato" -> {
						System.out.println("Potatos");
						System.out.println("How many kgs?:");
						double kg = sc.nextDouble();
						vegtableBil += (kg * 30);
					}
					case "onion" -> {
						System.out.println("Onions");
						System.out.println("How many kgs?:");
						double kg = sc.nextDouble();
						vegtableBil += (kg * 55);
					}
					case "bendakay" -> {
						System.out.println("Bendaya");
						System.out.println("How many kgs?:");
						double kg = sc.nextDouble();
						vegtableBil += (kg * 25);
					}
					case "dondakay" -> {
						System.out.println("Dondakay");
						System.out.println("How many kgs?:");
						double kg = sc.nextDouble();
						vegtableBil += (kg * 40);
					}
					default -> {
						System.out.println("Levu!!");
					}

					}
					System.out.println("Inka Kavala:");
					System.out.println("Y-yes o r N-no");
					vyn = sc.next();

				} while (vyn.equalsIgnoreCase("y"));
				System.out.println("Thanks:" + vegtableBil);
			}
			case "fruits" -> {
				String fyn = "";
				do {
					System.out.println("Available:");
					System.out.println("Apple");
					System.out.println("Banana");
					System.out.println("Grapes");
					System.out.println("Orange");
					System.out.println("Pineapple");
					System.out.println("Enter you Choice:");
					String choice = sc.next();
					switch (choice.toLowerCase()) {
					case "apple" -> {
						System.out.println("Apple");
						System.out.println("How many kgs?:");
						double kg = sc.nextDouble();
						fruitsbill += (kg * 100);
					}
					case "banana" -> {
						System.out.println("Banan");
						System.out.println("How many kgs?:");
						double kg = sc.nextDouble();
						fruitsbill += (kg * 50);
					}
					case "grapes" -> {
						System.out.println("Grapes");
						System.out.println("How many kgs?:");
						double kg = sc.nextDouble();
						fruitsbill += (kg * 75);
					}
					case "orange" -> {
						System.out.println("Orange");
						System.out.println("How many kgs?:");
						double kg = sc.nextDouble();
						fruitsbill += (kg * 55);
					}
					case "pineapple" -> {
						System.out.println("PineApple");
						System.out.println("How many kgs?:");
						double kg = sc.nextDouble();
						fruitsbill += (kg * 130);
					}
					default -> {
						System.out.println("Levu!!");
					}

					}
					System.out.println("Inka Kavala:");
					System.out.println("Y-yes o r N-no");
					fyn = sc.next();

				} while (fyn.equalsIgnoreCase("y"));
				System.out.println("Thanks:" + fruitsbill);
			}

			}
			System.out.println("Want to shop Again?");
			System.out.println("Y-yes or N-no");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));
		System.out.println("Vegitables Bill:" + vegtableBil);
		System.out.println("Fruits Bill:" + fruitsbill);

		System.out.println("Total Bill:" + (vegtableBil + fruitsbill));
		System.out.println("Thanks For Shopping!!");
		sc.close();

	}

}
