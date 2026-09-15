package conditionalstatements;

import java.util.Scanner;

public class TestDemo34 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your bill:");
		double d=sc.nextDouble();
		if(d>=5000) {
			System.out.println("Discount Avaiable!");
		}else{
			System.out.println("No Dicount ");
			System.out.println("Shop more for discount");

		}
		sc.close();

	}

}
