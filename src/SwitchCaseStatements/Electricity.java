package SwitchCaseStatements;

import java.util.Scanner;

public class Electricity {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the type of Connection:");
		System.out.println("A-->Domestic");
		System.out.println("B-->Commerical");
		String con=sc.next();
		double bill=0.0;
		switch(con){
		case "A"->{
			System.out.println("Enter the No Of Units:");
			double unit=sc.nextDouble();
			if(unit<=100.0) {
				bill+=(unit*2);
			}else if(unit>100 &&unit<300) {
				bill=0.0;
	
			}else if(unit >=300) {
				bill+=(unit*3);
			}
			
			System.out.println("Connection Type:"+con);
			System.out.println("Units Consumed:"+unit);
			if(unit<=100) {
				System.out.println("Rate per unit is:2");
			}else if(unit>100 &&unit<300) {
				System.out.println("Free Electricity!!!");
			}else {
				System.out.println("Rate per unit is:3");
			}
			System.out.println("Bill is:"+bill);
			break;
		}
		case "B"->{
			System.out.println("Enter the No Of Units:");
			double unit=sc.nextDouble();
			if(unit<=100.0) {
				bill+=(unit*4);
			}else if(unit >100&&unit<=300) {
				bill+=(unit*6);
			}else if(unit>300) {
				bill+=(unit*8);	
			}
			System.out.println("Connection Type:"+con);
			System.out.println("Units Consumed:"+unit);
			if(unit<=100) {
				System.out.println("Rate per unit is:4");
			}else if(unit>100&&unit<=300) {
				System.out.println("Rate per unit is:6");
			}else {
				System.out.println("Rate per unit is:8");
			}
			
			System.out.println("For Your Connection Commerical");
			System.out.println("Bill is:"+bill);
			break;
		}
		default ->{
			System.out.println("Invalid Connection!!");
		}
			
		}
		sc.close();

	}

}
