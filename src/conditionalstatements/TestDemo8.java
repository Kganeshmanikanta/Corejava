package conditionalstatements;

import java.util.Scanner;

public class TestDemo8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your age:");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("You are allowed to the movie");
			System.out.println("Enjoy!");

		}else {
			System.out.println("You are UnderAge");
			System.out.println("Bayataki pora kukaa!!");

		}
		sc.close();
		

	}

}
