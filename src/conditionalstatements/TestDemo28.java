package conditionalstatements;

import java.util.Scanner;

public class TestDemo28 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Batting Average:");
		float p=sc.nextFloat();
		if(p>40) {
			System.out.println("Good batsman!");
		}else{
			System.out.println("Average batsman!");
		}
		sc.close();

	}

}
