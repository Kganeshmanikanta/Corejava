package conditionalstatements;

import java.util.Scanner;

public class TestDemo21 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter No of Views:");
		long views=sc.nextLong();
		if(views>1000000) {
			System.out.println("That's a Viral video!!");
			System.out.println("You will be famous");
		}else {
			System.out.println("Wow Very nice video");
			System.out.println("But Not a viral one!");
		}
		sc.close();

	}

}
