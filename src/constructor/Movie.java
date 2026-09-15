package constructor;

public class Movie {
	String director;
	String productionHouse;
	String hero;
	String heroine;
	String villan;
	double budget;

	Movie() {

	}

	Movie(Movie m, double budget) {
		this.budget = budget;
		this.villan = m.villan;
		this.heroine = m.heroine;
		this.director = m.director;
		this.productionHouse = m.productionHouse;
		this.hero = m.hero;

	}

	Movie(Movie m, String villan, String heroine) {
		this.villan = villan;
		this.heroine = heroine;
		this.director = m.director;
		this.productionHouse = m.productionHouse;
		this.hero = m.hero;

	}

	Movie(Movie m, String hero) {
		this.hero = hero;
		this.director = m.director;
		this.productionHouse = m.productionHouse;

	}

	Movie(String director, String productionHouse) {
		this.director = director;
		this.productionHouse = productionHouse;
	}

	public static void main(String[] args) {
		Movie m1 = new Movie();
		m1.movieInfo();
		Movie m2 = new Movie("Mehar nolan", "Sitara");
		m2.movieInfo();
		Movie m3 = new Movie(m2, "Mahesh Babu");
		m3.movieInfo();
		Movie m4 = new Movie(m3, "Pruthvi Raj", "Priyanka Chopra");
		m4.movieInfo();
		Movie m5 = new Movie(m4, 1700);
		m5.movieInfo();

	}

	void movieInfo() {
		System.out.println("Director of Movie:" + director);
		System.out.println("Production House for the Movie:" + productionHouse);
		System.out.println("Hero of Movie:" + hero);
		System.out.println("Villan of Movie:" + villan);
		System.out.println("Heroine of the Movie:" + heroine);
		System.out.println("Budget of Movie:" + budget);
		System.out.println("*********************************************");
	}

}
