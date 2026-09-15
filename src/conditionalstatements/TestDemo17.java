package conditionalstatements;

import java.util.Scanner;

public class TestDemo17 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Avaialble Stock:");
		int stock=sc.nextInt();
		if(stock>0) {
			System.out.println("Stock is there!");
		}else {
			System.out.println("Out of Stock");
		}
		sc.close();

	}

}
