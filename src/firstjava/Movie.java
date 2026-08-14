package firstjava;

public class Movie {
	String movieName;
	int ticketPrice;
	int releaseYear;
	
	void display() {
		System.out.println("Movie Name:- "+movieName);
		System.out.println("Release Year:- "+releaseYear);
		System.out.println("Ticket Price  :- "+ticketPrice);


	}
	

	public static void main(String[] args) {
		Movie m= new Movie();
		m.movieName="Puspha:The Rise";
		m.releaseYear=2021;
		m.ticketPrice=300;
		m.display();
		System.out.println("");
		System.out.println("****************************************");
		Movie m1= new Movie();
		m1.movieName="Puspha:The Rule";
		m1.releaseYear=2024;
		m1.ticketPrice=400;
		m1.display();
		System.out.println("");
		System.out.println("****************************************");
		Movie m2= new Movie();
		m2.movieName="Dangal";
		m2.releaseYear=2016;
		m2.ticketPrice=100;
		m2.display();


	}

}
