package conditionalstatements;

import java.util.Scanner;

public class TestDemo13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Rating:");
		float r=sc.nextFloat();
		if(r<=2.5) {
			System.out.println("Average to Low!");
		}else {
			System.out.println("Good!");
		}
		
		sc.close();
	}

}
