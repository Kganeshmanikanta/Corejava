package methods;

import java.util.Scanner;

public class Task2 {
	void addition(int a,int b) {
		System.out.println("Addition is:"+(a+b));
	}
	void substraction(int a,int b) {
		System.out.println("Substraction is:"+(a-b));
	}
	void multiplication(int a,int b) {
		System.out.println("Multiplication is:"+(a*b));
	}
	void division(int a,int b) {
		System.out.println("Division is:"+(a/b));
	}
	
	

	public static void main(String[] args) {
		Task2 t=new Task2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers for Addition:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		t.addition(a, b);
		
		System.out.println("Enter Numbers for Substraction:");
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		t.substraction(a1, b1);
		
		System.out.println("Enter Numbers for Multiplication:");
		int a2=sc.nextInt();
		int b2=sc.nextInt();
		t.multiplication(a2, b2);
		
		System.out.println("Enter Numbers for Division:");
		int a3=sc.nextInt();
		int b3=sc.nextInt();
		t.division(a3, b3);


		sc.close();

	}

}
