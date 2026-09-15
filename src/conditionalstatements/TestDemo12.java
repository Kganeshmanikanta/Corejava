package conditionalstatements;

import java.util.Scanner;

public class TestDemo12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age>150) {
			System.out.println("You are not Human!!🫠🫠");
		}else {
			if(age>=18) {
				System.out.println("You are a Adult!");
			}else {
				System.out.println("Pilla Mogga!!");
			}
		}
		sc.close();
	}

}
