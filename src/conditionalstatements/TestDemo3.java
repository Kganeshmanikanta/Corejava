package conditionalstatements;

import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Marks:");
		int marks=sc.nextInt();
		if(marks>=40) {
			System.out.println("You Passed the exmination!!");
		}else {
			System.out.println("You Failed the Exam");
		}
		sc.close();

	}

}
