package conditionalstatements;

import java.util.Scanner;

public class TestDemo24 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your File Size:");
		long re=sc.nextLong();
		if(re>10000000) {
			System.out.println("It's a Large File");
		}else{
			System.out.println("It's a Normal/Small File ");
		}
		sc.close();

	}

}
