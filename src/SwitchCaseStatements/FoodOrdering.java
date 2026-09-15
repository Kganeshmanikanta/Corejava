package SwitchCaseStatements;

import java.util.Scanner;

public class FoodOrdering {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double totalPrice=0.0;
		String yn="";
		do {
			System.out.println("Enter food Item:");
			String foodItem=sc.next();
			switch(foodItem.toLowerCase()) {
			case"burger"->{
				System.out.println("You Ordered Burger!!");
				System.out.println("Please Enter Quantity:");
				int quantity=sc.nextInt();
				totalPrice+=(quantity*100);

			}
			case"pizza"->{
				System.out.println("You Ordered Pizza!!");
				System.out.println("Please Enter Quantity:");
				int quantity=sc.nextInt();
				totalPrice+=(quantity*150);

			}
			case"biryani"->{
				System.out.println("You Ordered Biryani!!");
				System.out.println("Please Enter Quantity:");
				int quantity=sc.nextInt();
				totalPrice+=(quantity*180);

			}
			case"firedrice"->{
				System.out.println("You Ordered Fried Rice!!");
				System.out.println("Please Enter Quantity:");
				int quantity=sc.nextInt();
				totalPrice+=(quantity*120);

			}
			case"noodles"->{
				System.out.println("You Ordered Noodles!!");
				System.out.println("Please Enter Quantity:");
				int quantity=sc.nextInt();
				totalPrice+=(quantity*120);

			}
			default->{
				System.out.println("The Item is Not Available!!");
			}
			
			}
			System.out.println("Any Thing Else!! Y-yes or N-no: ");
			yn=sc.next();
		}while(yn.equalsIgnoreCase("y"));
		System.out.println("Thanks for Stopping By!!");
		System.out.println("Your Total Bill is:"+totalPrice);
		sc.close();

	}

}
