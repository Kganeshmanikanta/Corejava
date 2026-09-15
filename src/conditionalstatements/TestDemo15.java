package conditionalstatements;

import java.util.Scanner;

public class TestDemo15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of seats you Want:");
		byte s=sc.nextByte();
		if(s>120) {
			System.out.println("The Max Capacity is 120");
		}else {
			if(s<=120 && s>0) {
				if(s<=30) {
					System.out.println("You can Book Small Bus");
				}else {
					System.out.println("You Can Book Large Bus");
				}
			}
		}
		sc.close();
	}

}
