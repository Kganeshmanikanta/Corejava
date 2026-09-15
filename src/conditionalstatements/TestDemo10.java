package conditionalstatements;

import java.util.Scanner;

public class TestDemo10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quantity:");
		int q=sc.nextInt();
		if(q>10) {
			System.out.println("That's A Bulk Order Wait Until It's Prepared");
		}else{
			System.out.println("Thanks For Ordering");
		}
		sc.close();
	}
	

}
