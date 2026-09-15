package conditionalstatements;

import java.util.Scanner;

public class TestDemo32 {

	public static void main(String[] args) {
		
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your salary:");
			double d=sc.nextDouble();
			if(d>=25000) {
				System.out.println("Good Salary!");
			}else{
				System.out.println("Normal Salary ");
				System.out.println("Focus on career and learn skills");

			}
			sc.close();

	}

}
