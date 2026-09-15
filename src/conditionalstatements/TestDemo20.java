package conditionalstatements;

import java.util.Scanner;

public class TestDemo20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Kilometers?");
		int k=sc.nextInt();
		if(k>100) {
			System.out.println("It's  Long!");
		}else {
			System.out.println("We can go!");
		}
		sc.close();

	}

}
