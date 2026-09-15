package conditionalstatements;

import java.util.Scanner;

public class TestDemo6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Age:");
		byte age=sc.nextByte();
		if(age>=18) {
			System.out.println("You are "+age+" years old");
			System.out.println("You can apply for Licence");
		}else {
			System.out.println("You are "+age+" years old");
			System.out.println("You can't apply for Licence");
		}
		sc.close();
	}
	

}
