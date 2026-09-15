package SwitchCaseStatements;

import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double ticketPrice=0.0;
		String yn="";
		do {
			System.out.println("**********MOVIES*********");
			System.out.println("1->Spider Man:Brand New Day");
			System.out.println("2->DC");
			System.out.println("3->Mandadi");
			System.out.println("4->Epic");
			System.out.println("Select Movie:");
			int movie=sc.nextInt();
			switch(movie) {
			case 1->{
				System.out.println("Selected Spider Man:Brand New Day");
				System.out.println("Select Type of Ticket:");
				System.out.println("1->Balcony");
				System.out.println("2->Middle");
				System.out.println("3->Bench");
				int t=sc.nextInt();
				switch(t) {
				case 1->{
					System.out.println("Selected Balcony");
					System.out.println("How Many tickets you want?");
					int tc=sc.nextInt();
					ticketPrice+=(tc*175);

				}
				case 2->{
					System.out.println("Selected Middle ");
					System.out.println("How Many tickets you want?");
					int tc=sc.nextInt();
					ticketPrice+=(tc*150);

				}
				case 3->{
					System.out.println("Selected Bench");
					System.out.println("How Many tickets you want?");
					int tc=sc.nextInt();
					ticketPrice+=(tc*100);

				}
				default->{
					System.out.println("Invaild!");
				}
				}
				
			}
			case 2->{
				System.out.println("Selected DC");
				System.out.println("Select Type of Ticket:");
				System.out.println("1->Balcony");
				System.out.println("2->Middle");
				System.out.println("3->Bench");
				int t=sc.nextInt();
				switch(t) {
				case 1->{
					System.out.println("Selected Balcony");
					System.out.println("How Many tickets you want?");
					int tc=sc.nextInt();
					ticketPrice+=(tc*175);

				}
				case 2->{
					System.out.println("Selected Middle ");
					System.out.println("How Many tickets you want?");
					int tc=sc.nextInt();
					ticketPrice+=(tc*150);

				}
				case 3->{
					System.out.println("Selected Bench");
					System.out.println("How Many tickets you want?");
					int tc=sc.nextInt();
					ticketPrice+=(tc*100);

				}
				default->{
					System.out.println("Invaild!");
				}
				}
				
			}
			case 3->{
				System.out.println("Selected Mandadi");
				System.out.println("Select Type of Ticket:");
				System.out.println("1->Balcony");
				System.out.println("2->Middle");
				System.out.println("3->Bench");
				int t=sc.nextInt();
				switch(t) {
				case 1->{
					System.out.println("Selected Balcony");
					System.out.println("How Many tickets you want?");
					int tc=sc.nextInt();
					ticketPrice+=(tc*175);

				}
				case 2->{
					System.out.println("Selected Middle ");
					System.out.println("How Many tickets you want?");
					int tc=sc.nextInt();
					ticketPrice+=(tc*150);

				}
				case 3->{
					System.out.println("Selected Bench");
					System.out.println("How Many tickets you want?");
					int tc=sc.nextInt();
					ticketPrice+=(tc*100);

				}
				default->{
					System.out.println("Invaild!");
				}
				}
				
			}
			case 4->{
				System.out.println("Selected Epic");
				System.out.println("Select Type of Ticket:");
				System.out.println("1->Balcony");
				System.out.println("2->Middle");
				System.out.println("3->Bench");
				int t=sc.nextInt();
				switch(t) {
				case 1->{
					System.out.println("Selected Balcony");
					System.out.println("How Many tickets you want?");
					int tc=sc.nextInt();
					ticketPrice+=(tc*175);

				}
				case 2->{
					System.out.println("Selected Middle ");
					System.out.println("How Many tickets you want?");
					int tc=sc.nextInt();
					ticketPrice+=(tc*150);

				}
				case 3->{
					System.out.println("Selected Bench");
					System.out.println("How Many tickets you want?");
					int tc=sc.nextInt();
					ticketPrice+=(tc*100);

				}
				default->{
					System.out.println("Invaild!");
				}
				}
				
			}
			
			}
			System.out.println("Do you Want to Continue booking (y-yes or n-no):");
			yn=sc.next();
			
		}while(yn.equalsIgnoreCase("y"));
		System.out.println("Total:"+ticketPrice);
		System.out.println("Thanks for Booking");
		System.out.println("Enjoy your show!");



		
		sc.close();

	}

}
