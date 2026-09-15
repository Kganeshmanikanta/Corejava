package conditionalstatements;

import java.util.Scanner;

public class TestDemo23 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Company revenue:");
		long re=sc.nextLong();
		if(re>10000000) {
			System.out.println("It's a Large Company");
		}else{
			System.out.println("It's a Normal/Small Company ");
		}
		sc.close();
	}

}
