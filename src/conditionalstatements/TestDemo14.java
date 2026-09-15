package conditionalstatements;

import java.util.Scanner;

public class TestDemo14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No of Days for Leave:");
		int ld=sc.nextInt();
		if(ld>=10) {
			System.out.println("Musukoni Panichey");
		}else {
			System.out.println("Sarle Poo!");
		}
		sc.close();
		

	}

}
