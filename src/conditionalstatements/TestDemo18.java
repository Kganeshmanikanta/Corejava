package conditionalstatements;

import java.util.Scanner;

public class TestDemo18 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Population:");
		long p=sc.nextLong();
		if(p>25000) {
			System.out.println("Over Population");
		}else {
			System.out.println("Mainatainable Population");
		}
		sc.close();
	}

}
