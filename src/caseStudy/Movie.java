package caseStudy;

public class Movie {
	String movieName;
	String language;
	double ticketPrice;
	Movie(){
		this("Unknown","Unknown",0.0);
	}
//	Movie(String movieName){
//		this(movieName,"Unknown");
//	}
//	Movie(String movieName,String language){
//		this(movieName,language,0.0);
//	}
	Movie(String movieName,String language,double ticketPrice){
		this.movieName= movieName;
		this.language=language;
		this.ticketPrice=ticketPrice;
		
	}
	Movie(Movie m,double ticketPrice){
		this.movieName=m.movieName;
		this.language=m.language;
		this.ticketPrice=ticketPrice;
		
	}

	public static void main(String[] args) {
		Movie m1=new Movie("Mandadi","Tamil",182.8);
		m1.displayMovieDetails();
		Movie m2=new Movie(m1,252.7);
		m2.displayMovieDetails();

		

	}
	void displayMovieDetails() {
		System.out.println("Movie Name:-"+movieName);
		System.out.println("Langugage:-"+language);
		System.out.println("Ticket Price:-"+ticketPrice);
		System.out.println("********************************");

	}

}
