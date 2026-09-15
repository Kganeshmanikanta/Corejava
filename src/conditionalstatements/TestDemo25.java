package conditionalstatements;

import java.util.Scanner;

public class TestDemo25 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Followers :");
		long f=sc.nextLong();
		if(f>10000000) {
			System.out.println("You are a Celebrity");
		}else{
			System.out.println("You are a Normal User ");
		}
		sc.close();
	}

}
