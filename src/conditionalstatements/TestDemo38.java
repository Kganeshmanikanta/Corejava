package conditionalstatements;

import java.util.Scanner;

public class TestDemo38 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("Enter your Percentage:");
		float per=sc.nextFloat();
		if(age>=17&&per>=70) {
			System.out.println("Eligible for Admission!");
		}else{
			System.out.println("Not Eligible for Admission");
			

		}
		sc.close();


	}

}
