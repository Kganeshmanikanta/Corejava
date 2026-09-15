package conditionalstatements;

import java.util.Scanner;

public class TestDemo26 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Percentage:");
		float p=sc.nextFloat();
		if(p>35) {
			System.out.println("Good you Passed!");
		}else{
			System.out.println("You failed!");
		}
		sc.close();

	}

}
