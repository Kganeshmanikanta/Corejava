package firstjava;

public class MovieTheater {
	int movieId;
	String movieName;
	String heroName;
	int availableSeats;
	static String theaterName="Bharamabha-70MM";
	static String manager="BhAAi";
	
	void displayMovieDetails() {
		System.out.println("Movie Id:-"+movieId);
		System.out.println("Movie Name:-"+movieName);
		System.out.println("Casting :-"+heroName);
		System.out.println("Available Seats :-"+availableSeats);
	}
	void bookTicket() {
		availableSeats--;
		System.out.println("Ticket Booked for :-"+movieName);
		System.out.println("Remaining Seats :-"+availableSeats);

		
	}
	void theaterDetails() {
		System.out.println("Theater Name :-"+theaterName);
		System.out.println("Manager Name :-"+manager);
	}
	void changeManager() {
		manager="Boss";
		System.out.println("Manager has been changed new  manager is:-"+manager);
	}

	public static void main(String[] args) {
		System.out.println("**********Movie details**********");
		MovieTheater movie1=new MovieTheater();
		movie1.movieId=101;
		movie1.movieName="The Paradise";
		movie1.heroName="Natural Star Nani";
		movie1.availableSeats=20;
		movie1.displayMovieDetails();
		movie1.bookTicket();
		movie1.theaterDetails();
		movie1.bookTicket();

		System.out.println();
		
		System.out.println("**********Movie details**********");
		
		MovieTheater movie2=new MovieTheater();
		movie2.movieId=102;
		movie2.movieName="TOXIC ";
		movie2.heroName="Rocking Star YASH";
		movie2.availableSeats=30;
		movie2.displayMovieDetails();
		movie2.bookTicket();
		movie2.theaterDetails();
		
        System.out.println();
		
		System.out.println("**********Movie details**********");
		
		MovieTheater movie3=new MovieTheater();
		movie3.movieId=103;
		movie3.movieName="Fuazi";
		movie3.heroName="Rebal Star Prabhas";
		movie3.availableSeats=40;
		movie3.changeManager();
		movie3.displayMovieDetails();
		movie3.bookTicket();
		movie3.theaterDetails();


	}

}
