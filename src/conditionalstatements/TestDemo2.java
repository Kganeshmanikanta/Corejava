package conditionalstatements;

import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Time:");
		double time=sc.nextDouble();
		
		if(time==6.01&&time<=7.00) {
			System.out.println("Wake up and Decide weather to sleep more or wake up");
		}else if(time>=7.1&&time<=8.00) {
			System.out.println("Get ready and eat BreakFast");
		}else if(time>=8.01&& time<=9.00) {
			System.out.println("SQL Class");
		}else if(time>=9.01&&time<=10.0) {
			System.out.println("LAB");
		}else if(time>=10.1&&time <=11.00) {
			System.out.println("JAVA Class");
		}else if(time >=11.01 && time <=12.00) {
			System.out.println("2nd LAB");
		}else if(time>=12.01&&time<=13.00) {
			System.out.println("Lunch time");
		}else if(time>=13.01&&time<=14.00) {
			System.out.println("Chill time");
		}else if(time>=14.01&&time<=20.00) {
			System.out.println("Study  time");
		}else if(time>=20.01&&time<=22.00) {
			System.out.println("Dinner and chill time");
		}else {
			System.out.println("Sleep");
		}
		sc.close();

	}

}
