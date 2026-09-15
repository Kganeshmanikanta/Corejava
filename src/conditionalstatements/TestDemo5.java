package conditionalstatements;

import java.util.Scanner;

public class TestDemo5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A Number");
		int n=sc.nextInt();
		if(n>=0) {
			System.out.println("The number is Positive");
			
		}else {
			System.out.println("The number is Negative");
		}
		sc.close();
		
		

	}

}
