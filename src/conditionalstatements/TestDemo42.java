package conditionalstatements;

import java.util.Scanner;

public class TestDemo42 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your battery Percentage:");
		double b=sc.nextDouble();
		if(b>100||b<0) {
			System.out.println("Bro What does even have that much capacity!!!");
		}else {
			if(b<=10) {
				System.out.println("Very Low Battery");
			}else if(b<=20&&b>=11) {
				System.out.println("Low Battery");

			}else if(b<=70&&b>=21) {
				System.out.println("Medium  Battery");

			}else if(b<=99&&b>=71) {
				System.out.println("High  Battery");

			}else if(b==100) {
				System.out.println("Fully Charged!!");

			}
		}
		sc.close();

	}

}
