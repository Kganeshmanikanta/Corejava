package conditionalstatements;

import java.util.Scanner;

public class TestDemo29 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Bike Mileage:");
		float p=sc.nextFloat();
		if(p>50) {
			System.out.println("Good Bike!");
			System.out.println("Using Fuel Efficiently");
		}else{
			System.out.println("Normal Bike");
			System.out.println("Using Fuel Normally");

		}
		sc.close();
	}

}
