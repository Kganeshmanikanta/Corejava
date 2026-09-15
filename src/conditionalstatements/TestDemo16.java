package conditionalstatements;

import java.util.Scanner;

public class TestDemo16 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Score:");
		int score=sc.nextInt();
		if(score>=100) {
			System.out.println("Whooo!! You Scored a Century");
		}else {
			System.out.println("Well Played Man!!");
		}
		sc.close();

	}

}
