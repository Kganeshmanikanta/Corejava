package conditionalstatements;

import java.util.Scanner;

public class TestDemo41 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		if(age>0) {

			if(age<=5) {
				System.out.println("Just a baby!");
			}else if(age<=10&&age>=6){
				System.out.println("Kids");
			}else if(age<=19&&age>=11) {
				System.out.println("Teenagers");
			}else if(age<=59&&age>=20) {
				System.out.println("Adult");
			}else {
				System.out.println("Senior Citizen");
			}
		}
		sc.close();


	}

}
