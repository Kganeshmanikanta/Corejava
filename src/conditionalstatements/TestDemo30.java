package conditionalstatements;

import java.util.Scanner;

public class TestDemo30 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Temperature:");
		float p=sc.nextFloat();
		if(p>35) {
			System.out.println("Very Hot!");
			System.out.println("Don't Come out stay hidrated");
		}else{
			System.out.println("Normal day");
			System.out.println("good weather");

		}
		sc.close();
	}

}
