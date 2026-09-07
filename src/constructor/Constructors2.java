package constructor;

public class Constructors2 {
	String playerName;
	String country;
	int runs;
	float avg;
	double strikeRate;

	Constructors2() {
		System.out.println("No-Args Constructor Created!!!!!!");
	}

	Constructors2(String playerName, String country) {
		this(playerName, country, 0, 0.0f, 0.0);
	}

	Constructors2(String playerName, String country, int runs) {
		this(playerName, country, runs, 0.0f, 0.0);
	}

	Constructors2(String playerName, String country, int runs, float avg, double strikeRate) {
		this.playerName = playerName;
		this.country = country;
		this.runs = runs;
		this.avg = avg;
		this.strikeRate = strikeRate;
	}

	Constructors2(Constructors2 s) {
		this(s.playerName, s.country, 0, 0.0f, 0.0);
	}

	public static void main(String[] args) {
		Constructors2 p1 = new Constructors2("Ganesh", "India");

		Constructors2 p2 = new Constructors2("Ashutosh", "India", 0);
		Constructors2 p3 = new Constructors2("Rishabh", "India", 5805, 35.61f, 85.46);
		Constructors2 p4 = new Constructors2(p1);

		p1.diplayPlayer();
		p2.diplayPlayer();
		p3.diplayPlayer();
		p4.diplayPlayer();

	}

	void diplayPlayer() {
		System.out.println("Player's Name:" + playerName);
		System.out.println("Player's Country:" + country);
		System.out.println("Player's Total International Runs:" + runs);
		System.out.println("Player's International Average:" + avg);
		System.out.println("Player's International Strike Rate:" + strikeRate);
		System.out.println("****************************************************");

	}

}
