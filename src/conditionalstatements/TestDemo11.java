package conditionalstatements;

import java.util.Scanner;

public class TestDemo11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Battery Percentage:");
		float bp=sc.nextFloat();
		if(bp>100.0) {
			System.out.println("It's not Battery What is it a Power Station");
		}else {
			if(bp<=15) {
				System.out.println("Low Battery!!");
				System.out.println("Charge it while you can");
			}else {
				System.out.println(bp+"%"+" -Percent");
			}
		}
		sc.close();

	}

}
