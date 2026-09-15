package conditionalstatements;

import java.util.Scanner;

public class TestDemo33 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Budget:");
		double d=sc.nextDouble();
		if(d>=1000000) {
			System.out.println("you can go for Premium Cars !");
		}else{
			System.out.println("you can go for good cars!");
			

		}
		sc.close();

	}

}
