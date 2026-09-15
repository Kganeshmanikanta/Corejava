package conditionalstatements;

import java.util.Scanner;

public class TestDemo19 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Avaialble books:");
		int books=sc.nextInt();
		if(books>1000) {
			System.out.println("Whooaa!That's a large Library");
		}else{
			System.out.println("Nice Library");
		}
		sc.close();
	}

}
