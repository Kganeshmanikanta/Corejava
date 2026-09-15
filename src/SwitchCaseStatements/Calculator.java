package SwitchCaseStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Enter First Number:");
			int num1 = sc.nextInt();
			System.out.println("Enter Second Number:");
			int num2 = sc.nextInt();
			System.out.println("Enter the type of operation-(+,-,*,%,/)");
			String op = sc.next();
			switch (op) {
			case "+" -> {
				System.out.println("Sum of two numbers is:" + (num1 + num2));

			}
			case "-" -> {
				System.out.println("Difference of two numbers is:" + (num1 - num2));

			}
			case "*" -> {
				System.out.println("Multiplication of two numbers is:" + (num1 * num2));

			}
			case "%" -> {
				System.out.println("Reminder of two numbers is:" + (num1 % num2));

			}
			case "/" -> {
				System.out.println("Quotient of two numbers is:" + (num1 / num2));

			}
			default -> {
				System.out.println("Invalid Operation!!");
			}
			}
			System.out.println("Do You Want to Continue Y-Yes or N-No:");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));
		System.out.println("Exited Thank You!!");
		sc.close();

	}

}
