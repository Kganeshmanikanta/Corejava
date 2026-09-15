package conditionalstatements;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Marks:");
		int marks=sc.nextInt();
		if(marks>100||marks<=0) {
			System.out.println("Invalid Marks!😒😒");
		}else if ( marks>=92){
			System.out.println("Congrats you got A grade!!😍😍");
			
		}else if(marks>=85) {
			System.out.println("Congrats you got B grade!! You can put a little more effort😊😊");
		}else if(marks<=85 && marks>=75) {
			System.out.println("Congrats you got C grade!!Work more harder😊😊");
		}else if(marks<=74 && marks>=60) {
			System.out.println("Congrats you got D grade!!Study more and work Hard😊😊");
		}else if(marks<=59 && marks>=35) {
			System.out.println("You Just Passed cause I added you marks!!Study more else you will get failed😒😒😒");
		}else {
			System.out.println("You Failed your Exam!!🤣🤣🤣");
		}
		
		sc.close();

	}

}
